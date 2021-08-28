FROM openjdk:11-jdk-slim

COPY "./target/bcp-basic-backend-challenge-0.0.1-SNAPSHOT.jar" "bcp-basic-backend-challenge.jar"

CMD ["java","-jar","bcp-basic-backend-challenge.jar"]