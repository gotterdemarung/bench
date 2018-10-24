FROM maven:3.5.4-jdk-8-slim as builder

WORKDIR /build
COPY . /build/
RUN mvn package

FROM openjdk:8u171-jre-alpine
COPY --from=builder /build/target/app.jar /app.jar
CMD java -jar /app.jar