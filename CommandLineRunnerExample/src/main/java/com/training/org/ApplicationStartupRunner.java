package com.training.org;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;

public class ApplicationStartupRunner implements CommandLineRunner{
	protected final Log logger=LogFactory.getLog(getClass());
	@Override
	public void run(String... args) throws Exception {
		logger.info("ApplicaitonStartupRunner run method is started");

	}
}