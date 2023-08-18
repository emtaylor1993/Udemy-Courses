"""
This script determines whether a given number is a prime
number.

Author:        E. Taylor
Date Created:  July 18, 2023
Date Modified: August 17, 2023
Dependencies:  math
"""

# Write your code below this line 👇
def prime_checker(number):
    prime = True
    for num in range(2, number):
        if number % num == 0:
            prime = False
    if prime == True:
        print("It's a prime number.")
    else:
        print("It's not a prime number.")
# Write your code above this line 👆
    
#Do NOT change any of the code below👇
n = int(input("Check this number: "))
prime_checker(number=n)