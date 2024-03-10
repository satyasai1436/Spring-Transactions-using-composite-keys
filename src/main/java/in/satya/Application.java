package in.satya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.satya.service.empladdresService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(Application.class, args);
		empladdresService bean = cxt.getBean(empladdresService.class);
		//bean.saveData();
		bean.get(1);
		
	}

}
