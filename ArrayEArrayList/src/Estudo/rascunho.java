package Estudo;

import java.util.Arrays;



public class rascunho {
	 private static int[][]array= new int[5][4];
	 
	 public rascunho(int[][]array) {
		 this.array=array;
	 }
	 
	 public static void inicializararray() {
			
			int [][]array1={ {1,2,3,4}, {1,2,3,4},{0,0,0,0},{2,4,6,8},{1,3,5,7} };	
			rascunho array2 = new rascunho(array1);
			array2.programa();
			
			
		}
	 
	 
	public static void main(String[] args) {
     rascunho.inicializararray();
   
   }
	
	
	
	public static int somarlinhas(int[]array) {
		int soma=0;
		
		for (int i = 0; i < array.length; i++) 
			soma += array[i];	
		
		
		 return soma;
	}
	
	
	public static void somarcolunas() {
		
		for (int i = 0; i < array[0].length; i++) {
			int soma = 0;
			
			for (int j = 0; j < array.length; j++) {
				
				soma += array[j][i];
				
			
			}
			System.out.printf("%15d",soma);
			
		}
	}
	
	
	
 public static void programa() {
	
	
    System.out.println("Relatório de vendas");
    System.out.println("                   ");
    System.out.print("                  ");
    for (int i = 0; i < 4; i++) {
    	System.out.printf("vendedor %-6d",i+1);
	}
    System.out.println("Total de vendas do produto");
   
    
    
     
   for (int i = 0; i < array.length; i++) {
	   System.out.printf("produto %d",i+1);
   	
   	for (int number : array[i]) {
   		System.out.printf("%15d", number);	
		}
   	int somarlinhas = somarlinhas(array[i]);
   	System.out.printf("%15d%n",somarlinhas);
	}
   System.out.print("total");
   System.out.print("    ");
   somarcolunas();
	
		
		
}

	
	
	

}
