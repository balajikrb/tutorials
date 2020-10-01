FROM openjdk:14-jdk-oraclelinux7

VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} myjar.jar

ENV PATH="${PATH}:${JAVA_HOME}/bin"
ENTRYPOINT ["java", "-XX:+ShowCodeDetailsInExceptionMessages", "-jar", "myjar.jar"]
