"""
This script will scrape the top 100 songs on the billboard chart from
the year of the date the user enters, create a Spotify playlist and 
add it to their account.

Author:        E. Taylor
Date Created:  August 18, 2023
Date Modified: August 18, 2023
Dependencies:  bs4, requests, spotipy, spotipy.oauth2
"""

import requests
import spotipy
from spotipy.oauth2 import SpotifyOAuth
from bs4 import BeautifulSoup

URL_BILLBOARD_TOP_100 = "https://www.billboard.com/charts/hot-100/"
date = input("Which year do you want to travel to? Type the date in this format (YYYY-MM-DD): ")
URL = URL_BILLBOARD_TOP_100 + date

# Spotipy Client Credentials.
CLIENT_ID = "YOUR SPOTIFY CLIENT ID HERE"
CLIENT_SECRET = "YOUR SPOTIFY CLIENT SECRET HERE"

response = requests.get(URL)
response.raise_for_status()
content = response.text

# Select the tags that contain the names of each song in the Top 100 list.
soup = BeautifulSoup(content, "html.parser")
song_title_tags = soup.select("li ul li h3")
song_titles = [tag.getText().strip() for tag in song_title_tags]

# Create and authenticate with Spotify.
sp = spotipy.Spotify(
    auth_manager=SpotifyOAuth(
        client_id=CLIENT_ID, 
        client_secret=CLIENT_SECRET,
        redirect_uri="http://example.com",
        scope="playlist-modify-private",
        show_dialog=True,
        cache_path=".cache"
    )
)

user_id = sp.current_user()["id"]
song_uris = []

# Collecting the song URI for each song in the list.
for song in song_titles:
    result = sp.search(q=f"track:{song} year:1995", type="track")
    try:
        uri = result["tracks"]["items"][0]["uri"]
        song_uris.append(uri)
    except IndexError:
        print(f"{song} doesn't exist in Spotify. Skipped.")

# Create a Spotify Playlist.
playlist = sp.user_playlist_create(user=user_id, name=f"{date} Billboard 100", public=False)
print(playlist)

# Add each song in the list to the playlist.
sp.playlist_add_items(playlist_id=playlist["id"], items=song_uris)