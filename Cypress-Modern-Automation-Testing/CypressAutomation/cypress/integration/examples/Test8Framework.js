/// <reference types="Cypress" />

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
        cy.visit("https://rahulshettyacademy.com/angularpractice/")
        cy.get(':nth-child(1) > .form-control').type(this.data.name)
        cy.get('#exampleFormControlSelect1').select(this.data.gender)
        cy.get(':nth-child(4) > .ng-untouched').should("have.value", this.data.name)
        cy.get(':nth-child(1) > .form-control').should("have.attr", "minlength", "2")
        cy.get('#inlineRadio3').should("be.disabled")

        cy.get(':nth-child(2) > .nav-link').click()
        cy.selectProduct("Blackberry")
    })
})
