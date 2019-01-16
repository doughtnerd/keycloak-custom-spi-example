FROM jboss/keycloak

COPY themes /opt/jboss/keycloak/themes

COPY config/standalone.xml /opt/jboss/keycloak/standalone/configuration/

COPY */target/*with-dependencies.jar /opt/jboss/keycloak/standalone/deployments/

ENV KEYCLOAK_USER admin
ENV KEYCLOAK_PASSWORD password

EXPOSE 8080
