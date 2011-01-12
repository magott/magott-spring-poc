package no.magott.spring.integration.batch;

import java.io.File;
import java.util.Collections;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;

public class FilenameBatchLauncher {

	@Autowired
	private JobLauncher launcher;
	
	@Autowired
	private Job job;
	
	public JobExecution launchJob(File file) throws JobExecutionException{
		
		Map<String, JobParameter> map = Collections.singletonMap("postnummer.filename", new JobParameter("file:"+file.getAbsolutePath()));
		JobParameters jobParameters = new JobParameters(map);
		JobExecution jobExecution = launcher.run(job, jobParameters);
		return jobExecution;
	}
	
}
