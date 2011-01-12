import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import no.magott.spring.integration.batch.FilenameBatchLauncher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:batch-integration.xml"})
public class BatchIntegrationTest {

	@Autowired
	private FilenameBatchLauncher launcher;
	
	@Test
	public void launcherErSatt() throws Exception{
		assertThat(launcher, notNullValue());
		Thread.sleep(10000);
	}
	
}
