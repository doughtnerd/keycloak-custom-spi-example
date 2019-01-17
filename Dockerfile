FROM maven:3.6-alpine as mavenImage

COPY src/providers .

RUN mvn clean package -e


FROM jboss/keycloak

COPY src/themes /opt/jboss/keycloak/themes

COPY src/config/standalone.xml /opt/jboss/keycloak/standalone/configuration/

COPY --from=mavenImage */target/*with-dependencies.jar /opt/jboss/keycloak/standalone/deployments/

EXPOSE 8080
