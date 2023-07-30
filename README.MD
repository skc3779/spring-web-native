# Spring GraalVM Native Image 띄어보기  

## 참고  
https://velog.io/@akfls221/Spring-GraalVM-Native-Image

## gradle bootBuildImage

아래와 같이 빌드가 되지 않는다면, intellij gradle Tasks 에서 bootBuildImage 를 실행해보자.

```bash
./gradlew bootBuildImage # linux
./gradlew.bat bootBuildImage # windows
```

## docker build

```bash
# docker build -t <도커계정명>/<프로젝트명>:1.0.1 .
docker build -t skc3779/spring-web-native .
```

## docker run

```bash
$ docker run -p 8081:8080 spring-native-web
```

### 그외 Docker 관련 명령어가 궁금하다면 아래를 참고하자.

https://github.com/skc3779/spring-web-docker/blob/master/README.MD  


