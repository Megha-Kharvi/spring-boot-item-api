# Step 1: Build the application
FROM eclipse-temurin:17-jdk-alpine AS build

WORKDIR /app
COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .
COPY src src

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Step 2: Run the application
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app
COPY --from=build /app/target/itemapi-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
