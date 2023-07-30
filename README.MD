# Spring GraalVM Native Image 띄어보기  

## 참고  
https://velog.io/@akfls221/Spring-GraalVM-Native-Image

## gradle bootBuildImage

```bash
$ ./gradlew bootBuildImage # linux
$ ./gradlew.bat bootBuildImage # windows
```

## docker build

```bash
$ docker build -t spring-native-web .
```

## docker run

```bash
$ docker run -p 8081:8080 spring-native-web
$ docker run --rm -p 9090:9090 af46c3fc8c235c171ec89abc37e1833903caa47f9861ca8dcbc558a09cdffb33
```
