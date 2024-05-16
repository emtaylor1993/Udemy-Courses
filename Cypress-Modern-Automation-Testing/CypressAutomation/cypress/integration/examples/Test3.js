/// <reference types="Cypress" />

// This test suite will illustrate how to find web elements based on CSS selectors
// and navigate pages using buttons.
describe('My Third Test Suite', function() {
    it('My Third Test Case', function() {
        cy.visit("https://rahulshettyacademy.com/AutomationPractice/")

        // Checkboxes.
        cy.get("#checkBoxOption1").check().should("be.checked").and("have.value", "option1")
        cy.get("#checkBoxOption1").uncheck().should("not.be.checked")
        cy.get("input[type='checkbox']").check(["option2", "option3"])

        // Static Dropdowns.
        cy.get("select").select("option2").should("have.value", "option2")

        // Dynamic Dropdowns.
        cy.get('#autocomplete').type("Ind")
        cy.get(".ui-menu-item div").each(($el, index, $list) => {
            if ($el.text() === "India") {
                cy.wrap($el).click()
            }
        })
        cy.get("#autocomplete").should("have.value", "India")

        // Handling Visible and Invisible Elements.
        cy.get("#displayed-text").should("be.visible")
        cy.get("#hide-textbox").click()
        cy.get("#displayed-text").should("not.be.visible")
        cy.get("#show-textbox").click()
        cy.get("#displayed-text").should("be.visible")

        // Radio Buttons.
        cy.get("[value='radio2']").check().should("be.checked")
    })
})
