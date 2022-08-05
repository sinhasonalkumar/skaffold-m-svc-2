FROM openjdk:17-alpine as builder
WORKDIR /application
ARG JAR_FILE=target/m-svc-2.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract

#FROM gcr.io/distroless/java17-debian11
FROM openjdk:17-alpine
                
EXPOSE 8080

WORKDIR /application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
        
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]