FROM openjdk:8
LABEL maintainer="arzajasmelia@gmail.com"
VOLUME /tmp
#ARG JAR_FILE = ./build/libs/springboot-add-nasabah-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} springboot-add-nasabah.jar
ADD target/springboot-add-nasabah-0.0.1-SNAPSHOT.jar springboot-add-nasabah-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","springboot-add-nasabah-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java","-jar","project-spring-boot-0.0.1-SNAPSHOT.jar"]