package sg.edu.nus.iss.d11wkshp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import java.util.Collections;


@SpringBootApplication
public class D11wkshpApplication {

	public static void main(String[] args) {
		//SpringApplication.run(D11wkshpApplication.class, args);
		SpringApplication app = new SpringApplication(D11wkshpApplication.class);

		String port = "8080";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);

		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);
	}

}
