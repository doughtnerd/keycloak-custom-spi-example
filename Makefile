build:
	mvn clean package
	docker build -t ccarlson/keycloak-playground .

start: build
	docker run --rm -p 8080:8080 --name keycloak ccarlson/keycloak-playground
