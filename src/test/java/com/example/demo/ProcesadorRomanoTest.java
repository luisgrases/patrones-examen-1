package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {

	@Test
	public void convierteRetorna0SiRecibeStringVacio() {
		assertEquals(ProcesadorRomano.convierte(""), 0);
	}
	
	@Test
	public void convierteRetorna1SiRecibeUnaIMayuscula() {
		assertEquals(ProcesadorRomano.convierte("I"), 1);
	}
	
	@Test
	public void convierteRetorna2SiRecibeDosIMayuscula() {
		assertEquals(ProcesadorRomano.convierte("II"), 2);
	}
	
	@Test
	public void convierteRetorna3SiRecibeTresIMayuscula() {
		assertEquals(ProcesadorRomano.convierte("III"), 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void convierteRetornaErrorSiRecibeCuatroIMayuscula() {
		ProcesadorRomano.convierte("IIII");
	}
	
	@Test
	public void convierteRetorna5SiRecibeUnaV() {
		assertEquals(ProcesadorRomano.convierte("V"), 5);
	}
	
	@Test
	public void convierteRetorna10SiRecibeUnaX() {
		assertEquals(ProcesadorRomano.convierte("X"), 10);
	}
	
	@Test
	public void convierteRetorna50SiRecibeUnaL() {
		assertEquals(ProcesadorRomano.convierte("L"), 50);
	}
	
	@Test
	public void convierteRetorna100SiRecibeUnaC() {
		assertEquals(ProcesadorRomano.convierte("C"), 100);
	}
	
	@Test
	public void convierteRetorna500SiRecibeUnaD() {
		assertEquals(ProcesadorRomano.convierte("D"), 500);
	}
	
	@Test
	public void convierteRetorna1000SiRecibeUnaM() {
		assertEquals(ProcesadorRomano.convierte("M"), 1000);
	}
	
	
	

}
