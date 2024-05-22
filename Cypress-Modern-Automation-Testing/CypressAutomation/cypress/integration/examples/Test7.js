/// <reference types="Cypress" />

// This test suite will illustrate how to handle child windows by using the visit method
// instead of the remove target method.
describe('My Seventh Test Suite', function() {
    it('My Seventh Test Case', function() {
        cy.visit(Cypress.env("url") + "/AutomationPractice/")
        cy.get("#opentab").then(function(e1) {
            const url = e1.prop("href")
            cy.visit(url)
            cy.origin(url, () => {
                cy.get("div.sub-menu-bar a[href*='about']").click()
            })
        })
    })
})
