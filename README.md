# Library-Management-System

## Project Overview

This is a library management system developed using the Spring Boot MVC architecture with Java. The system allows library administrators to manage students, books, and library card issuance. It provides features such as book filtering, email notifications, and Swagger API documentation.

## Features

- Student Management: Add, delete, and update student records. Implements user authentication and authorization for admin access.
- Library Card Issuance: Admin can issue library cards with unique card numbers.
- Book Management: Admin can add and delete books. Books have attributes like title, author, ISBN, genre, cost, and quantity. Implements filtering by cost range and genre.
- Email Notifications: Automated email notifications sent to users upon successful book issuance using the Java Mail Sender library.
- Database Migration: Migrated the project's database to PostgreSQL for enhanced scalability and data management.
- Documentation: Interactive and user-friendly API documentation provided via Swagger UI.

## Tech Stack

- Spring Boot
- PostgreSQL (database)
- Hibernate JPA (Object-Relational Mapping)
- Tomcat (server)
- Apache Maven (build tool)
- REST API

## Getting Started

### Prerequisites

- Java (version X.X)
- PostgreSQL (version X.X)
- Apache Maven (version X.X)

### Installation

1. Clone the repository: `git clone https://github.com/yourusername/your-repo.git`
2. Navigate to the project directory: `cd your-repo`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

### Usage

- Access the application at [http://localhost:8080](http://localhost:8080).
- Explore the API documentation at [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html).

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments

- [Spring Boot](https://spring.io/projects/spring-boot)
- [PostgreSQL](https://www.postgresql.org/)
- [Hibernate](https://hibernate.org/)
- [Swagger](https://swagger.io/)
- [Java Mail Sender](https://docs.spring.io/spring-framework/docs/current/reference/html/integration.html#mail)

## Contact

For inquiries or issues, please contact [Prakash](mailto:prakash4701036@gmail.com)].
