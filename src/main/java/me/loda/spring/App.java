package me.loda.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class App {
	public static void main(String[] args) {
		// ApplicationContext chính là container, chứa toàn bộ các Bean
		ApplicationContext context = SpringApplication.run(App.class, args);
		
		// Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.
		
		// Lấy Bean ra bằng cách
//		Outfit outfit = context.getBean(Outfit.class);
//		outfit.wear();
		
		Girl girl = context.getBean(Girl.class);
//		girl.outfit.wear();
		
		((ConfigurableApplicationContext)context).getBeanFactory().destroyBean(girl);
    }
}
