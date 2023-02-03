# Build stage
FROM maven:3.8.1-openjdk-17-slim AS build

# WORKDIR /home/app

COPY src /home/app/src
COPY pom.xml /home/app

RUN mvn -f /home/app/pom.xml clean package

# Run stage
FROM openjdk:17-jdk-slim

# If As you are using alpine base image not ubuntu. So, the package manager for alpine is apk not apt or apt-get
RUN apt-get update && apt-get install -y maven

WORKDIR /project

COPY --from=build /home/app/target/config-server-0.0.1-SNAPSHOT.jar /project/config-server.jar

EXPOSE 8888

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dblabla", "-jar","/project/config-server.jar"]
