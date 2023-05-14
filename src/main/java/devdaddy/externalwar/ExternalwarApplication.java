package devdaddy.externalwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExternalwarApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ExternalwarApplication.class, args);
	}

	// need to override this should make it a war file
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}
}
