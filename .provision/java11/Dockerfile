FROM maven:3.5.4-jdk-11-slim as builder

WORKDIR /build
COPY . /build/
RUN mvn package

FROM openjdk:11.0.1-jre-slim
COPY --from=builder /build/target/app.jar /app.jar
CMD java -jar /app.jar