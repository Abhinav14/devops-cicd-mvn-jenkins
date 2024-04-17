FROM openjdk:17
EXPOSE 8081
ADD target/gfgdevops-0.0.1-SNAPSHOT.jar gfgdevops.jar
CMD java -jar gfgdevops.jar
#ENTRYPOINT [ "java", "-jar", "/sbdockermaven.jar" ]