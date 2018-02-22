package com.example.demo;

public class ProcesadorRomano {
	public static int convierte(String numerosRomanos) {
		int result;
		switch (numerosRomanos) {
			case "":  result = 0;
	         	break;
	        case "I":  result = 1;
	                 break;
	        case "II":  result = 2;
	                 break;
	        case "III":  result = 3;
	                 break;
	        case "V":  result = 5;
	                 break;
	        case "X":  result = 10;
	                 break;
	        case "L":  result = 50;
	                 break;
	        case "C":  result = 100;
	                 break;
	        case "D":  result = 500;
	                 break;
	        case "M": result = 1000;
	                 break;
	        default: throw new IllegalArgumentException();
		}
		return result;
	}
}
