package no.magott.spring.integration.batch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchIntegrationApp {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("batch-integration.xml");
	}
	
}
