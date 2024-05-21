// Used to further optimize Cypress tests. Writing Page Objects as a Design Pattern
// will eliminate the need to constantly change statements when a front end page
// changes. Simply make the one time change here to reflect across the entire test.

// This class represents objects on the home page.

class HomePage {

    getEditBox() {
        return cy.get(':nth-child(1) > .form-control')
    }

    getTwoWayDataBinding() {
        return cy.get(':nth-child(4) > .ng-untouched')
    }

    getGender() {
        return cy.get('#exampleFormControlSelect1')
    }

    getEntrepreneur() {
        return cy.get('#inlineRadio3')
    }

    getShopTab() {
        return cy.get(':nth-child(2) > .nav-link')
    }
}

// Makes class available to all other files in framework.
export default HomePage