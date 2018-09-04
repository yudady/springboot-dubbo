package tk.yudady;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class Dubbo01Consumer {

	@Autowired
	ApplicationContext applicationContext;

	public static void main(String[] args) throws InterruptedException {

		SpringApplication.run(Dubbo01Consumer.class, args);

	}

}
