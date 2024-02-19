A project from the course Information Management and Systems Engineering at the university of Vienna (https://ufind.univie.ac.at/en/course.html?lv=052400&semester=2023W).

In collaboration with https://github.com/dzon337.

Overview

This project is a web application developed using Java Spring Boot, with a MySQL database backend. It models a very simplified version of a platform similar to Steam, providing features for purchasing games, uploading reviews and befriending other users.

Technologies Used

Java
Spring Boot
JPA (Java Persistence API)
MySQL
HTML
CSS
JavaScript
Docker

Getting Started

To run the project locally, follow these steps:
1. Ensure you have Docker Desktop installed locally.
2. Start up the Docker application.
3. Navigate to the root folder and run the command "docker-compose up."
4. Open a browser of your choice and go to "http://localhost:8080" to access the backend and "https://localhost:8443" to access the frontend.
   
Database Connectivity

This project utilizes JPA (Java Persistence API) with Spring Data JPA to interact with a MySQL database. Hibernate is used as the JPA provider for database management.

Usage

How to run the project

To run the project one must navigate to the root directory of the project.
There should be a ‘docker-compose.yml’ file and after running the
command ‘docker compose up’ a container is started. All the build work
is done automatically by docker and only the necessary ports are being
exposed.
The container consists of three running applications - frontend, backend
which are Spring boot applications and a MySQL database. They are all
isolated from one another and work in a shared network.
The backend can be accessed at ‘http://localhost:8080’. There one can
find 2 buttons - one for filling the database with random data. If there’s
already available data in the database it gets deleted and a new set is
generated. The other button is for the best selling games report where
one can filter based on genre and sort the games in ascending or
descending order based on the total profit - game price * quantity of a
purchased game across all orders.
The frontend can be accessed at ‘https://localhost:8443’ where one can
interact with the web system and check out the use cases and the best
rated game based on rating reviews report.
