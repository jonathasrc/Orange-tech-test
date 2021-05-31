package com.orange.utils;

import java.util.Calendar;
import java.util.Locale;

public class GetDayOfWeek {

	public static String dayOfWeek() {
		Calendar obj = Calendar.getInstance();
		Locale objLocale = new Locale("pt", "BR");
		return obj.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, objLocale);
	}
}
