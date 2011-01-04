package no.magott.spring.batch.stepscope;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.FactoryBean;

public class CountingFactoryBean implements FactoryBean<Message> {

	private static AtomicInteger invocationCount;
	private String message;

	public Message getObject() throws Exception {
		int count = invocationCount.incrementAndGet();
		return new SimpleMessage(message + " count: "+count);
	}

	public Class<?> getObjectType() {
		return Message.class;
	}

	public boolean isSingleton() {
		return true;
	}

	public void setMessageString(String message) {
		this.message = message;
	}

	
}
