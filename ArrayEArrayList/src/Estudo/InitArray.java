package Estudo;

public class InitArray {
	public static void main(String[] args) {
		int[] array = new int[10];
		System.out.printf("%s%8s%n","Index","Valor");
		 for (int i = 0; i < array.length; i++) {
			 System.out.printf("%4d%8d%n",i,array[i]);
			
		}
		
		
	}

}
