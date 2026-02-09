# Spring Boot Item API

## Project Overview

This is a simple **Java Spring Boot RESTful backend application** that manages a collection of items (similar to products in an e-commerce application). The application uses an **in-memory data store (ArrayList)** to store and retrieve items.

This project was built as part of a task to demonstrate:

* REST API development using Spring Boot
* Basic CRUD operations (Create & Read)
* Input validation
* Deployment to a cloud platform (Railway)

---

##  Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Spring Validation
* Maven
* Railway (for deployment)

---

##  Project Structure

```
src/main/java/com/example/itemapi/
│
├── ItemapiApplication.java
├── controller/
│   └── ItemController.java
├── model/
│   └── Item.java
└── service/
    └── ItemService.java
```

---

## ▶ How to Run the Application Locally

### Option 1: Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Go to `ItemapiApplication.java`
3. Click on the green ▶️ Run button

### Option 2: Using Terminal

Run the following commands:

```
mvn clean install
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

##  Live Demo (Hosted on Railway)

Application URL:

```
https://spring-boot-item-api-production.up.railway.app
```

Health Check Endpoint:

```
https://spring-boot-item-api-production.up.railway.app/health
```

---

##  API Endpoints

### 1️ Add a New Item

**Endpoint:**

```
POST /api/items
```

**Request Body (JSON):**

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Inspiron Laptop"
}
```

**Response:**

* `200 OK` with the saved item

---

### 2️ Get All Items

**Endpoint:**

```
GET /api/items
```

**Response:**

* Returns a list of all items

Example response:

```json
[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Dell Inspiron Laptop"
  }
]
```

---

### 3️ Get Item by ID

**Endpoint:**

```
GET /api/items/{id}
```

Example:

```
GET /api/items/1
```

**Responses:**

* `200 OK` → Item found
* `404 Not Found` → Item does not exist

---

##  Input Validation

The API validates input when adding an item:

* Name must not be empty
* ID must be valid

If validation fails, the API returns an appropriate error message.

---

##  Important Note

* This application uses **in-memory storage (ArrayList)**, so data will be lost when the application restarts.
* No database is used as per the task requirement.

---

##  Author

Megha Kharvi
Canara Engineering College
