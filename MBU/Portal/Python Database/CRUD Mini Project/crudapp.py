import sqlite3

# ---------- DATABASE SETUP ----------
def connect_db():
    conn = sqlite3.connect("students.db")
    cursor = conn.cursor()
    cursor.execute("""
    CREATE TABLE IF NOT EXISTS students (
        id INTEGER PRIMARY KEY ,
        name TEXT NOT NULL,
        age INTEGER,
        grade TEXT
    )
    """)
    conn.commit()
    return conn, cursor


# ---------- CRUD FUNCTIONS ----------

def add_student(cursor, conn):
    name = input("Enter name: ")
    age = int(input("Enter age: "))
    grade = input("Enter grade: ")
    cursor.execute("INSERT INTO students (name, age, grade) VALUES (?, ?, ?)", (name, age, grade))
    conn.commit()
    print(f"✅ Student '{name}' added successfully!\n")


def view_students(cursor):
    cursor.execute("SELECT * FROM students")
    rows = cursor.fetchall()
    if rows:
        print("\n📋 Student List:")
        print("-" * 40)
        for row in rows:
            print(f"ID: {row[0]} | Name: {row[1]} | Age: {row[2]} | Grade: {row[3]}")
        print("-" * 40)
    else:
        print("\n⚠️ No students found.\n")


def update_student(cursor, conn):
    student_id = int(input("Enter student ID to update: "))
    new_grade = input("Enter new grade: ")
    cursor.execute("UPDATE students SET grade = ? WHERE id = ?", (new_grade, student_id))
    conn.commit()
    if cursor.rowcount > 0:
        print("✅ Student record updated successfully!\n")
    else:
        print("⚠️ No student found with that ID.\n")


def delete_student(cursor, conn):
    student_id = int(input("Enter student ID to delete: "))
    cursor.execute("DELETE FROM students WHERE id = ?", (student_id,))
    conn.commit()
    if cursor.rowcount > 0:
        print("🗑️ Student deleted successfully!\n")
    else:
        print("⚠️ No student found with that ID.\n")


# ---------- MAIN MENU ----------
def main():
    conn, cursor = connect_db()

    while True:
        print("""
======== STUDENT CRUD MENU ========
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
===================================
""")
        choice = input("Enter your choice (1-5): ")

        if choice == "1":
            add_student(cursor, conn)
        elif choice == "2":
            view_students(cursor)
        elif choice == "3":
            update_student(cursor, conn)
        elif choice == "4":
            delete_student(cursor, conn)
        elif choice == "5":
            print("👋 Exiting program...")
            break
        else:
            print("⚠️ Invalid choice! Please try again.\n")

    cursor.close()
    conn.close()


# ---------- RUN THE APP ----------
if __name__ == "__main__":
    main()
