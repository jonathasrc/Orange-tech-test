package com.orange.utils.day;

public class Quinta implements Day{

	@Override
	public boolean circular(String year) {
		return !(year.endsWith("6") || year.endsWith("7"));
	}

}
