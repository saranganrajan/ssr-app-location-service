FROM openjdk:17-oracle
COPY target/ssr-app-location-service-1.0.0.jar ssr-app-location-service-1.0.0.jar
ENTRYPOINT ["java","-jar","/ssr-app-location-service-1.0.0.jar"]