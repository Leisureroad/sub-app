FROM maven:alpine
MAINTAINER Fan Liu
EXPOSE 8080
COPY . /opt/workspace/
WORKDIR /opt/workspace/
WORKDIR /
CMD ["java", "-jar", "/opt/workspace/target/SubSvc-0.0.1-SNAPSHOT.jar"]