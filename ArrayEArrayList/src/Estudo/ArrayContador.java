package Estudo;

import java.security.SecureRandom;
import java.util.Iterator;

public class ArrayContador {	
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		int[] frequencia= new int[7];
		
		for (int roll = 0; roll < 6000000; roll++) 
			++frequencia[1+random.nextInt(6)];
		
		System.out.printf("%s\t%s%n","Face","Frequencia");
		for (int face = 1; face < frequencia.length; face++) 
			System.out.printf("%4d%10d%n",face,frequencia[face]);	
		
	
		
	}
	
	
}
