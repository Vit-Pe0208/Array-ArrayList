package Estudo;

import java.util.Iterator;

public class GraficoBarra {
	public static void main(String[] args) {
		//Notas dos alunos(87,68,94,100,83,78,85,91,76,87)
		//Representar o rendimento usando graficos de barras com array.(0-9,10-19,20-29,30-39,40-49,50-59,60-69,70-79,80-89,90-99,100)
		
		int[] array= {0,0,0,0,0,0,1,2,4,2,1};
		
		System.out.println("Grafico");
		
		//Representar(0-9,10-19,20-29,30-39,40-49,50-59,60-69,70-79,80-89,90-99,100)
		for (int i = 0; i < array.length; i++) 
		{
			if (i==10) 
				System.out.printf("%5d: ",100);			
			else 
				System.out.printf("%02d-%02d: ",i*10,i*10+9);
					
		
		 for (int stars = 0; stars < array[i]; stars++) 
			   System.out.print("*");
		 
		System.out.println();
		}
		
		
	}
	

}
