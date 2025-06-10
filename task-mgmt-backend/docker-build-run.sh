./mvnw clean package -DskipTests

docker build -t sushantpatil734/task-mgmt:latest

docker run -p 8090:8090 sushantpatil734/task-mgmt:latest