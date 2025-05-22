package exercicios;

import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][]t=new int[2][3];
		int valor;
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.printf("Digite um valor para [%d] e [%d]%n",i,j);
				valor=input.nextInt();
				t[i][j]=valor;
			}			
		}
		array(t);
		
		int menor=t[0][0];
		for (int[] is : t) {
			for (int number :  is) {
				if(number<menor)menor=number;
				
				
			}
			
			
		}
		System.out.println(menor);
		
		
		for (int is : t[0]) {
			System.out.printf("%d ",is);
			
		}
		System.out.println();
		int soma=t[0][2]+t[1][2];
		System.out.println(soma);
		
				
				
				
			
			
		
		
		
			
		
	}
	
	public static void array(int[][]array) {
		for (int coluna = 0; coluna < array[0].length; coluna++) {
			System.out.printf("%4d",coluna);
			
		}
		System.out.println();
		
		
	    for (int i = 0; i < array.length; i++) {	
	    	System.out.printf("%d",i);	    	
			for (int j = 0; j < array[i].length; j++) {					
				System.out.printf("%3d ",array[i][j]);				
			}
			System.out.println();
		}
	}
}	
		
				
			
			
		
		
				
				
		


