# Spring Boot CRUD API  
Authentication done with JWT, Spring Security and Spring Data JPA

## Getting Started

### Prerequisites

This application uses MySQL 

If running MySQL locally:
```
Open src/main/resources/application.properties and alter
spring.datasource.url
spring.datasource.username
spring.datasource.password
```
to match your environment, create an empty database called employee-management

Or run MySQL in a docker container with the command bellow:
```
docker run  --detach   --name em-mysql -p 6604:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=employee-management -e MYSQL_USER=db_user -e MYSQL_PASSWORD=db_pass -d mysql
```

### Run the Spring Boot application

```
mvn spring-boot:run
```

