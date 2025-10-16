# 📚 BookStore App

A full-featured **BookStore Management System** built with **Spring Boot**, **Spring Data JPA**, and **PostgreSQL**.  
This project provides a RESTful API for managing books, authors, users, orders, and related entities — designed for scalability and clean architecture.

---

## 🚀 Features

✅ Manage **Books** – create, update, delete, and list all books  
✅ Manage **Authors** – link authors to books (one-to-many relationship)  
✅ Manage **Users** – register, view, and manage customers or admins  
✅ Supports **Categories** and **Genres** for flexible classification  
✅ Built with **Spring Boot 3**, **JPA**, **Hibernate**, and **PostgreSQL**  
✅ Follows **REST API design** with modular service and repository layers  
✅ Ready for extension to include orders, carts, and payments

---

## 🧩 Entities Overview

| Entity | Description |
|--------|--------------|
| **User** | Represents a registered user or admin. Includes role, email, password, date of birth, etc. |
| **Book** | Core entity containing title, genre, category, price, stock, published date, and cover image. |
| **Author** | Represents book authors, connected via a `ManyToOne` relationship with books. |
| **Category** | Classifies books by type (e.g., Fiction, Non-fiction). |
| **Genre** | Sub-classification for storytelling style or subject matter (e.g., Fantasy, Technology). |

> 🧠 The database schema is designed using **JPA annotations**, ensuring proper relationships and auto-migrations via Hibernate.

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot 3, Java 17+  
- **Database:** PostgreSQL  
- **ORM:** Hibernate / Spring Data JPA  
- **Build Tool:** Maven  
- **REST Testing:** Postman or cURL  

---

## ⚙️ API Examples

### ➕ Create an Author
`POST /api/authors`
```json
{
  "name": "Robert C. Martin",
  "biography": "Software engineer and author of Clean Code.",
  "nationality": "American",
  "birthDate": "1952-12-05"
}
```

### ➕ Create a Book
`POST /api/books`
```json
{
  "title": "Clean Code",
  "author": { "id": 1 },
  "genre": "Software Engineering",
  "category": "Non-fiction",
  "description": "A guide to writing clean, maintainable code.",
  "price": 39.99,
  "stock": 50,
  "publishedDate": "2008-08-01",
  "coverImage": "https://example.com/cleancode.jpg"
}
```

### 📖 Get All Books
`GET /api/books`

---

## 🧱 Project Structure

```
src/
 ├── main/
 │   ├── java/com/example/bookstoreapp/
 │   │   ├── controller/   → REST API endpoints
 │   │   ├── model/        → Entity classes (Book, Author, User, etc.)
 │   │   ├── repository/   → Spring Data JPA repositories
 │   │   └── service/      → Business logic layer
 │   └── resources/
 │       ├── application.properties → Database config
 │       └── data.sql (optional sample data)
 └── test/
     └── BookStoreAppApplicationTests.java
```

---

## 🧰 Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/bookstore-app.git
   cd bookstore-app
   ```

2. **Configure PostgreSQL**
   - Create a database, e.g. `bookstore_db`
   - In `src/main/resources/application.properties`:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/bookstore_db
     spring.datasource.username=postgres
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```
   or run `BookStoreAppApplication.java` from your IDE.

4. **Test the API**
   Open Postman and test endpoints like:
   - `POST /api/authors`
   - `POST /api/books`
   - `GET /api/books`

---

## 📈 Future Enhancements

- 🛒 Cart and Orders management  
- 💳 Payment and checkout system  
- 🔐 JWT Authentication and Role-based Access Control  
- ⭐ Reviews, Ratings, and Wishlist features  
- 🌐 React or Angular front-end integration  

---

## 👨‍💻 Author

Developed by **[Mohammed AL-ABBASI]**  
💡 Built as a learning and portfolio project using **Spring Boot** and **PostgreSQL**
