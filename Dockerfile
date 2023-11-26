FROM openjdk:17
EXPOSE 8080
ADD ./build/libs/student-0.0.1-SNAPSHOT.war student-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java", "-war", "/student-0.0.1-SNAPSHOT.war"]
