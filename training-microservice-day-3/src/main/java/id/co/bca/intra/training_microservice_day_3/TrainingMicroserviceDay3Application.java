package id.co.bca.intra.training_microservice_day_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TrainingMicroserviceDay3Application {

	public static void main(String[] args) {
		SpringApplication.run(TrainingMicroserviceDay3Application.class, args);
	}

}
