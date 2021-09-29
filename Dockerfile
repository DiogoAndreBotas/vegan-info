FROM adoptopenjdk/openjdk11:debian-slim as BUILD
LABEL maintainer='Diogo Botas'

WORKDIR /workspace/app
COPY . /workspace/app
RUN ./gradlew build --no-daemon

FROM adoptopenjdk/openjdk11:debian-slim as PRODUCTION
WORKDIR /app
VOLUME /tmp
COPY --from=build /workspace/app/build/libs/*.jar vegan-info.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/vegan-info.jar"]
