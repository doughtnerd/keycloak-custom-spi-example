include .env
default: build

.PHONY: build
build:
ifeq ($(USE_COMPOSE),)
	$(info building with docker)
	docker build -t doughtnerd/keycloak .
else
	$(info building with docker-compose)
	docker-compose build keycloak
endif

.PHONY: start
start: build
ifeq ($(USE_COMPOSE),)
	docker run --rm -p 8080:8080 --name keycloak doughtnerd/keycloak
else
	docker-compose up
endif
