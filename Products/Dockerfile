# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container at /app
COPY target/products-service.jar /app

# Make port 8081 available to the world outside this container
EXPOSE 8081

# Run the jar file
CMD ["java", "-jar", "products-service.jar"]
LABEL authors="Rushi"

ENTRYPOINT ["top", "-b"]
