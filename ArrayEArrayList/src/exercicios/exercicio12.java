package exercicios;
//Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que insere cinco  
//números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente se ele não tiver uma duplicata de um número
//já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. Utilize o menor array possível para resolver esse pro-
//blema. Exiba o conjunto completo de valores únicos inseridos depois que o usuário inserir cada valor novo

import java.util.Scanner;

public class exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[]array=new int[5];
		for (int i = 0; i < array.length;) {
			System.out.println("Digite o primeiro valor: ");
			int valor=input.nextInt();
			if(valor<10 || valor>100) {
				System.out.println("Valores precisam ser entre 10 e 100");
			}else {
				if(valor!=array[0] && valor!=array[1] && valor!=array[2] && valor!=array[3] && valor!=array[4]) {
					array[i]=valor;
					i++;			
				}else {
					System.out.println("Valor inválido");
				}
			}
			
			
			
			
			
			
		}
		
		
		for (int i : array) {
			System.out.println(i);
			
		}
		
			
					
			
				
			
				
				
			
			
		
		
		
		
		
		
		
		

	}    	
}

