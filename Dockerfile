FROM eclipse-temurin:17-jdk-alpine as prod
EXPOSE 8080
ADD target/itsmyapps.jar itsmyapps.jar
ENTRYPOINT ["java","-jar","/itsmyapps.jar"]