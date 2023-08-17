"""
This script provides examples of functionality using
the Beautiful Soup module.

Author:        Emmanuel Taylor
Date Created:  August 16, 2023
Date Modified: August 16, 2023
Dependencies:  bs4, requests
"""
import requests
from bs4 import BeautifulSoup

with open("website.html", encoding="utf-8") as f:
    contents = f.read()

soup = BeautifulSoup(contents, "html.parser")

# Accessing various tags and drilling down to pull out data.
print(soup.title)
print(soup.title.name)
print(soup.title.string)
print(soup)
print(soup.prettify())

# If HTML content contains multiple tags, only the first will be returned. 
print(soup.a)

# Collecting all instances of the anchor tag "a".
all_anchor_tags = soup.find_all(name="a")
print(all_anchor_tags)

# Getting the text between each instance of the anchor tag.
for tag in all_anchor_tags:
    print(tag.getText())

# Getting the actual link that each instance of the anchor tag is referencing.
for tag in all_anchor_tags:
    print(tag.get("href"))

# Using the find method, you can isolate tags by their name and any attributes.
heading = soup.find(name="h1", id="name")
print(heading)

section_header = soup.find(name="h3", class_="heading")
print(section_header)

# You can isolate tags by using CSS selectors as well.
company_url = soup.select_one(selector="p a")
print(company_url)

# Scraping a live website.
response = requests.get("https://news.ycombinator.com/news")
response.raise_for_status()

soup = BeautifulSoup(response.text, "html.parser")
articles = soup.find_all(name="a", rel="noreferrer")
article_texts = []
article_links = []

for article_tag in articles:
    article_texts.append(article_tag.getText())
    article_links.append(article_tag.get("href"))

article_upvotes = [int(score.getText().split(" ")[0]) for score in soup.find_all(name="span", class_="score")]

# Getting the index with the highest number of upvotes on the page.
index = article_upvotes.index(max(article_upvotes))
print(f"{article_texts[index]}, {article_links[index]}, {article_upvotes[index]} upvotes")