FROM openjdk:17

WORKDIR /app

EXPOSE 8080

ADD target/*.jar /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]


