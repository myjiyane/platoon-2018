# platoon-2018

# Invoice Repository app: invoicereg

Centralised registry of invoices sent to clients.

This project created using Spring Boot[STS v3.5.9]. This application is exposed as a single RESTful webservice with three endpoints:

1. Add invoice -> POST http://localhost:8080/invoices

2. View all invoices ->  GET http://localhost:8080/invoices

3. View invoice -> GET http://localhost:8080/invoices/{invoiceId} 


## Build

To build this project you need to have Maven installed in your machine and have relevant dependencies, including the H2 in-memory database
which is configured in INVOICEREG project.

Issue command > mvn clean install on your command line to run through the full maven lifecycle steps. 


## Deploy 

From inside invoicereg folder isssue the following command and this will serve your application on http://localhost:8080 > mvn exec:java

## Running unit tests

Run your tests using Postman app. Please go through the provided TESTS.txt file which contain the relevant test cases to the relevant 
endpoints exposed through this application.

To help facilitate on your testing, an H2 console has been enabled in this application to help you inspect data throughout your testing.

After launching application, you can find the H2 console in this url > http://localhost:8080/h2-console
