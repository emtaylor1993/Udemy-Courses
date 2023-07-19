from replit import clear
from art import logo

print(logo)

more_bids = "yes"
bidders = {}

def highest_bid(bidders):
  highest_bidder = ""
  highest_bid = 0
  for name in bidders:
    if bidders[name] > highest_bid:
      highest_bidder = name
      highest_bid = bidders[name]
  print(f"The winner is {highest_bidder} with a bid of ${highest_bid}")

while more_bids == "yes":
  name = input("What is your name?: ")
  bid = int(input("What is your bid?: $"))
  bidders[name] = bid
  more_bids = input("Are there any other bidders? Type \"yes\" or \"no\".\n")
  if more_bids == "yes":
    clear()
  elif more_bids == "no":
    highest_bid(bidders)
  else:
    print("Invalid Option.")