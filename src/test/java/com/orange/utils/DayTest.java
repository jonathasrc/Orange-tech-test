package com.orange.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.orange.utils.day.Day;
import com.orange.utils.day.Quarta;
import com.orange.utils.day.Quinta;
import com.orange.utils.day.Segunda;
import com.orange.utils.day.Sexta;
import com.orange.utils.day.Terca;

@SpringBootTest
class DayTest {

	@Test
	public void placaFinal0e1NaSegundaTest() {
		Day day = new Segunda();
		assertFalse(day.circular("2000"));
		assertFalse(day.circular("2001"));
		
		assertTrue(day.circular("2002"));

	}
	
	@Test
	public void placaFinal2e3NaTercaTest() {
		Day day = new Terca();
		assertFalse(day.circular("2002"));
		assertFalse(day.circular("2003"));
		
		assertTrue(day.circular("2001"));

	}
	@Test
	public void placaFinal4e5NaQuartaTest() {
		Day day = new Quarta();
		assertFalse(day.circular("2004"));
		assertFalse(day.circular("2005"));
		
		assertTrue(day.circular("2001"));

	}
	@Test
	public void placaFinal6e7NaQuintaTest() {
		Day day = new Quinta();
		assertFalse(day.circular("2006"));
		assertFalse(day.circular("2007"));
		
		assertTrue(day.circular("2001"));

	}
	@Test
	public void placaFinal8e9NaQuintaTest() {
		Day day = new Sexta();
		assertFalse(day.circular("2008"));
		assertFalse(day.circular("2009"));
		
		assertTrue(day.circular("2001"));

	}


}
