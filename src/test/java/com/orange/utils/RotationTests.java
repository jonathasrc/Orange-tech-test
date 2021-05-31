package com.orange.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.orange.utils.day.Quarta;
import com.orange.utils.day.Quinta;
import com.orange.utils.day.Segunda;
import com.orange.utils.day.Sexta;
import com.orange.utils.day.Terca;

@SpringBootTest
public class RotationTests {
	

	@Test
	public void anoFinal0e1Test() {
//		Rotation Rotation = new Rotation();
		assertFalse(Rotation.podeCircularNoRodizio("2000", new Segunda()));
		assertFalse(Rotation.podeCircularNoRodizio("2001", new Segunda()));

		assertFalse(Rotation.podeCircularNoRodizio("2000", "Segunda"));
		assertFalse(Rotation.podeCircularNoRodizio("2001", "Segunda"));

		assertTrue(Rotation.podeCircularNoRodizio("2002", new Segunda()));
		assertTrue(Rotation.podeCircularNoRodizio("2002", "Segunda"));

	}
	
	@Test
	public void anoFinal2e3Test() {
//		Rotation Rotation = new Rotation();
		assertFalse(Rotation.podeCircularNoRodizio("2002", new Terca()));
		assertFalse(Rotation.podeCircularNoRodizio("2003", new Terca()));

		assertFalse(Rotation.podeCircularNoRodizio("2002", "Terca"));
		assertFalse(Rotation.podeCircularNoRodizio("2003", "Terca"));

		assertTrue(Rotation.podeCircularNoRodizio("2001", new Terca()));
		assertTrue(Rotation.podeCircularNoRodizio("2001", "Terca"));


	}
	@Test
	public void anoFinal4e5Test() {
//		Rotation Rotation = new Rotation();
		assertFalse(Rotation.podeCircularNoRodizio("2004", new Quarta()));
		assertFalse(Rotation.podeCircularNoRodizio("2005", new Quarta()));

		assertFalse(Rotation.podeCircularNoRodizio("2004", "Quarta"));
		assertFalse(Rotation.podeCircularNoRodizio("2005", "Quarta"));

		assertTrue(Rotation.podeCircularNoRodizio("2001", new Quarta()));
		assertTrue(Rotation.podeCircularNoRodizio("2001", "Quarta"));


	}
	@Test
	public void anoFinal6e7Test() {
//		Rotation Rotation = new Rotation();
		assertFalse(Rotation.podeCircularNoRodizio("2006", new Quinta()));
		assertFalse(Rotation.podeCircularNoRodizio("2007", new Quinta()));

		assertFalse(Rotation.podeCircularNoRodizio("2006", "Quinta"));
		assertFalse(Rotation.podeCircularNoRodizio("2007", "Quinta"));

		assertTrue(Rotation.podeCircularNoRodizio("2001", new Quinta()));
		assertTrue(Rotation.podeCircularNoRodizio("2001", "Quinta"));


	}
	@Test
	public void anoFinal8e9Test() {
//		Rotation Rotation = new Rotation();
		assertFalse(Rotation.podeCircularNoRodizio("2008", new Sexta()));
		assertFalse(Rotation.podeCircularNoRodizio("2009", new Sexta()));

		assertFalse(Rotation.podeCircularNoRodizio("2008", "Sexta"));
		assertFalse(Rotation.podeCircularNoRodizio("2009", "Sexta"));

		assertTrue(Rotation.podeCircularNoRodizio("2001", new Sexta()));
		assertTrue(Rotation.podeCircularNoRodizio("2001", "Sexta"));


	}

}
