FROM openjdk:8
LABEL maintainer="vlad.bell92@gmail.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/inventory-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} spring-boot-proj.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-proj.jar"]