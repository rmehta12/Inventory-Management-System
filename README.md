# Inventory Management System

This project is a Spring Boot application that provides a RESTful API for managing inventory items.

## Setup

1. Clone the repository
2. Configure MySQL database settings in `src/main/resources/application.properties`
3. Run the application using `./mvnw spring-boot:run`

## API Endpoints

- GET /api/items - Retrieve all items
- GET /api/items/{id} - Retrieve a specific item
- POST /api/items - Create a new item
- PUT /api/items/{id} - Update an existing item
- DELETE /api/items/{id} - Delete an item
