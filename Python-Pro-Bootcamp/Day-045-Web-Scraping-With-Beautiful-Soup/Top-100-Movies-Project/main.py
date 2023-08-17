"""
This script will scrape the top 100 movies of all time from a
website, generate a text file called 'movies.txt' that lists the
movie titles in ascending order (starting from 1).

Author:        Emmanuel Taylor
Date Created:  August 17, 2023
Date Modified: August 17, 2023
Dependencies:  bs4, requests
"""

import requests
from bs4 import BeautifulSoup

URL = "https://web.archive.org/web/20200518073855/https://www.empireonline.com/movies/features/best-movies-2/"

# Write your code below this line 👇
response = requests.get(URL)
content = response.text

soup = BeautifulSoup(content, "html.parser")
movie_title_tags = soup.find_all(name="h3", class_="title")
movie_titles = []

for title in movie_title_tags:
    movie_titles.append(title.getText())

reversed_titles = movie_titles.copy()
reversed_titles.reverse()

with open("movies.txt", "w", encoding="utf-8") as file:
    for title in reversed_titles:
        file.write(f"{title}\n")