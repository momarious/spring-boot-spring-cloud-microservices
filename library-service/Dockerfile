FROM openjdk:8-jdk-alpine

ENV SPRING_APPLICATION_NAME=library-service
ENV SPRING_PROFILES_ACTIVE=development

EXPOSE 8880

COPY target/*.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
