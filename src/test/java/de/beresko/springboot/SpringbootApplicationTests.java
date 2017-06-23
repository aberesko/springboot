package de.beresko.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootApplicationTests {

	@Autowired
	TestRestTemplate template;

	@Test
	public void contextLoads() {
		Customer customer = template.getForObject("/customer?id=1", Customer.class);
		Assert.assertTrue(customer.getName() != null);
		System.out.println(customer);
	}

}
