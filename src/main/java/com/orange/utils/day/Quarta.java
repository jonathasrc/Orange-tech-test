package com.orange.utils.day;

public class Quarta implements Day{

	@Override
	public boolean circular(String year) {
		return !(year.endsWith("4") || year.endsWith("5"));
	}

}
