
FROM openjdk:8

COPY spring-boot-rest-skeleton*.jar app.jar

COPY app-entrypoint.sh app-entrypoint.sh
RUN chmod +x /app-entrypoint.sh

ENTRYPOINT ["/app-entrypoint.sh"]