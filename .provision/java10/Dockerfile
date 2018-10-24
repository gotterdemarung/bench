FROM maven:3.5.4-jdk-10-slim as builder

WORKDIR /build
COPY . /build/
RUN mvn package

FROM openjdk:10.0.2-jre-slim
COPY --from=builder /build/target/app.jar /app.jar
CMD java -jar /app.jar