package me.loda.spring.componentservicerepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.commons.lang3.RandomStringUtils;

@Service
public class GirlService {
	
	@Autowired
	GirlRepository girlRepository;

	public Girl getRandomGirl() {
		String name = randomGirlName(10);
		Girl girl = girlRepository.getGirlByName(name);
		
		return girl;
		
	}
	
	public String randomGirlName(int length) {
        // Random một string có độ dài quy định
        // Sử dụng thư viện Apache Common Lang
        return RandomStringUtils.randomAlphanumeric(length).toLowerCase();
    }
}
