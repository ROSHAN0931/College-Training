import requests

# Example free public API
url = "https://jsonplaceholder.typicode.com/users"

# Send a GET request
response = requests.get(url)

# Print status code
print("Status Code:", response.status_code)  # 200 means OK

# Convert JSON response to Python dictionary
data = response.json()

# Print the data
print("Data from API:\n", data)

# Print specific field
print("\nFirst user's name:", data[0]["name"])
