# SpringBootCRUDNoDB
"Basic Spring Boot CRUD project without a database connection. Utilizes Postman for API testing. Explore simple Create, Read, Update, and Delete operations. Ideal for learning Spring fundamentals and RESTful API development."

Spring Boot CRUD Without Database Connection
Welcome to the Spring Boot CRUD Without Database Connection project! This project is designed for those who want to learn the fundamentals of Spring Boot and RESTful API development without the complexity of a database connection. It's a simple demonstration of Create, Read, Update, and Delete (CRUD) operations using a Laptop entity class. Postman is employed for API testing.

Prerequisites
Before you begin, make sure you have the following installed on your system:

Java Development Kit (JDK)
Maven
Postman (for testing the APIs)
Getting Started
Clone the Repository:

bash
Copy code
git clone https://github.com/Ravindragouda/spring-boot-crud-no-db.git
cd spring-boot-crud-no-db
Run the Application:

bash
Copy code
mvn spring-boot:run
Explore the Endpoints:
Open your browser and navigate to http://localhost:8080/swagger-ui.html to access the Swagger UI. Here, you can interact with and test the various CRUD operations.

API Endpoints
1. Get All Laptops
Endpoint: /api/laptops
Method: GET
Description: Retrieve a list of all laptops.
2. Get Laptop by ID
Endpoint: /api/laptops/{id}
Method: GET
Description: Retrieve details of a specific laptop by its ID.
3. Add a New Laptop
Endpoint: /api/laptops
Method: POST
Description: Add a new laptop. Provide laptop details in the request body.
4. Update Laptop Information
Endpoint: /api/laptops/{id}
Method: PUT
Description: Update details of a specific laptop by its ID. Provide updated laptop details in the request body.
5. Delete Laptop
Endpoint: /api/laptops/{id}
Method: DELETE
Description: Delete a laptop by its ID.
Testing with Postman
You can use Postman to test the CRUD operations. Import the provided Postman collection (postman/spring-boot-crud-no-db.postman_collection.json) and start testing the endpoints.

Conclusion
Congratulations! You've successfully set up and explored the Spring Boot CRUD Without Database Connection project. This project provides a hands-on experience with Spring Boot fundamentals and RESTful API development. Feel free to customize and expand the project based on your learning goals. Happy coding!
