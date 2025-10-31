import requests

url = "https://api.agify.io"  # Predicts age based on name

params = {"name": "Roshan"}
response = requests.get(url, params=params)

print("Full URL:", response.url)
print("Predicted Age Data:", response.json())
