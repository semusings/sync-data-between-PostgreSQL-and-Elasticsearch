infra: ## Launch
	#mkdir -p build/docker/esdata && \
#	sudo chown -R 1000:root build/docker/esdata && \
 	docker-compose rm -f -s -v && \
 	docker-compose up -d && \
 	watch "docker ps -a"

clean: ## Cleanup
	docker-compose rm -f -s -v && \
	rm -rf node_modules/ package-lock.json && \
	sudo rm -rf build/ && \
 	./gradlew clean
