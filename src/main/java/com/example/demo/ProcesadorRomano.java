package com.example.demo;

import java.util.HashMap;

public class ProcesadorRomano {
	public static int convierte(String numerosRomanos) {
		int result = 0;
		HashMap<Integer,Integer> counters = new HashMap<Integer,Integer>();
		counters.put(1, 3);
		counters.put(5, 3);
		counters.put(10, 3);
		counters.put(50, 1);
		counters.put(100, 3);
		counters.put(500, 1);
		counters.put(1000, 3);
		
		int lastAdded = Integer.MAX_VALUE;;
		
		for (char ch: numerosRomanos.toCharArray()) {
			int value = mapRomanChar(ch);
			if(value > lastAdded) throw new IllegalArgumentException();
			if(counters.get(value) > 0) { counters.put(value, counters.get(value)-1); } else throw new IllegalArgumentException();
			result += value;
			lastAdded = value;
		}
		return result;
	}
	
	private static int mapRomanChar(char ch) {
		switch (ch) {
	        case 'I': return 1;
	        case 'V':  return 5;
	        case 'X': return 10;
	        case 'L':  return 50;
	        case 'C':  return 100;
	        case 'D':  return 500;
	        case 'M':return 1000;
	        default: throw new IllegalArgumentException();
		}
	}
		
		
}
