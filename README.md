Шаблон проекта для микросервисов на Java 
========================================
Описание
--------
Шаблон веб сервиса на базе Spring Boot. Можно использовать для быстрого старта проектов.

Как собрать и запустить
-
#### Сборка .jar и запуск без Docker
1. Собрать jar файл
```bash
$ gradlew clean build
```

2. Запустить jar
```bash
$ java -jar spring-boot-rest-skeleton.jar -XX:+UseG1GC -Xmx256m
```

### Сборка Docker image
3. Собрать docker image
```bash
$ gradlew clean buildDocker -Dbuild.number=${BUILD_NUMBER}
```

4. Запустить контейнер на 80 порту хоста
```bash
$ docker run -d -p 80:8080 --env SPRING_BOOT_ADMIN_HOST=localhost --env SPRING_BOOT_ADMIN_PORT=8282 --name container_name image_name:version
```
