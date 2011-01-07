package no.magott.spring.batch.stepscope;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class CountingFactoryBean implements FactoryBean<Message>, InitializingBean {

	private final static AtomicInteger invocationCount = new AtomicInteger();
	private String message;
	private Message instance;
	
	public void afterPropertiesSet() throws Exception {
		int count = invocationCount.incrementAndGet();
		instance = new SimpleMessage(message,count);
	}

	public Message getObject() throws Exception {
		return instance;
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
