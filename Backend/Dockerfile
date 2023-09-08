FROM openjdk:17

WORKDIR Backend/app

COPY Backend/target/*.jar Backend/app/app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","Backend/app/app.jar"]


