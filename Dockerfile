# 1. Java 17 기반 이미지 사용
FROM openjdk:17-jdk-slim

# 2. JAR 파일 복사 (Gradle로 빌드된 결과물)
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

# 3. 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]
