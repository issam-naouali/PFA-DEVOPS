FROM openjdk:8
ADD target/clinique-0.0.1-SNAPSHOT.jar clinique-0.0.1-SNAPSHOT.jar
EXPOSE 8686
ENTRYPOINT ["java", "-jar","clinique-0.0.1-SNAPSHOT.jar"]
