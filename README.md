A project from the course Information Management and Systems Engineering at the university of Vienna (https://ufind.univie.ac.at/en/course.html?lv=052400&semester=2023W).

In collaboration with https://github.com/dzon337.

Overview

This project exposes a simple CRUD api for interacting with a database and display the data. It models a very simplified version of a platform similar to Steam, providing features for purchasing games, uploading reviews and befriending other users.

Technologies Used

1. Java
2. Spring Boot
3. JPA (Java Persistence API) / Hibernate
4. MySQL
5. HTML, CSS, JavaScript
6. Docker

Getting Started

To run the project locally, follow these steps:
1. Ensure you have Docker Desktop installed locally.
2. Start up the Docker application.
3. Navigate to the root folder and run the command "docker-compose up."
4. Open a browser of your choice and go to "http://localhost:8080" to access the backend and "https://localhost:8443" to access the frontend.
   
Database Connectivity

This project utilizes JPA (Java Persistence API) with Spring Data JPA to interact with a MySQL database. Hibernate is used as the JPA provider for database management.
