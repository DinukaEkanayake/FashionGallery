#stage 1 - build stage
FROM maven as stage1

WORKDIR /app

COPY Backend/pom.xml .

COPY Backend/ ./

RUN mvn clean install

#stage 2 - running stage
FROM openjdk

WORKDIR /app

EXPOSE 8080

COPY --from=stage1 /app/target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]


