FROM openjdk:17
EXPOSE 8080
ADD ./build/libs/student-1.0-SNAPSHOT.war student-1.0-SNAPSHOT.war
ENTRYPOINT ["java", "-war", "/student-1.0-SNAPSHOT.war"]
