FROM maven:3.6.3 AS maven
LABEL MAINTAINER="pandeysuresh06@gmail.com"

WORKDIR /usr/src/app
COPY . /usr/src/app
# Compile and package the application to an executable JAR
RUN mvn package

FROM openjdk:17
ARG JAR_FILE=spring-boot-docker-0.5.0.jar
WORKDIR /var/app
COPY  --from=maven /usr/src/app/target/${JAR_FILE} /var/app/
ENV JAVA_OPTS=""
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-boot-docker-0.5.0.jar"]
