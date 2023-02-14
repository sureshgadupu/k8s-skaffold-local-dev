FROM eclipse-temurin:17.0.6_10-jdk-jammy as build
COPY mvnw ./
COPY pom.xml ./
COPY src src
RUN chmod a+rx mvnw
RUN --mount=type=cache,target=/root/.m2,rw
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17.0.6_10-jdk-jammy
COPY --from=build "./target/*.jar" /app.jar
RUN addgroup --system springboot && adduser --system sbuser && adduser sbuser springboot
USER sbuser
ENTRYPOINT ["java", "-jar", "/app.jar"]
