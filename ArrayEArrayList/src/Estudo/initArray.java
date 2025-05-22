package Estudo;

public class initArray {
	public static void main(String[] args) {
		int[][]array= {{1,2,3},{4,5,6}};
		int[][]array1= {{1,2},{3},{4,5,6}};
		
		
		System.out.println("Os valores do array são:");
		arraybidimensional(array);
		System.out.println("\nOs valores do segundo array são");
		arraybidimensional(array1);
		
	}
	public static void arraybidimensional(int[][]Array) {
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				System.out.printf("%d ",Array[i][j]);
				
			}
			System.out.println();
			
		}
	}

}
