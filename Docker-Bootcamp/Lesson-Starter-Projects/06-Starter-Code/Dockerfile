## 1. Which base image do you want to use?
FROM maven:3.8-openjdk-17-slim

## 2. Set the working directory.
WORKDIR /app

## 3. Copy the application's project files into the working directory.
COPY /SpringBoot-Demo .

## 4. Document and inform the developer that the application will use the container port: 8080.
EXPOSE 8080

## CAUTION: ONLY HAVE ONE OF STEPS 5 ACTIVE.
## These are three different methods of running a Spring-Boot App.

## 5. Define the command to run when the container starts.
# CMD [ "mvn", "clean", "spring-boot:run" ]

## 5. Better option, install the dependencies in the image building phase.
RUN mvn install
CMD [ "mvn", "spring-boot:run" ]

## 5. Packaging option. Package everything and then run the jar file.
# RUN mvn package
# CMD [ "java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar" ]