FROM adoptopenjdk/openjdk11
LABEL description="client to generate waste"
ENV ATTR_IP="172.21.0.1"
RUN echo $ATTR_IP
WORKDIR /opt
COPY target/waste-1.0-SNAPSHOT.jar waste-client.jar
ENTRYPOINT ["java", "-jar", "waste-client.jar"]
