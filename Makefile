
run:
	mvn clean package && java -jar ./target/app.jar

docker-build:
	docker build . -f ./.provision/java8/Dockerfile -t "javabench:java8"
	docker build . -f ./.provision/java10/Dockerfile -t "javabench:java10"
	docker build . -f ./.provision/java11/Dockerfile -t "javabench:java11"

docker-run:
	docker run -it --rm "javabench:java8"
	docker run -it --rm "javabench:java10"
	docker run -it --rm "javabench:java11"

help:
	@grep --extended-regexp '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-20s\033[0m %s\n", $$1, $$2}'