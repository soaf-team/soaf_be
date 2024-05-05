# Maven을 사용하여 애플리케이션을 빌드하기 위한 이미지를 가져옵니다.
FROM maven:3.8.4-openjdk-17 AS builder

# 작업 디렉토리를 설정합니다.
WORKDIR /app

# 프로젝트의 전체 소스 코드를 복사합니다.
COPY . .

# Maven을 사용하여 애플리케이션을 빌드합니다.
RUN mvn clean package

# 애플리케이션을 실행할 OpenJDK 기반의 JRE 이미지를 가져옵니다.
FROM openjdk:17-alpine

# 작업 디렉토리를 설정합니다.
WORKDIR /app

# 빌드한 JAR 파일을 가져옵니다.
COPY --from=builder /app/target/soaf_be-0.0.1-SNAPSHOT.jar ./app.jar

# 애플리케이션의 포트를 노출합니다. 필요에 따라 포트를 변경하세요.
EXPOSE 8080

# Docker 컨테이너가 시작될 때 실행할 명령을 지정합니다.
CMD ["java", "-jar", "app.jar"]
