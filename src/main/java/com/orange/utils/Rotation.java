package com.orange.utils;

import com.orange.utils.day.Day;

public class Rotation {

	public static boolean podeCircularNoRodizio(String year, Day day) {
		return day.circular(year);
	}

	public static boolean podeCircularNoRodizio(String year, String day) {
		Day d = null;

		try {
			d = (Day) Class.forName("com.orange.utils.day." + day).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d.circular(year);
	}
}
