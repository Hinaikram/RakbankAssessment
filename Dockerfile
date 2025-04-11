# using OpenJDK base image
FROM openjdk:17-jdk-slim

# next Setup the working directory inside the container
WORKDIR /app

# Copy Spring Boot jar file into the container
COPY target/*.jar app.jar

# Expose port 8080 for communication
EXPOSE 8080

# Starting the app
ENTRYPOINT ["java", "-jar", "app.jar"]
