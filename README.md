

---


# Microservices Project with Spring Boot, Postman, and MySQL

Welcome to my learning project! This project is for learning purposes and is pretty much the same as the YouTube video tutorial. It includes a note-taking option to enhance the learning experience.

1. **Product Service**: Manages product information.
2. **Inventory Service**: Handles inventory-related operations.
3. **Order Service**: Manages order processing.

## :sparkles: Features

- **Product Service**:
  - Add, update, and delete products.
  - Retrieve product details.

- **Inventory Service**:
  - Check product availability.
  - Update inventory status.

- **Order Service**:
  - Place orders.
  - Track order status.

## :computer: Technologies Used

- **Spring Boot**: For building microservices.
- **MySQL**: For data storage.
- **Postman**: For testing APIs.

## :wrench: Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/microservices-project.git
   ```

2. Configure MySQL database settings in each service's `application.properties` file.

3. Run each service using Spring Boot:

   ```bash
   cd product-service
   mvn spring-boot:run
   ```

   ```bash
   cd inventory-service
   mvn spring-boot:run
   ```

   ```bash
   cd order-service
   mvn spring-boot:run
   ```

4. Use Postman to test the APIs.

## :rocket: API Endpoints

- **Product Service**:
  - GET `/products`: Get all products.
  - POST `/products`: Add a new product.
  - PUT `/products/{id}`: Update product by ID.
  - DELETE `/products/{id}`: Delete product by ID.

- **Inventory Service**:
  - GET `/inventory/{productId}`: Get inventory status by product ID.
  - PUT `/inventory/{productId}`: Update inventory status by product ID.

- **Order Service**:
  - POST `/orders`: Place a new order.
  - GET `/orders/{orderId}`: Get order details by order ID.
  - GET `/orders/customer/{customerId}`: Get orders by customer ID.

 
:email: Contact
For any inquiries, please contact us at: contact@example.com

## :page_facing_up: License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize the styling, icons, or content further to suit your project's branding and requirements.
