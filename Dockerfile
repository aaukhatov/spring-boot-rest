FROM java:8
MAINTAINER Andrey Etin <etin@nsd.ru>

COPY build/libs/template-microservice.jar /home/template-microservice.jar

ENTRYPOINT ["java", "-jar", "/home/template-microservice.jar", "-Xmx256M", "-XX:+UseG1GC"]