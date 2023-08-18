"""
This script returns the number of days in a given month and year.

Author:        E. Taylor
Date Created:  July 19, 2023
Date Modified: August 17, 2023
Dependencies:  None
"""

"""
Takes in a year and returns True if it is a leap year and false
otherwise.
"""
def is_leap(year):
  if year % 4 == 0:
    if year % 100 == 0:
      if year % 400 == 0:
        return True
      else:
        return False
    else:
      return True
  else:
    return False

"""
Takes in a year and a month. Returns the number of days in the month
and checks for February's leap year condition.
"""
def days_in_month(year, month):
  month_days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
  if is_leap(year) and month == 2:
      return 29  
  else:
      return month_days[month - 1]
  
#🚨 Do NOT change any of the code below 
year = int(input("Enter a year: "))
month = int(input("Enter a month: "))
days = days_in_month(year, month)
print(days)