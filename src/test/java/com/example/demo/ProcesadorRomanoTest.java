package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {
	
	
	// convierte
	
	@Test
	public void retorna0SiRecibeStringVacio() {
		assertEquals(ProcesadorRomano.convierte(""), 0);
	}
	
	@Test
	public void retorna1SiRecibeUnaIMayuscula() {
		assertEquals(ProcesadorRomano.convierte("I"), 1);
	}
	
	@Test
	public void retorna2SiRecibeDosIMayuscula() {
		assertEquals(ProcesadorRomano.convierte("II"), 2);
	}
	
	@Test
	public void retorna3SiRecibeTresIMayuscula() {
		assertEquals(ProcesadorRomano.convierte("III"), 3);
	}
	
	@Test
	public void retorna5SiRecibeUnaV() {
		assertEquals(ProcesadorRomano.convierte("V"), 5);
	}
	
	@Test
	public void retorna10SiRecibeUnaX() {
		assertEquals(ProcesadorRomano.convierte("X"), 10);
	}
	
	@Test
	public void retorna50SiRecibeUnaL() {
		assertEquals(ProcesadorRomano.convierte("L"), 50);
	}
	
	@Test
	public void retorna100SiRecibeUnaC() {
		assertEquals(ProcesadorRomano.convierte("C"), 100);
	}
	
	@Test
	public void retorna500SiRecibeUnaD() {
		assertEquals(ProcesadorRomano.convierte("D"), 500);
	}
	
	@Test
	public void retorna1000SiRecibeUnaM() {
		assertEquals(ProcesadorRomano.convierte("M"), 1000);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiRecibeCuatroIMayuscula() {
		ProcesadorRomano.convierte("IIII");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiRecibeCincoIMayuscula() {
		ProcesadorRomano.convierte("IIIII");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiRecibeCuatroXMayuscula() {
		ProcesadorRomano.convierte("XXXX");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiRecibeCincoXMayuscula() {
		ProcesadorRomano.convierte("XXXXX");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiRecibe2LIMayuscula() {
		ProcesadorRomano.convierte("LL");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiRecibe3LIMayuscula() {
		ProcesadorRomano.convierte("LLL");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiRecibeCuatroCMayuscula() {
		ProcesadorRomano.convierte("CCCC");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiRecibeCincoCMayuscula() {
		ProcesadorRomano.convierte("CCCCC");
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiRecibe2DIMayuscula() {
		ProcesadorRomano.convierte("DD");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiRecibe3DIMayuscula() {
		ProcesadorRomano.convierte("DDD");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retornaErrorSiLasLetrasSonAscendentes() {
		ProcesadorRomano.convierte("XXL");
	}
	
	@Test
	public void retornaElValorEsperadoSiLasLetrasSonEnValorDescendente() {
		assertEquals(ProcesadorRomano.convierte("LXX"), 70);
	}
	
	
	
	

}
