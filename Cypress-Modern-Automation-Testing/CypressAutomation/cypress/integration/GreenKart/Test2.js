/// <reference types="Cypress" />

// This test suite will illustrate how to find web elements based on CSS selectors
// and navigate pages using buttons.
describe('My Second Test Suite', function() {
    it('My Second Test Case', function() {
        cy.visit(Cypress.env("url") + "/seleniumPractise/#/")
        cy.get(".search-keyword").type("ca")
        cy.wait(2000)
        cy.get(".products").as("productLocator")
        cy.get("@productLocator").find(".product").each(($el, index, $list) => {
            const textVeg = $el.find("h4.product-name").text()
            if (textVeg.includes("Cashews")) {
                cy.wrap($el).find("button").click()
            }
        })
        cy.get('.cart-icon > img').click()
        cy.contains("PROCEED TO CHECKOUT").click()
        cy.contains("Place Order").click()
    })
})
