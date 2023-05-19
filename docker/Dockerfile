FROM openjdk:18
WORKDIR /app
ADD target/spring-boot-docker-*.jar /app/spring-boot-docker.jar
ENV JAVA_OPTS=""
EXPOSE 8080



ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]
