package tk.yudady;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication
@EnableDubbo
public class Dubbo01Provider {

	public static void main(String[] args) {

		SpringApplication.run(Dubbo01Provider.class, args);
	}
}
