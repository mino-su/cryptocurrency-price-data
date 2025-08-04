package cryptocurrency.price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication()
public class PriceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(PriceApplication.class, args);
		SpringApplication.exit(run);
	}

}
