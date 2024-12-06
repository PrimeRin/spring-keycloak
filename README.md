# Keycloak Integration with Spring Boot

This project demonstrates how to integrate **Keycloak**, an open-source identity and access management solution, with a **Spring Boot** application. The Keycloak server runs in a Docker container for ease of setup.

---

## Prerequisites

- [Docker](https://www.docker.com/products/docker-desktop) installed on your machine.
- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
- [Maven](https://maven.apache.org/) for building the Spring Boot application.

---

## Setup Keycloak in Docker

### 1. Run Keycloak in Docker
Start a Keycloak server using Docker:

```bash
docker run -d -p 8080:8080 \
  -e KC_BOOTSTRAP_ADMIN_USERNAME=admin \
  -e KC_BOOTSTRAP_ADMIN_PASSWORD=admin \
  quay.io/keycloak/keycloak:26.0.7 start-dev
```

- Admin Console: Once the container is running, the Keycloak admin console is accessible at:
http://localhost:8080/admin
Default Credentials:
- Username: admin
- Password: admin

### 2. Create a Realm
   Log in to the Keycloak Admin Console.
   Create a new realm (e.g., spring-boot-demo). 
   
### 3. Configure a Client
   Navigate to Clients → Create.
   Set the following values:
   Client ID: spring-boot-client
   Client Protocol: openid-connect
   Access Type: confidential
   Save the client and note down the Client Secret (found under the Credentials tab).

### 4. Create Roles
   Go to Roles → Add Role.
   Create roles (e.g., USER, ADMIN). 
   
### 5. Add Users
   Navigate to Users → Add User.
   Fill in user details and click Save.
   Set a password under the Credentials tab.
   Assign roles to the user under the Role Mappings tab
