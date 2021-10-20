
Issue: https://github.com/spring-projects/spring-framework/issues/27564

----

To run

```
>  mvn -Pnative package -DskipTests;
> ./target/spring-native-resources
```
OR
```
> mvn spring-boot:build-image
> docker run -p 8080:8080 docker.io/library/spring-native-resources:0.0.1-SNAPSHOT
```

Then, access to http://localhost:8080

----

This worked with Spring Boot `2.6.0-M3` but failed with `2.6.0-SNAPSHOT`.
The snapshot version I used is `spring-boot-2.6.0-20211020.003406-368.jar`. 
