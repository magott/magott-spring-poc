package no.magott.spring.batch.stepscope;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.test.MetaDataInstanceFactory;
import org.springframework.batch.test.StepScopeTestExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@ContextConfiguration(locations={"stepscope-simple-test.xml"})
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class, 
    StepScopeTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class SimpleCountingFactoryBeanTest {

	@Autowired
	private Message message;
	@Autowired
	private Message message2;

	@Test
	public void messageIsSameInstanceForEachInvocation() throws Exception{
		assertThat(message, sameInstance(message2));
	}
	
	@Test
	public void countRemainsSameAfterConsecutiveAccessOfMessage(){
		int messagecount1 = message.getCount();
		int message2count1 = message2.getCount();
		int messagecount2 = message.getCount();
		assertThat(message.getMessage(), equalTo("bar"));
		assertThat(messagecount1, equalTo(message2count1));
		assertThat(message2count1, equalTo(messagecount2));
	}
	
    public StepExecution getStepExection() {
    	System.out.println("getStepExecution");
        JobParametersBuilder paramBuilder = new JobParametersBuilder();
        paramBuilder.addString("foo", "bar");
    	StepExecution execution = MetaDataInstanceFactory.createStepExecution(paramBuilder.toJobParameters());
        return execution;
    }		
	
}
