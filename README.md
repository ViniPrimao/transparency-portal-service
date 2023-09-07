# Medical Supplies Transparency Portal - Backend

The backend component of the Medical Supplies Transparency Portal is a critical part of the system's architecture. This README provides an overview of the backend components, technologies, and how to set up and run the backend server using Gradle and Docker Compose.

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Running the Backend](#running-the-backend)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The architecture aspects of a system play a crucial role in determining its structure, functionality, scalability, and overall success. In the context of the Medical Supplies Transparency Portal project, the backend serves as the core component responsible for handling data processing, authentication, and communication with the frontend.

The proposed backend architecture of the Medical Supplies Transparency Portal utilizes Spring Boot as the primary framework, ensuring robustness, security, and scalability. This backend interacts with the MongoDB database system for efficient data storage and retrieval. Together with the frontend built using Angular, this architecture aims to provide an efficient and transparent tracking system for medical supplies throughout the healthcare supply chain.

## Technologies Used

The backend of the Medical Supplies Transparency Portal is built using the following technologies:

- **Spring Boot**: A Java-based framework for building robust and scalable web applications.
- **MongoDB**: A NoSQL database system for efficient data storage and retrieval.
- **RESTful APIs**: The backend exposes RESTful APIs for communication with the frontend.

## Setup and Installation

To set up and run the backend of the Medical Supplies Transparency Portal, follow these steps:

1. **Clone the Repository**: Clone this repository to your local machine.

   ```bash
   git clone https://github.com/ViniPrimao/transparency-portal-service.git
   cd transparency-portal-service
   ```

2. **Install Dependencies**: Make sure you have Java installed on your machine. Then, install the project dependencies using Gradle.

   ```bash
   ./gradlew build
   ```

3. **Run the Application**: Start the Spring Boot application using Gradle.

   ```bash
   ./gradlew bootRun
   ```

The backend server should now be up and running on `http://localhost:8080`.

## Running the Backend with Docker Compose

You can run the MongoDB using Docker Compose. Ensure you have Docker installed and configured.

1. **Start Docker Container**: Run the following command in the project root directory to start the Docker container:

   ```bash
   docker-compose up
   ```

This will start the Docker container defined in the `docker-compose.yml` file.

## API Documentation

For API documentation and usage details, refer to the API documentation provided separately. This documentation should include information about available endpoints, request and response formats, and authentication mechanisms.

## Contributing

If you'd like to contribute to the development of the Medical Supplies Transparency Portal backend, please follow the guidelines outlined in the project's [Contribution Guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute it according to the terms of the license.