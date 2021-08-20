# Preparing environment

## Run Database 
```shell script
docker volume create postgres_test
docker run -d --volume postgres_test:/var/lib/postgresql/data --name postgres_test -ePOSTGRES_USER=postgres  -e POSTGRES_PASSWORD=pass -e POSTGRES_DB=test -p 5432:5432 postgres
```
## Entry to database
```shell script
docker exec -it  postgres_test /bin/bash
su postgres
psql 
```
# getting-started Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```
## Testing application
```
curl -w"\n" localhost:8080/hello 
curl -w"\n" localhost:8080/fruit
```

Trying database
```
curl -w"\n" -XPOST localhost:8080/person -d'{"name": "Jesus","birthDate": "1966-12-23"}' -H "Content-Type: application/json
curl -w"\n" localhost:8080/person
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.


## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/getting-started-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
