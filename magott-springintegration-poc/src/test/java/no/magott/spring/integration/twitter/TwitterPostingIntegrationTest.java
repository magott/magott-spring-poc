package no.magott.spring.integration.twitter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.twitter.core.Twitter4jTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:twitter-posting.xml"})
public class TwitterPostingIntegrationTest {
	
	@Autowired
	private Twitter4jTemplate twitterTemplate;
	
	@Autowired
	@Qualifier("twitterChannel")
	private MessageChannel channel;
	
	@Test
	public void twitterTemplateIsSet(){
		assertThat(twitterTemplate, notNullValue());
	}
	
	@Test
	public void canPostToTwitter(){
		Message<String> tweet = MessageBuilder.withPayload("TwitterPostingIntegrationTest "+ new Date()).build();
		boolean send = channel.send(tweet);
		assertThat(send, is(true));
	}
}
