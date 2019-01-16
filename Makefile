build:
	docker build -t doughtnerd/keycloak .

start: build
	docker run --rm -p 8080:8080 --name keycloak doughtnerd/keycloak
