package com.khanna.weather.business.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.khanna.weather.business.utils.DateUtils;

@SpringBootTest
public class DateUtilsTest {
	Logger logger =LoggerFactory.getLogger(DateUtilsTest.class);
	
	@Test
	public void getDateTextTest() {
		Long dt = 1587783600000L;
		
		String text=DateUtils.getDateText(dt);
		logger.info(text);
	}
}
