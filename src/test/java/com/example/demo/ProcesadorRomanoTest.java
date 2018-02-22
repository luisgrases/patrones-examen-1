package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {

	@Test
	public void convierteRetorna0SiRecibeStringVacio() {
		assertEquals(ProcesadorRomano.convierte(""), 0);
	}

}
