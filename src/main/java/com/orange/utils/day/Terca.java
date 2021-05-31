package com.orange.utils.day;

public class Terca implements Day{

	@Override
	public boolean circular(String year) {
		return !(year.endsWith("2") || year.endsWith("3"));
	}

}
