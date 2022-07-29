FROM adoptopenjdk/openjdk11
LABEL description="rest server to attract waste"
WORKDIR /opt
COPY target/attractor-1.0-SNAPSHOT.jar attractor.jar
ENTRYPOINT ["java", "-jar", "attractor.jar"]
EXPOSE 8181