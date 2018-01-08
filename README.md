# spring-microservice-example
Spring Cloud Microservice Example

## Requirements

### Java 
Java 1.8+

### Zipkin
Download zipkin server from: https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec
start the downloaded jar: java -jar zipkin-server-2.4.3-exec.jar
use browser to access the zipkin UI: http://localhost:9411

## Running order
1. discovery service: http://localhost:8500/
2. edge service: http://localhost:8080/swagger-ui.html
3. user service
4. account service