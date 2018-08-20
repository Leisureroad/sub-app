FROM openjdk:latest
MAINTAINER Fan Liu
EXPOSE 8080
COPY ./target/SubSvc-0.0.1-SNAPSHOT.jar /opt/workspace/
WORKDIR /opt/workspace/
WORKDIR /
CMD ["java", "-jar", "/opt/workspace/SubSvc-0.0.1-SNAPSHOT.jar"]