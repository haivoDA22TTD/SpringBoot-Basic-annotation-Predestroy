package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
			// Gọi Beans
				Jinhsi obj = context.getBean(Jinhsi.class);
			// Hiển thị Beans
				System.out.println("Beans:" + obj);
			// Gọi phương thức Ultimate
				obj.ultimate();
			// Gọi phương thức init
				obj.init();
	}

}
