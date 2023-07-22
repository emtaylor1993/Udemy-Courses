from menu import Menu, MenuItem
from coffee_maker import CoffeeMaker
from money_machine import MoneyMachine

is_on = True

coffee_menu = Menu()
coffee_machine = CoffeeMaker()
transaction_machine = MoneyMachine()

while is_on:
    choice = input("What would you like? (espresso/latte/cappuccino): ")
    if choice == "off":
        is_on = False
    elif choice == "report":
        coffee_machine.report()
        transaction_machine.report()
    else:
        drink = coffee_menu.find_drink(choice)
        if drink is not None:
            if coffee_machine.is_resource_sufficient(drink):
                if transaction_machine.make_payment(drink.cost):
                    coffee_machine.make_coffee(drink)
