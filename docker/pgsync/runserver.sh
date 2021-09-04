#! /bin/sh
./wait-for-it.sh -h "$PG_HOST" -p "$POSTGRES_PORT" -t 60
./wait-for-it.sh -h "$ELASTICSEARCH_HOST" -p "$ELASTICSEARCH_PORT"  -t 60
./wait-for-it.sh -h "$REDIS_HOST" -p "$REDIS_PORT" -t 60

bootstrap --config configs/schema.json
pgsync --config configs/schema.json --daemon
