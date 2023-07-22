MENU = {
    "espresso": {
        "ingredients": {
            "water": 50,
            "coffee": 18,
        },
        "cost": 1.5,
    },
    "latte": {
        "ingredients": {
            "water": 200,
            "milk": 150,
            "coffee": 24,
        },
        "cost": 2.5,
    },
    "cappuccino": {
        "ingredients": {
            "water": 250,
            "milk": 100,
            "coffee": 24,
        },
        "cost": 3.0,
    }
}

resources = {
    "water": 300,
    "milk": 200,
    "coffee": 100,
}

money = 0
running = True

def process_command(command):
    """
    Processes the coffee machine command. Ends the program if "off" is entered,
    prints the list of ingredients and profit if "report" is entered,
    and makes the coffee if a valid choice is made.
    """
    global money
    if command == "off":
        global running
        running = False
    elif command == "report":
        for item in resources:
            if item == "water" or item == "milk":
                print(f"{item.title()}: {resources[item]}ml")
            else:
                print(f"{item.title()}: {resources[item]}g")
        print(f"Money: ${money}")
    else:
        if check_resources(command):
            total = process_coins()
            if total < MENU[command]["cost"]:
                print("Sorry that's not enough money. Money refunded")
                money = 0
            elif total > MENU[command]["cost"]:
                change = round(total - MENU[command]["cost"], 2)
                print(f"Here is ${change} dollars in change.")
                print(f"Here is your {command} ☕️. Enjoy!")
                money += round(total - change, 2)
                make_coffee(command)

def check_resources(drink):
    """
    Returns True if there are enough ingredients to make the order, False otherwise.
    """
    if drink in MENU:
        for ingredient in MENU[drink]["ingredients"]:
            if MENU[drink]["ingredients"][ingredient] > resources[ingredient]:
                print(f"Sorry, there is not enough {ingredient}.")
                return False
        return True
    else:
        print("Invalid choice.")
        return True

def process_coins():
    """
    Calculates and returns the total calculated from coins inserted.
    """
    print("Please insert coins.")
    quarters = float(input("How many quarters?: "))
    dimes = float(input("How many dimes?: "))
    nickles = float(input("How many nickles?: "))
    pennies = float(input("How many pennies?: "))
    total = (quarters * 0.25) + (dimes * 0.10) + (nickles * 0.05) + (pennies * 0.01)
    return total

def make_coffee(coffee):
    """
    Deducts ingredients from the total amount of resources.
    """
    for ingredient in MENU[coffee]["ingredients"]:
        resources[ingredient] -= MENU[coffee]["ingredients"][ingredient]

while running:
    choice = input("What would you like? (espresso/latte/cappuccino): ")
    process_command(choice)