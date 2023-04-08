FROM openjdk:17-jdk-slim-buster
WORKDIR /SpringNativeApp

COPY SpringNativeApp/build/lib/* build/lib/

COPY SpringNativeApp/build/libs/springnativeapp.jar build/

WORKDIR /SpringNativeApp/build
ENTRYPOINT java -jar springnativeapp.jar