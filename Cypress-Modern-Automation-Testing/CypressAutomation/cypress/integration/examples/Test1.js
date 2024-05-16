/// <reference types="Cypress" />

// Cypress - Test files are called Specs
// This test suite will illustrate the core concepts and methods of Cypress.
describe('My First Test Suite', function() {
    it('My First Test Case', function() {
        cy.visit("https://rahulshettyacademy.com/seleniumPractise/#/")
        cy.get(".search-keyword").type("ca")
        cy.wait(2000)

        // What's wrong with this statement? Rogue product class!
        cy.get(".product").should("have.length", 5)

        // Selenium get hits the URL in the browser. Cypress get acts like findElement of Selenium.
        cy.get(".product:visible").should("have.length", 4)

        // Parent-Child chaining example. Only look within the products block.
        cy.get(".products").find(".product").should("have.length", 4)

        // Get the second item out of the four, and click the ADD TO CART button.
        cy.get(".products").find(".product").eq(2).contains("ADD TO CART").click()

        // Get the list of products and use a loop to go through each product,
        // save it's text into a variable and check whether the value is Cashews.
        // If it is, click the ADD TO CART button. cy.wrap is used to resolve the
        // $el being a promise.
        cy.get(".products").find(".product").each(($el, index, $list) => {
            const textVeg = $el.find("h4.product-name").text()
            if (textVeg.includes("Cashews")) {
                cy.wrap($el).find("button").click()
            }
        })

        // Assert if logo text is correctly displayed.
        cy.get(".brand").should("have.text", "GREENKART")

        // If you want to use a variable and then extract the text from that variable,
        // you must manually handle the promise.
        cy.get(".brand").then(function(logo) {
            cy.log(logo.text())
        })

        // This will not work. It confuses Cypress.
        // const logo = cy.get(".brand")
        // cy.log(logo.text())

        // Aliasing example.
        cy.get(".products").as("productLocator")
        cy.get("@productLocator").find(".product").should("have.length", 4)
    })
})
