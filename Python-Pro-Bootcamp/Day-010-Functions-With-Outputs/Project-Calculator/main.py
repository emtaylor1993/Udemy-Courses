from art import logo

def add(n1, n2):
  return n1 + n2

def subtract(n1, n2):
  return n1 - n2

def multiply(n1, n2):
  return n1 * n2

def divide(n1, n2):
  return n1 / n2

operations = {
  "+": add,
  "-": subtract,
  "*": multiply,
  "/": divide
}

def calculator():
  print(logo)
  should_continue = "y"
  num1 = float(input("What's the first number?: "))
  
  for operation in operations:
    print(operation)
  
  while should_continue == "y":
    symbol = input("Pick an operation: ")
    num2 = float(input("What's the next number?: "))
    calculation_function = operations[symbol]
    answer = calculation_function(num1, num2)
    print(f"{num1} {symbol} {num2} = {answer}")
    num1 = answer
    should_continue = input(f"Type \"y\" to continue calculating with {answer}, or type \"n\" to start a new calculation.: ")
    if should_continue == "n":
      calculator()

calculator()