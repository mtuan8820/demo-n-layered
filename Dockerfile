# Build stage
FROM gradle:8.14.3-jdk17 AS builder
WORKDIR /app
COPY . .
RUN gradle build --no-daemon

# Run stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=builder /app/build/libs/demo-n-layered-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]