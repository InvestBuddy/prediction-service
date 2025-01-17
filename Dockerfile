# Use JDK 21 as the base image
FROM openjdk:21-jdk
 
# Set working directory
WORKDIR /app

# Copy the JAR file and rename it to user-profile-service.jar
COPY target/prediction-service-1.0-SNAPSHOT.jar prediction-service.jar

# Expose port
EXPOSE 8085

# Run the application
ENTRYPOINT ["java", "-jar", "prediction-service.jar"]
