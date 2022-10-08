package link.attech.plurasightspringCloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PlurasightSpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlurasightSpringCloudConfigApplication.class, args);
	}

}
