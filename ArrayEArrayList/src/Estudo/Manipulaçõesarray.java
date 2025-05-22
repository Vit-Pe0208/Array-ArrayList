package Estudo;

public class Manipulaçõesarray {
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{1,1,1},{1,1,1}};
		
		int total=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				total+=a[i][j];
				
				
			}
			
			System.out.println();			
		}
		
		
		
	}

}
