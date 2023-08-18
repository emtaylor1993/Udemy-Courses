"""
This script contains a demonstration of using the smtplib Python module
to send an email.

Author:        E. Taylor
Date Created:  July 29, 2023
Date Modified: August 18, 2023
Dependencies:  datetime, smtplib, random
"""

import datetime as dt
import smtplib
from random import choice

now = dt.datetime.now()
day = now.strftime("%A")
my_email = "python.class.testing@gmail.com"
password = "rcwqwajctcbcqiuh"

with open("quotes.txt", "r") as f:
    lines = f.readlines()

if day == "Monday":
    with smtplib.SMTP("smtp.gmail.com", port=587) as connection:
        connection.starttls()
        connection.login(user=my_email, password=password)
        connection.sendmail(
            from_addr=my_email, 
            to_addrs="python.classtesting@yahoo.com", 
            msg=f"Subject:Motivation\n\n{choice(lines)}."
        )
