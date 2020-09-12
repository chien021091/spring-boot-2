package me.loda.spring;

import org.springframework.stereotype.Component;

@Component("naked")
public class Naked implements Outfit {

	@Override
	public void wear() {
		System.out.println("Khong mac  bikini");
	}
}
