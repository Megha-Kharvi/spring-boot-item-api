# Item API — Spring Boot REST Application

##  Project Description

This is a simple Spring Boot REST API that allows you to manage a collection of items using an **in-memory ArrayList** (no database). The project demonstrates basic CRUD-style REST principles, input validation, and Postman testing.

---

##  Technologies Used

* Java 17
* Spring Boot
* Maven
* Spring Web
* Spring Validation
* Postman (for API testing)

---

## ▶ How to Run the Application

### Step 1 — Clone the project

```
git clone <your-repo-link>
```

### Step 2 — Open in IntelliJ IDEA

Open the project in **IntelliJ IDEA**.

### Step 3 — Run the application

Run:

```
ItemapiApplication.java
```

The application will start at:

```
http://localhost:8080
```

---

##  API Endpoints

###  1) Add a new Item — **POST**

**URL:**

```
POST http://localhost:8080/api/items
```

**Request Body (JSON):**

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Inspiron"
}
```

**Success Response (200 OK):**

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Inspiron"
}
```

---

###  2) Get All Items — **GET**

**URL:**

```
GET http://localhost:8080/api/items
```

**Example Response:**

```json
[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Dell Inspiron"
  }
]
```

---

###  3) Get Item by ID — **GET**

**URL:**

```
GET http://localhost:8080/api/items/1
```

**Success Response:**

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Inspiron"
}
```

**If item not found:**
→ `404 Not Found`

---

##  Input Validation Rules

The API enforces the following:

* `id` → Must be present (`@NotNull`)
* `name` → Cannot be empty (`@NotBlank`)
* `description` → Cannot be empty (`@NotBlank`)

If validation fails → **400 Bad Request**

---

##  Project Structure

```
itemapi
 ├── src/main/java/com/example/itemapi/
 │   ├── ItemapiApplication.java
 │   ├── model/Item.java
 │   ├── service/ItemService.java
 │   └── controller/ItemController.java
 └── pom.xml
```

---

##  What this project demonstrates

* RESTful API design
* Spring Boot annotations (`@RestController`, `@Service`)
* In-memory data storage using `ArrayList`
* Input validation with `@Valid`, `@NotNull`, `@NotBlank`
* API testing using Postman

---

