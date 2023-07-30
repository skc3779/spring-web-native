# Spring GraalVM Native Image 띄어보기  

Spring Native는 GraalVM에서 실행하기 위해 Spring Boot 애플리케이션을 최적화하는 것을 목표로 하는 프로젝트로, 
이를 통해 시작 시간을 단축하고 메모리 사용량을 줄이기 위해 네이티브 실행 파일로 컴파일할 수 있습니다. 
그러나 네이티브 이미지 생성 프로세스에는 리플렉션 및 동적 클래스 로딩에 대한 엄격한 제한이 포함되며, 
이는 Thymeleaf를 비롯한 특정 라이브러리 및 프레임워크에 어려울 수 있습니다.

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
# docker images 를 이용한 이미지 확인
docker images
docker run -p 8091:8080 spring-web-native:1.0.1      # 포그라운드
docker run -d -p 8091:8080 spring-web-native:1.0.1   # 백그라운드
```

## curl 을 통해 확인하기

```bash
curl http://localhost:8091/tickets
```


### 그외 Docker 관련 명령어가 궁금하다면 아래를 참고하자.

https://github.com/skc3779/spring-web-docker/blob/master/README.MD  


