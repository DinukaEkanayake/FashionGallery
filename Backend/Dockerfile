FROM openjdk:17

WORKDIR Backend/app

EXPOSE 8080

COPY Backend/target/*.jar Backend/app/app.jar

ENTRYPOINT ["java","-jar","Backend/app/app.jar"]


