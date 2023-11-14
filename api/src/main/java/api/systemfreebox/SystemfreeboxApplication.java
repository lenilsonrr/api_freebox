package api.systemfreebox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("http://10.0.2.240:8081")
public class SystemfreeboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemfreeboxApplication.class, args);
	}

}
