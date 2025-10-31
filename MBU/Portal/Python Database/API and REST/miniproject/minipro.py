import requests

print("😂 Welcome to the Jokes Generator! 😂\n")

# API endpoint
url = "https://official-joke-api.appspot.com/random_joke"

# Get a random joke
response = requests.get(url)

# Convert response to JSON
joke = response.json()

# Display joke
print("👉 Setup:", joke['setup'])
print("🤣 Punchline:", joke['punchline'])
