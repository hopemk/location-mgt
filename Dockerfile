 FROM openjdk:8
EXPOSE 8080
ADD target/StudentProfiling-0.0.1-SNAPSHOT.jar StudentProfiling-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar","--server.port=8080"]
