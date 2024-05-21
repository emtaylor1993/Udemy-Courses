// Used to further optimize Cypress tests. Writing Page Objects as a Design Pattern
// will eliminate the need to constantly change statements when a front end page
// changes. Simply make the one time change here to reflect across the entire test.

// This class represents objects on the products page.

class ProductsPage {

    checkOutButton() {
        return cy.get("#navbarResponsive > .navbar-nav > .nav-item > .nav-link")
    }
}

// Makes class available to all other files in framework.
export default ProductsPage