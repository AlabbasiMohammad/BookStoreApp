#FROM ubuntu:latest
#LABEL authors="mohammadal-abbasi"
#
#ENTRYPOINT ["top", "-b"]


# Use Docker buildkit syntax
# Multi-stage build: build with Maven, run with a lightweight JRE
FROM maven:3.9.9-eclipse-temurin-17 AS builder

LABEL maintainer="mohammadal-abbasi"

WORKDIR /workspace

# Copy pom first to leverage Docker layer caching for dependencies
COPY pom.xml ./
COPY .mvn/ .mvn/
RUN mvn -B dependency:go-offline

# Copy source and build the application (skip tests for faster builds; remove -DskipTests to run tests)
COPY src ./src
RUN mvn -B -DskipTests package

# Runtime image
FROM eclipse-temurin:17-jre

LABEL maintainer="mohammadal-abbasi"

WORKDIR /app

# Copy the built jar from the builder stage
COPY --from=builder /workspace/target/*.jar app.jar

# Expose the typical Spring Boot port (adjust if your app uses a different port)
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]