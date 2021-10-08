package com.project.main.scheduler;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class Scheduler {
	
	@Scheduled(cron="* * * * * *")
	public void testMethod() {
		
	}
}
