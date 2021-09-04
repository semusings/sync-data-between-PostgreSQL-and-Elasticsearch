dbs: ## dbs
	docker-compose up -d postgresql elasticsearch

pgsync: ## pgsync
	docker-compose up -d redis pgsync
