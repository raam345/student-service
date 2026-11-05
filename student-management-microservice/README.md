# Student Management Microservice

A simple Spring Boot REST API that returns student IDs and names as JSON.

## Requirements
- JDK 17
- Maven 3.6+ (or use the Maven wrapper if you add one)

## Run locally
From this project directory:

```bash
mvn spring-boot:run
```

Open: http://localhost:8080/students

## Build a JAR
```bash
mvn clean package
java -jar target/student-service.jar
```

## Deploy to Render
1. Push this folder to a GitHub repository.
2. In Render, choose **New → Web Service** and connect the repository.
3. Set:
   - Build command: `mvn clean package`
   - Start command: `java -jar target/student-service.jar`
4. Deploy, then open `https://YOUR-SERVICE.onrender.com/students`.

Render supplies the `PORT` environment variable; `application.properties` uses it automatically.
