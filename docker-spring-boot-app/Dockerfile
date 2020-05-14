FROM openjdk:8
ADD target/docker-spring-boot-app.jar docker-spring-boot-app.jar
EXPOSE 8095
ENTRYPOINT ["java","-jar","docker-spring-boot-app.jar"]