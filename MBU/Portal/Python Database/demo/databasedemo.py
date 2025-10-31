import sqlite3

conn = sqlite3.connect("example.db")
cursor = conn.cursor()

cursor.execute("""CREATE TABLE IF NOT EXISTS users (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT,
    age INTEGER
)""")

# 🧹 Clear table before inserting new rows
cursor.execute("DELETE FROM users")

# Insert some data
cursor.execute("INSERT INTO users (name, age) VALUES (?, ?)", ("Alice", 30))
cursor.execute("INSERT INTO users (name, age) VALUES (?, ?)", ("Bob", 25))
cursor.execute("INSERT INTO users (name, age) VALUES (?, ?)", ("Roshan", 31))

# Commit changes
conn.commit()

# Read data
cursor.execute("SELECT * FROM users")
for row in cursor.fetchall():
    print(row)

# Close connection
conn.close()