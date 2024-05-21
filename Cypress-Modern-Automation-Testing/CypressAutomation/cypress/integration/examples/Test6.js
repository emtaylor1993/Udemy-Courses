/// <reference types="Cypress" />

// This test suite will illustrate how to handle mouse hover objects with different
// options.
describe('My Sixth Test Suite', function() {
    it('My Sixth Test Case', function() {
        cy.visit("https://rahulshettyacademy.com/AutomationPractice/")

        // Shows an example of using JQuery to show the options of a mouse hover object.
        // It then clicks on it and checks the URL.
        cy.get("div.mouse-hover-content").invoke("show")
        cy.contains("Top").click()
        cy.url().should("include", "top")
    })
})
