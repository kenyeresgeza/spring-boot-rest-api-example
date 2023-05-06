# Spring Boot REST API example

# Project Title

Simple overview how to create CRUD based REST API with JPA in Spring Boot 2.x

## Description

Spring Boot 2.7.5, REST, JPA 

## Getting Started

### Dependencies

* Java 11
* Postgres SQL server

### Installing

* Create a "student" database
* Build project (gradle clean jar)
* Just run "rest-demo-1.0.0.jar" jar file

### Executing program

* Create student
```
POST http://localhost:8080/api/v1/student
{
    "name": "James",
    "email": "dummy@gmail.com",
    "dateOfBirth": "1989-01-12"
}
```
* List all students
```
http://localhost:8080/api/v1/student
```
* Update student
```
PUT http://localhost:8080/api/v1/student/4
{
    "name": "James T Kirk",
    "email": "dummy@gmail.com",
    "dateOfBirth": "1989-01-12"
}
```
* Delete student
```
DELETE http://localhost:8080/api/v1/student/4
```

## Author

Kenyeres Géza
https://hu.linkedin.com/in/g%C3%A9za-kenyeres-17341631
