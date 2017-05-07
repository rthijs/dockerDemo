package dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
	// run with: 	mvn spring-boot:run
	// build jar: 	mvn clean package
	// run jar: 	java -jar target/dockerdemo-0.0.1-SNAPSHOT.jar
}