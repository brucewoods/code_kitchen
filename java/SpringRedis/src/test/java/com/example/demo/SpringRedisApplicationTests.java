package com.example.demo; 

 
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.Assert;

@SpringBootTest
class SpringRedisApplicationTests {
    @SuppressWarnings("rawtypes")
	@Autowired
    private RedisTemplate  redisTemplate;
	@Test
	void contextLoads() {
	}
	
	
	@Test
	public  void setValue() {
		redisTemplate.boundValueOps("name").set("redis");
	}
	@SuppressWarnings("deprecation")
	@Test 
	public void getValue() {
		
		 String str=(String)redisTemplate.boundValueOps("name").get();
		 System.out.println(str);
		 Assert.notNull(str);
		 
		
	}
	@Test
	public void setSetValue() {
		
		redisTemplate.boundSetOps("jobs").add("muscle");
		redisTemplate.boundSetOps("jobs").add("programming");
		redisTemplate.boundSetOps("jobs").add("earnmoney");
		
	}
	@Test
	public void getSetValue() {
		Set  jobset=redisTemplate.boundSetOps("jobs").members();
		System.out.println(jobset);
	}
	@Test
	public void deleteSetValue() {
		Long remove=redisTemplate.boundSetOps("jobs").remove("muscle");
		System.out.println(remove);
		Assert.isTrue(remove==1);
	}
	
	@Test
	public void deleteSet() {
		Boolean namesetBoolean=redisTemplate.delete("jobs");
		Assert.isTrue(namesetBoolean==true);
	}
	
	

}
