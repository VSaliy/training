package victor.training.java8.voxxed.jobs.birthOfLambdas;

import victor.training.java8.voxxed.jobs.JobParameters;
import victor.training.java8.voxxed.jobs.JobResults;

public class SimplerJob2 {

	public JobResults doWork(JobParameters params) {
		System.out.println("Do Job2 with params");
		return JobResults.success();
	}

}
