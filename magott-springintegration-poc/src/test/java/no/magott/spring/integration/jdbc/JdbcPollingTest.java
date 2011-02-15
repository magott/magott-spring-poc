package no.magott.spring.integration.jdbc;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.Message;
import org.springframework.integration.channel.AbstractPollableChannel;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:jdbc-integration.xml")
public class JdbcPollingTest {

    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private AbstractPollableChannel databaseReturnValues;
    
    @Test(timeout=5000)
    public void run() throws InterruptedException{
        assertThat(dataSource, notNullValue());
        Message<?> message = databaseReturnValues.receive();
        assertThat(message,notNullValue());
        assertThat(message.getPayload(), notNullValue());
        System.out.println("The message from the database: "+message);
    }
}
