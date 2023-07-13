# 🚨 Don't change the code below 👇
age = input("What is your current age? ")
# 🚨 Don't change the code above 👆

#Write your code below this line 👇
age = int(age)
age_difference = 90 - age
days = age_difference * 365
months = age_difference * 12
weeks = age_difference * 52

print(f"You have {days} days, {weeks} weeks, and {months} months left.")