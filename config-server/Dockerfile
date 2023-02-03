# Build stage
FROM maven:3-jdk-8-alpine AS build

# WORKDIR /home/app

COPY src /home/app/src
COPY pom.xml /home/app

RUN mvn -f /home/app/pom.xml clean package

# Run stage
FROM openjdk:8-jdk-alpine

# If As you are using alpine base image not ubuntu. So, the package manager for alpine is apk not apt or apt-get
RUN apk update && apk add maven

WORKDIR /project

COPY --from=build /home/app/target/config-server-0.0.1-SNAPSHOT.jar /project/config-server.jar

EXPOSE 8888

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dblabla", "-jar","/project/config-server.jar"]
