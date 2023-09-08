#stage 1 - build stage
#rich base image
FROM ubuntu as stage1
#
#COPY src Backend/app/src
#
#WORKDIR Backend/app
RUN apt update && apt install -y maven

COPY pom.xml .

RUN mvn clean install

#COPY Backend/target/*.jar Backend/app/app.jar

#stage 2 - running stage
FROM openjdk:17

WORKDIR Backend/app

EXPOSE 8080

COPY --from=stage1 Backend/target/*.jar Backend/app/app.jar

ENTRYPOINT ["java","-jar","Backend/app/app.jar"]


