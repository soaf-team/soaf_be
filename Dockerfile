# Use the official Maven image to create a build artifact.
# Use an image with JDK 17
FROM maven:3.8.4-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

# Use the official OpenJDK image for a lean runtime environment.
FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY --from=build /home/app/target/*.jar app.jar

# Expose port 8080 for the application
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
