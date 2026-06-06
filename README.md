# Demo Country Details API

## Overview

This project is a Spring Boot REST API that provides country and city information. It allows users to retrieve a list of countries, view cities belonging to a selected country, retrieve city details by ID, and supports pagination for city listings.

## Technology Stack

* Java 21
* Spring Boot 3.3.2
* Maven
* OpenAPI / Swagger
* Eclipse IDE
* Git & GitHub

## Project Structure

   text
src/main/java
├── com.rest.demo.tech
│   ├── controller
│   ├── service
│   ├── model
│   ├── dto
│   └── DemoCountrydetailsApiApplication.java
   

## Features

* Retrieve all countries
* Retrieve cities by country
* Retrieve city details by ID
* Pagination support for city listings
* OpenAPI / Swagger documentation
* In-memory data storage (no database required)

## API Endpoints

### Get All Countries

   http
GET /countries
   

### Get Cities By Country

   http
GET /countries/{countryId}/cities?page=0&size=10
   

Example:

   http
GET /countries/1/cities?page=0&size=2
   

### Get City Details

   http
GET /cities/{cityId}
   

Example:

   http
GET /cities/1
   

## Pagination

The cities endpoint supports pagination using:

| Parameter | Description                 |
| --------- | --------------------------- |
| page      | Page number (starts from 0) |
| size      | Number of records per page  |

Example:

   http
GET /countries/1/cities?page=0&size=2
   

## Running the Application

### Prerequisites

* Java 21
* Maven 3.9+
* Git

### Run from Eclipse

1. Import the Maven project.
2. Open `DemoCountrydetailsApiApplication.java`
3. Run as **Java Application**

### Run from Command Line

   bash
mvn clean install
mvn spring-boot:run
   

## Access URLs

### Application

   text
http://localhost:9090
   

### Countries API

   text
http://localhost:9090/countries
   

### Cities API

   text
http://localhost:9090/countries/1/cities
   

### City Details API

   text
http://localhost:9090/cities/1
   

### Swagger UI

   text
http://localhost:8080/swagger-ui/index.html
   

## Sample Data

### Countries

* India
* Germany
* Luxembourg

### Cities

* Bangalore
* Hyderabad
* Berlin
* Hamburg
* Luxembourg City

## GitHub Repository

Source code is maintained in GitHub and can be cloned using:

   bash
git clone https://github.com/RAKSHITHVKOTE/demo-countrydetails-api.git
   

## Author

Rakshith Hahehally Virupakshaiah
