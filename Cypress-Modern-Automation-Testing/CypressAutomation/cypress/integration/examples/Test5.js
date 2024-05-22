/// <reference types="Cypress" />

// This test suite will illustrate how to handle tables on the web and how to access siblings
// of the current row.
describe('My Fifth Test Suite', function() {
    it('My Fifth Test Case', function() {
        cy.visit(Cypress.env("url") + "/AutomationPractice/")

        // Traverses a web table by selecting the appropriate column number from the parent
        // tr tag, check whether the text of the row contains Python. If it does, grab the price
        // and assert that it equals 25.
        cy.get("tr td:nth-child(2)").each(($el, index, $list) => {
            const text = $el.text()
            if (text.includes("Python")) {
                cy.get("tr td:nth-child(2)").eq(index).next().then(function(price) {
                    const priceText = price.text()
                    expect(priceText).to.equal("25")
                })
            }
        })
    })
})
