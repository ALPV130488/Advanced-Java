package com.loggers;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.BasicConfigurator;

public class LoggingExample {
	
	static Logger logger =Logger.getLogger("LoggingExample.class");
	public static void main(String[] args) {
		
//		BasicConfigurator.configure();
		PropertyConfigurator.configure("mylogging.properties");
		logger.debug("Debug Message");
		logger.info("info Message");
		logger.warn("warn Message");
		logger.fatal("fatal Message");
		
	
		
	}
   
}