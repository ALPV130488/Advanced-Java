package com.report;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.BasicConfigurator;

public class Report {
	
	static Logger logger =Logger.getLogger("Report.class");
	public void generateReport(){

		logger.debug("Debug Message");
		logger.info("info Message");
		logger.warn("warn Message");
		logger.fatal("fatal Message");
		
	}
   
}