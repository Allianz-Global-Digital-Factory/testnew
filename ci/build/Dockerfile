FROM maven:3.6.3-jdk-11-slim

RUN mkdir /jar/

WORKDIR /jar/

COPY application/target/testnew.jar /jar/testnew.jar

ENV JAR_FILE=testnew LOG_PATH=/var/log/testnew

CMD ["java","-jar","/jar/testnew.jar"]
