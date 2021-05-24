# Getting Started

# Description
This project is an REST based service, which accepts a json message with id and message as fields.
The endpoint will return a json document with count as field. The functionality of this
project is to count number of words contained in all the messages to that point.

## Endpoint 

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

### Build

#### For windows

Clean build: `gradlew.bat clean build`

Run : `gradlew.bat bootrun` or `winrun.bat`

#### For Linux

Clean build: `gradlew clean build`

Run : `gradlew bootrun`


