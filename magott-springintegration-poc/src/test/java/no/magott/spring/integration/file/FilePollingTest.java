package no.magott.spring.integration.file;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:file-polling.xml")
public class FilePollingTest {

	@Value("${java.io.tmpdir}")
	private String tempDir;
	
	@Test
	public void printTempDir() throws Exception{
		System.out.println(tempDir);
		Thread.sleep(10000);
	}
	
}
