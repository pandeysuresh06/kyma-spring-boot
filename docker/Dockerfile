FROM openjdk:18
ENV VERSION x.y
WORKDIR /var/app

ADD spring-boot-docker-*.jar /var/app/spring-boot-docker.jar

ENV JAVA_OPTS=""

EXPOSE 8080


CMD java $JAVA_OPTS -jar /var/app/spring-boot-docker.jar