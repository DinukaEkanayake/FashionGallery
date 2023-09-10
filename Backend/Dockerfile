#stage 1 - build stage
FROM maven as stage1

WORKDIR Backend/app

COPY Backend/pom.xml .

COPY Backend/src .

RUN mvn clean install

#stage 2 - running stage
FROM openjdk

WORKDIR Backend/app

EXPOSE 8080

COPY --from=stage1 target/*.jar /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]


