
# J.P. Morgan Chase & Co. - Midas Core Simulation

This repository contains my implementation of the **Midas Core** backend system, developed during the J.P. Morgan Software Engineering Simulation. The project focuses on building a high-throughput financial transaction processing engine using industry-standard Java frameworks.

## Tech Stack
* **Language:** Java 17
* **Framework:** Spring Boot 3.2.5 (Data JPA, Web, Kafka)
* **Messaging:** Apache Kafka (Real-time stream processing)
* **Database:** H2 In-Memory Database
* **Build Tool:** Maven

## Key Features Implemented
* **Kafka Listener:** Created a robust consumer to ingest real-time transaction streams from a configured Kafka topic.
* **Database Persistence:** Implemented a JPA-based persistence layer to record transaction history and manage user balances.
* **Transaction Validation:** Developed logic to verify sender/recipient IDs and ensure sufficient funds before processing payments.
* **Incentive API Integration:** Built a `RestTemplate` client to communicate with an external Incentives service, dynamically calculating and applying rewards to transactions.
* **REST API Development:** Exposed a `/balance` endpoint on a custom port to provide real-time user account status in JSON format.

## Key Learnings
* Architecting microservices that communicate via asynchronous messaging (Kafka).
* Managing relational data with Hibernate/JPA and handling `ManyToOne` relationships.
* Debugging complex Spring Boot application contexts and automated test suites.
