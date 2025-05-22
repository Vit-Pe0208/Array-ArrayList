package exercicios;
//Rotule os elementos do array bidimensional três por cinco sales para indicar a ordem em que eles são configurados como zero pelo
//seguinte segmento de programa:
//linha porlinha.
public class exercicios13 {
	public static void main(String[] args) {
		int[][]sales= new int[3][5];
		
		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j++) {
				sales[i][j]=0;
				System.out.printf("sales[%d][%d]%n",i,j);
			}
			
			
		}
	}

}
