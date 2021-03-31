# Spring-Cloud-Stream-Kafka

Built simple Spring Cloud Stream microservice on top of Spring boot that uses Kafka as a message binder.
Microservice does following:

Implemented REST endpoint which takes in JSON payload (POST localhost:8080/api/person)

The REST endpoint binder method sends the payload to Kafka Producer Service.

Kafka Producer Service sends the payload to kafka broker via message channel (on topic "persons") utilizing Spring Cloud Stream - Kafka instance is running locally on port 9092.

Kafka Consumer service listens to topic "persons" and logs the message to the console.
