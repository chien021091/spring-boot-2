package me.loda.spring;

import org.springframework.stereotype.Component;

@Component
public class Bikini implements Outfit {

	@Override
	public void wear() {
		System.out.println("Mac bikini");
	}

}
