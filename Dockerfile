FROM gradle:7.6.1-jdk17-alpine

COPY . .

EXPOSE 8080

RUN gradle clean build


ENTRYPOINT ["java", "-jar","build/libs/task-0.0.1-SNAPSHOT.jar"]