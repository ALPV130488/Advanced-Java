package com.admin;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.report.Report;

import org.apache.log4j.BasicConfigurator;

public class Admin {

	static Logger logger = Logger.getLogger("Admin.class");

	public static void main(String[] args) {

		PropertyConfigurator.configure("mylogging.properties");
		logger.debug("Debug Message");
		logger.info("info Message");
		logger.warn("warn Message");
		logger.fatal("fatal Message");
		Report obj = new Report();

		obj.generateReport();

	}

}