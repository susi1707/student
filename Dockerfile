FROM openjdk:17
ADD student/build/libs/student.jar student.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/student.jar"]