package me.loda.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Naked implements Outfit {

	@Override
	public void wear() {
		System.out.println("Khong mac  bikini");
	}
}
