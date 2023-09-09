#stage 1 - build stage
FROM maven as stage1

WORKDIR /app

COPY pom.xml .

COPY . .

RUN mvn clean install
#no java 17 runtime
FROM openjdk

WORKDIR /app

EXPOSE 8080

COPY --from=stage1 /app/target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]


