/// <reference types="Cypress" />

// This test suite will illustrate how to handle Alert and Confirm popups, how to
// capture strings from these popups, handling tabs and new domains.
describe('My Fourth Test Suite', function() {
    it('My Fourth Test Case', function() {
        cy.visit("https://rahulshettyacademy.com/AutomationPractice/")

        // Alert and Confirm popup examples.
        cy.get('#alertbtn').click()
        cy.get("[value='Confirm']").click()

        // window:alert example. Fires when your app calls the global window.alert() method.
        // How to verify text on an alert popup.
        cy.on("window:alert", (str) => {
            // Mocha
            expect(str).to.equal("Hello , share this practice page and share your knowledge")
        })

        // window:confirm example. Fires when your app calls the global window.confirm() method.
        // How to verify text on a confirm popup.
        cy.on("window:confirm", (str) => {
            // Mocha
            expect(str).to.equal("Hello , Are you sure you want to confirm?")
        })

        // This removes the opening of a new tab. Causes the new page to open in the current window.
        cy.get("#opentab").invoke("removeAttr", "target").click()

        // If the click opens a new domain, you will get a cross domain error. The code below
        // shows how to handle this. All code in the new domain must be wrapped.
        cy.origin("https://www.qaclickacademy.com", () => {
            cy.get("#navbarSupportedContent a[href*='about']").click()
            cy.get(".mt-50 h2").should("contain", "QAClick Academy")
        })
    })
})
