FROM openjdk:17
EXPOSE 8080
COPY student/build/libs/student-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "student-1.0-SNAPSHOT.jar"]
