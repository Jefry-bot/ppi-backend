FROM openjdk:18.0.2.1 as builder

WORKDIR /app

COPY ./build/libs/service-gateway-1.0.jar .

ENTRYPOINT java -jar ./service-gateway-1.0.jar