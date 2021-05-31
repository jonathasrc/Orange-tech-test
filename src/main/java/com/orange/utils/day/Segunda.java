package com.orange.utils.day;

public class Segunda implements Day{

	@Override
	public boolean circular(String year) {
		return !(year.endsWith("0") || year.endsWith("1"));
	}

}
