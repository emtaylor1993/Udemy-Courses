Feature: End-to-End Ecommerce Validation

    Application Regression

    @Regression
    Scenario: Ecommerce Products Delivery
    Given I open the Ecommerce page
    When I add items to the cart
    Then Validate the total prices
    Then Select the country, submit and verify thank you message.

    @Smoke
    Scenario: Filling the Form to Shop
    Given I open the Ecommerce page
    When I fill the form details
        | name | gender |
        | Bob  | Male   |
    Then Validate the form behavior
    Then Select the Shop Page