package com.orange.utils.day;

public class Sexta implements Day{

	@Override
	public boolean circular(String year) {
		return !(year.endsWith("8") || year.endsWith("9"));
	}

}
