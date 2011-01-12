package no.magott.spring.integration.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;

public class FilenameBatchLauncher {

	@Autowired
	private JobLauncher launcher;
	
	@Autowired
	private Job job;
	
	public JobExecution launchJob(String fileName) throws JobExecutionException{
		JobParametersBuilder jobParamBuilder = new JobParametersBuilder();
		jobParamBuilder.addString("input.file.name", fileName);
//		JobExecution jobExecution = launcher.run(job, jobParamBuilder.toJobParameters());
		System.out.println(jobParamBuilder);
		return new JobExecution(1L);
	}
	
}
