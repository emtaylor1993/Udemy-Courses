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

        cy.visit("https://rahulshettyacademy.com/angularpractice/")
        homePage.getEditBox().type(this.data.name)
        homePage.getGender().select(this.data.gender)

        // Three test validations.
        homePage.getTwoWayDataBinding().should("have.value", this.data.name)
        homePage.getEditBox().should("have.attr", "minlength", "2")
        homePage.getEntrepreneur().should("be.disabled")

        // Custom commands example.
        homePage.getShopTab().click()
        this.data.productName.forEach(function(element) {
            cy.selectProduct(element)
        })
        
        productsPage.checkOutButton().click()
    })
})
