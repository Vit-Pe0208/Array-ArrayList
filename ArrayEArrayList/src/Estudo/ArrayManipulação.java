package Estudo;
import java.util.Arrays;
public class ArrayManipulação {
	public static void main(String[] args) {
		double[] doubleArray= {8.4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(doubleArray);
		System.out.printf("%ndoubleArray: ");
		for (double d : doubleArray) 
			System.out.printf("%.1f/ ",d);
		
		int[]filledIntArray=new int[10];
		Arrays.fill(filledIntArray,7 );
		displayArray(filledIntArray,"filledIntArray");
		
		int[]intArray= {1,2,3,4,5,6};
		int[]copiaintArray=new int[intArray.length];
		System.arraycopy(intArray, 0, copiaintArray, 0, intArray.length);
		displayArray(intArray,"intArray");
		displayArray(copiaintArray,"copiaintArray");
		
		boolean a=Arrays.equals(intArray, copiaintArray);
		System.out.printf("%n%nintArray %s copiaintArray",(a?"==":"!="));
		
		boolean b=Arrays.equals(intArray, filledIntArray);
		System.out.printf("%nintArray %s copiaintArray",(b?"==":"!="));
		
		int localização=Arrays.binarySearch(intArray, 5);
		if(localização>=0) {
			System.out.printf("%nA localização do elemento 5 no array é: %d%n",localização);
		}else {
			System.out.println("\nO elemento 5 não existe no array");
		}
		
		int localização1=Arrays.binarySearch(intArray, 1000);
		if(localização1>=0) {
			System.out.printf("%n A localização do elemento 1000 no array é: %d%n",localização1);
		}else {
			System.out.println(localização1);//ponto de iserção de chave de pesquisa.
		}
		
		
		
		
		
		
		
		
		
			
		
	}
	public static void displayArray(int[]array,String descricao) {
		System.out.printf("%n%s: ",descricao);
		for (int valor : array) {
			System.out.printf("%d", valor);
			
		}
	}

}
