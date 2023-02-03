# Build stage
FROM maven:3.8.1-openjdk-17-slim AS build

# WORKDIR /home/app

COPY src /home/app/src
COPY pom.xml /home/app

RUN mvn -f /home/app/pom.xml clean package

# Run stage
FROM openjdk:17-jdk-slim

RUN apt-get update && apt-get install -y maven

WORKDIR /project

COPY --from=build /home/app/target/reservation-service-0.0.1-SNAPSHOT.jar /project/reservation-service.jar

EXPOSE 8881

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dblabla", "-jar","/project/reservation-service.jar"]
