package com.khanna.weather.business.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtils {

	public static String getDateText(Long dt) {
		LocalDateTime dateTime = LocalDateTime.ofEpochSecond(dt, 0, ZoneOffset.UTC);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
		// return formatter.format(dateTime).toString();
		return dateTime.toString();
	}
}
