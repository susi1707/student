FROM openjdk:17
EXPOSE 8080
ADD ./build/libs/student-1.0-SNAPSHOT.jar student-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/student-1.0-SNAPSHOT.jar"]
