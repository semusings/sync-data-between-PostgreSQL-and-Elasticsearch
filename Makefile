.PHONY: help
.DEFAULT_GOAL := help
help:
	@echo "---------------------------------------------------------------------------------------"
	@echo ""
	@echo "				CLI"
	@echo ""
	@echo "---------------------------------------------------------------------------------------"
	@echo ""
	@awk 'BEGIN {FS = ":.*##"; printf "Usage: make \033[36m<target>\033[0m\n"} /^[a-zA-Z_-]+:.*?##/ { printf "  \033[36m%-25s\033[0m %s\n", $$1, $$2 } /^##@/ { printf "\n\033[1m%s\033[0m\n", substr($$0, 5) } ' $(MAKEFILE_LIST)

##@ Development

cli_install: ## Install
	npm install
cli_build: ## Build
	docker-compose build
cli_dbs: ## Databases
	docker-compose up -d postgresql elasticsearch redis
cli_docs: ## Documentation
	npm run start
cli_pgsync: ## PGSync
	docker-compose up pgsync
cli_clean: ## Cleanup
	docker stop $$(docker ps -a -q) && docker system prune
