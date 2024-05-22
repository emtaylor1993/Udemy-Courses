/// <reference types="Cypress" />
import HomePage from "../pageObjects/HomePage"
import ProductsPage from "../pageObjects/ProductsPage"

// This test suite will illustrate how to handle child windows by using the visit method
// instead of the remove target method.
describe('My Eighth Test Suite', function() {

    // Runs once before all tests in the block.
    before(function() {
        cy.fixture("example").then(function(data) {
            this.data = data
        })
    })
    
    it('My Eighth Test Case', function() {

        // Page Object Design Patterns.
        const homePage = new HomePage()
        const productsPage = new ProductsPage()

        // Environment variables example.
        cy.visit(Cypress.env("url") + "/angularpractice/")
        homePage.getEditBox().type(this.data.name)
        homePage.getGender().select(this.data.gender)

        // Three test validations.
        homePage.getTwoWayDataBinding().should("have.value", this.data.name)
        homePage.getEditBox().should("have.attr", "minlength", "2")
        homePage.getEntrepreneur().should("be.disabled")

        // Overriding a value just for this spec instead of all test cases.
        Cypress.config("defaultCommandTimeout", 8000)

        // Custom commands example.
        homePage.getShopTab().click()
        this.data.productName.forEach(function(element) {
            cy.selectProduct(element)
        })
        
        productsPage.checkOutButton().click()
        var sum = 0

        // Example on how to convert strings to numbers and add those numbers to form
        // a sum. Since these are not Cypress commands, we must manually resolve the
        // promise by using .then().
        cy.get("tr td:nth-child(4) strong").each(($el, index, $list) => {
            const amount = $el.text()
            var res = amount.split(" ")
            res = res[1].trim()
            sum = Number(sum) + Number(res)
        }).then(function() {
            cy.log(sum)
        })

        // Comparing that our calculated sum matches the sum displayed on the web page.
        cy.get("h3 strong").then(function(element) {
            const amount = element.text()
            var res = amount.split(" ")
            var total = res[1].trim()
            expect(Number(total)).to.equal(sum)
        })

        cy.contains("Checkout").click()
        cy.get("#country").type("India")
        cy.get(".suggestions > ul > li > a").click()

        // If elements are being overlapped, you can use force: true.
        cy.get("#checkbox2").click({force: true})

        cy.get("input[type='submit']").click()

        // Shows partial text validation.
        //cy.get(".alert").should("have.text", "Success! Thank you! Your order will be delivered in next few weeks :-).")
        cy.get(".alert").then(function(element) {
            const actualText = element.text()
            expect(actualText.includes("Success")).to.be.true
        })
    })
})
