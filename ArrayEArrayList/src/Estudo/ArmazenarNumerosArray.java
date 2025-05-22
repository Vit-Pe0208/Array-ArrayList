package Estudo;

import java.util.Iterator;

public class ArmazenarNumerosArray {
	public static void main(String[] args) {
		final int ARRAY_COMPRIMENTO=10;
		int[]array=new int[ARRAY_COMPRIMENTO];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=2+2*i;			
		}
		System.out.printf("%s%8s%n","Index","Valor");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%4d%8d%n",i,array[i]);
			
		}
		
	}

}
