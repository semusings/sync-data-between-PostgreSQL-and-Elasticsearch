dbs: ## dbs
	docker-compose up -d postgresql elasticsearch redis

pgsync: ## pgsync
	docker-compose up pgsync

clean:
	docker stop $$(docker ps -a -q) && docker system prune
