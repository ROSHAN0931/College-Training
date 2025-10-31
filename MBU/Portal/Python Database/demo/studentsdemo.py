import sqlite3

# Connect to database (creates it if it doesn't exist)
conn = sqlite3.connect("students.db")

# Create a cursor object
cursor = conn.cursor()

# Create a Table

cursor.execute("""
CREATE TABLE IF NOT EXISTS students (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    age INTEGER,
    grade TEXT
)
""")

# Insert a Record
cursor.execute("INSERT INTO students (name, age, grade) VALUES (?, ?, ?)",
               ("John Doe", 20, "A"))

conn.commit()  # Save changes
print("Record inserted successfully!")

# READ (Select Data)
cursor.execute("SELECT * FROM students")
rows = cursor.fetchall()

for row in rows:
    print(row)

# UPDATE (Modify Data)
cursor.execute("UPDATE students SET grade = ? WHERE name = ?", ("A+", "John Doe"))
conn.commit()
cursor.execute("Select * from students")
print("Record updated successfully!")

# DELETE (Remove Data)
cursor.execute("DELETE FROM students WHERE name = ?", ("John Doe",))
conn.commit()
print("Record deleted successfully!")
cursor.close()
conn.close()

