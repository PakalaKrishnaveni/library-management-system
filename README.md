# 📚 Library Management System (Java)

A console-based **Library Management System** developed using Java.
This application allows users to manage books efficiently with features like adding, searching, updating, and deleting records.

## 🚀 Features

* 🔐 Login using mobile number validation
* ➕ Add new books
* 🔍 Search books by Book ID
* ❌ Remove books
* ✏️ Update book details (price)
* 📖 View all available books
* 🎨 Console UI with colored output

## 🛠️ Technologies Used

* Java (Core Java)
* OOP Concepts (Encapsulation, Abstraction)
* Collections Framework (`HashMap`)
* Layered Architecture

## 📂 Project Structure

com.base
    └── Book.java

com.business_layer
    └── Book_Business.java

com.service_layer
    └── Book_Main.java

com.validation_layer
    └── Data_validation.java

## ⚙️ How It Works

1. User logs in using a valid mobile number
2. Menu-driven system appears:

   * Add Book
   * Search Book
   * Remove Book
   * Update Book
   * View All Books
3. All book data is stored using `HashMap` in memory


## 🧠 Key Concepts Implemented

* Object-Oriented Programming (OOP)
* Data Encapsulation using classes
* Use of `HashMap` for fast data retrieval
* Input validation (mobile number)
* Dynamic ID generation for books

---

## 🖥️ Sample Output

```
📖 Welcome to Library Management System 📖

1. Add a Book
2. Search a Book
3. Remove a Book
4. Update a Book
5. View All Books
6. Exit

## ⚠️ Limitations

* Data is not stored permanently (no database)
* Search functionality only by Book ID
* No user authentication system (only mobile validation)

## 🔮 Future Enhancements

* 💾 Database integration (MySQL using JDBC)
* 🔐 Admin/User login system
* 🔍 Search by book name, author, genre
* 📊 GUI using Java Swing / JavaFX
* 📁 File handling for persistent storage

## 👨‍💻 Author

Pakala Krishnaveni

## 📌 Conclusion

This project demonstrates the use of Java fundamentals, collections, and layered architecture to build a functional console-based application.
