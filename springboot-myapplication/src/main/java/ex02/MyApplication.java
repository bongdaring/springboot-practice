package ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


// 이게 ex01과 차이점
@SpringBootConfiguration
public class MyApplication {

	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class,args)){};
	}

}