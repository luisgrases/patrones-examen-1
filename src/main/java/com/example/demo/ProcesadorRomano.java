package com.example.demo;

public class ProcesadorRomano {
	public static int convierte(String numerosRomanos) {
		int result = 0;
		int ICounter = 0;
		int XCounter = 0;
		int LCounter = 0;
		int CCounter = 0;
		int DCounter = 0;
		
		int lastAdded = Integer.MAX_VALUE;;
		
		for (char ch: numerosRomanos.toCharArray()) {
			switch (ch) {
		        case 'I':  if(ICounter < 3 && lastAdded >= 1) { result += 1; ICounter++; lastAdded = 1;} else throw new IllegalArgumentException();
		                 break;
		        case 'V':  if (lastAdded >= 5) { result += 5; lastAdded = 5;} else throw new IllegalArgumentException();
		                 break;
		        case 'X':  if(XCounter < 3 && lastAdded >= 10) { result += 10; XCounter++; lastAdded = 10;} else throw new IllegalArgumentException();
		                 break;
		        case 'L':  if(LCounter < 1 && lastAdded >= 50) {result += 50; LCounter++; lastAdded = 50;} else throw new IllegalArgumentException();
		                 break;
		        case 'C':  if(CCounter < 3 && lastAdded >= 100) {result += 100; CCounter++; lastAdded = 100;} else throw new IllegalArgumentException();
		                 break;
		        case 'D':  if(DCounter < 1 && lastAdded >= 500) {result += 500; DCounter++; lastAdded = 500;} else throw new IllegalArgumentException();
		                 break;
		        case 'M': if(lastAdded >= 1000) { result += 1000; lastAdded = 1000; } else throw new IllegalArgumentException();
		                 break;
		        default: throw new IllegalArgumentException();
			}
		}
		return result;
	}
		
		
}
