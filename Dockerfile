FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

COPY target/my-spring-app-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

CMD ["java", "-jar", "app.jar"]
