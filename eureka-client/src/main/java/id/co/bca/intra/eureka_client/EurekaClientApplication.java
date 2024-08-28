package id.co.bca.intra.eureka_client;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurekaClientApplication {

	@Autowired
	private EurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);

	}

	@GetMapping("/greeting")
	public String greeting() {
		InstanceInfo info = eurekaClient
				.getApplication("eureka-client")
				.getInstances()
				.get(0);

		String host = info.getHostName();

		int port = info.getPort();

		return String.format("Pesan sudah diterima '%s':'%s'", host, port);
	}
}
