 FROM openjdk
 MAINTAINER cdc895642
 RUN apt-get update && apt-get install -y maven

 COPY . /home/DockerMysqlTest
 RUN cd /home/DockerMysqlTest && mvn install
 CMD ["java", "-jar", "/home/DockerMysqlTest/target/mysql-test-0.0.1-SNAPSHOT.jar"]