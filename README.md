# 🦊 Cub - Modern URL Shortener API

Cub is a lightweight and modern URL shortener built with Java and Spring Boot, designed for developers and businesses who need fast and flexible link shortening services.

## 🚀 Features

- ⚡ **Fast Link Shortening**  
Shorten long URLs instantly via API.

- 🔑 **Guest & Authenticated Modes**  
Allow both anonymous and registered users to create short links.

- 📊 **Scalable Backend**  
Built with Spring Boot, JPA, and PostgreSQL for high performance and scalability.

- 📡 **REST API First**  
Designed as an API-first service, ready for integration with any frontend, mobile app, or external system.

- 🛡️ **Clean Architecture (DDD inspired)**  
Structured by Domain-Driven Design principles for better maintainability and domain clarity.

## 🛠️ Tech Stack

- Java (Spring Boot)
- Spring Data JPA
- PostgreSQL
- Maven

## 📚 Project Structure (DDD-oriented)
```
src/
└── main/
    └── java/
        └── com/
            └── cub/
                └── api/
                    ├── domain/        # Business entities and logic
                    ├── application/   # Application services / use cases
                    ├── infrastructure/# Database and external systems
                    └── interfaces/    # REST controllers and API layer
```
