# Getting Started

# Description
This project is an REST based service, which accepts a json message with id and message as fields.
The endpoint will return a json document with count as field. 

The functionality of this project is to count number of words contained in all the messages to that point.

The service ignores messages with duplicate ids.

The ids, messages are stored in the database

Programming Language: Java

## Dependencies

Spring Web

Spring Actuator

Spring Boot DevTools

HSQLDB - In memory database

### Steps

Start the database

Clean build the project

Run the project


### Endpoint 

```
http://localhost:8080/order/challenge/v1
Input :

{
"id" : "3",
"message" : "Hello"
}

Output:
{
    "count": 5
}

```


### Start the Database

Download the hsqldb.jar file

Start Database: java -cp hsqldb.jar org.hsqldb.server.Server --database.0 file:mydb --dbname.0 challenge


### Build

#### For windows

Clean build: `gradlew.bat clean build`

Run : `gradlew.bat bootrun` or `winrun.bat`

#### For Linux

Clean build: `gradlew clean build`

Run : `gradlew bootrun`


