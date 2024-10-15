# Inventory Management System

## Project Description

This Inventory Management System is a Spring Boot application that provides a RESTful API for managing inventory items. It allows users to perform CRUD (Create, Read, Update, Delete) operations on inventory items, making it easy to track and manage stock levels.

## Setup Instructions

### Prerequisites

- Java JDK 17 or later
- Maven
- MySQL

### Steps

1. Clone the repository:

git clone https://github.com/rmehta12/Inventory-Management-System.git
cd inventory

2. Configure the database:

- Create a MySQL database named `Inventory`
- Update `src/main/resources/application.properties` with your MySQL credentials:
  ```
  spring.datasource.url=jdbc:mysql://localhost:3306/Inventory
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  ```

3. Build the project:

mvn clean install

4. Run the application:

mvn spring-boot:run

The application will start and be available at `http://localhost:8080`.

## API Endpoints

### Get All Items

- **URL:** `/api/items`
- **Method:** GET
- **Response:** List of all items
- **Response Format:**
json
[
 {
   "id": 1,
   "name": "Laptop",
   "quantity": 50,
   "price": 999.99
 },
 {
   "id": 2,
   "name": "Mouse",
   "quantity": 100,
   "price": 19.99
 }
]

### Get Item by ID
URL: /api/items/{id}
Method: GET
URL Params: id=[int]
Response: Single item details
Response Format:
json
{
  "id": 1,
  "name": "Laptop",
  "quantity": 50,
  "price": 999.99
}

### Create New Item
URL: /api/items
Method: POST
Request Body:
json
{
  "name": "Keyboard",
  "quantity": 75,
  "price": 49.99
}
Response: Created item details

### Update Item
URL: /api/items/{id}
Method: PUT
URL Params: id=[int]
Request Body:
json
{
  "name": "Updated Laptop",
  "quantity": 60,
  "price": 1099.99
}
Response: Updated item details

### Delete Item
URL: /api/items/{id}
Method: DELETE
URL Params: id=[int]
Response: No content (204 status code)


### Error Handling
The API uses standard HTTP status codes to indicate the success or failure of requests. In case of errors, a JSON response with an error message will be returned.
Example error response:
json
{
  "timestamp": "2024-10-15T10:30:45.123Z",
  "status": 404,
  "error": "Not Found",
  "message": "Item not found for this id :: 100",
  "path": "/api/items/100"
}
