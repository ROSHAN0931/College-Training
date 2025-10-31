import requests

url = "https://jsonplaceholder.typicode.com/posts"

# Data to send (in JSON format)
new_post = {
    "title": "My First API Post",
    "body": "Learning APIs with Python!",
    "userId": 1
}

# Send POST request
response = requests.post(url, json=new_post)

# Print the response
print("Status Code:", response.status_code)
print("Response Data:", response.json())
