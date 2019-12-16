FROM openjdk:8
COPY ./target/HelloWorld-0.0.1-SNAPSHOT.jar HelloWorld-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","HelloWorld-0.0.1-SNAPSHOT.jar"]
