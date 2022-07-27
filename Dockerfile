FROM openjdk:11
ADD target/comprehensive-assessment-0.0.1-SNAPSHOT.jar comprehensive-assessment-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","comprehensive-assessment-0.0.1-SNAPSHOT.jar"]