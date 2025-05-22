package correcoes;
//Crie uma matriz 10x10 e faça com que o programa "pinte" uma linha horizontal ou vertical dependendo da direção e da posição inicial.
//Por exemplo, se começar em (2,2) e a direção for horizontal com 5 passos, ele deve pintar os próximos 5 blocos para a direita.
public class pintandoRua {
	private static int[][]rua=new int [10][10];
	static int linha=0;
	static int coluna=0;
	private static final int passos=5;
	
	public static void main(String[] args) {
		rua[9][2]=1;
		for ( linha = 0; linha < rua.length; linha++) {
			for ( coluna = 0; coluna < rua[linha].length; coluna++) {
				    if(rua[linha][coluna]==1) {
				    	for(int i=0;i<passos;i++) {
				    		rua[9][coluna++]=1;		
				    	}
				    	
				    }
					
			}
			
		}
	   
		
		
		
		
		
		for (int i = 0; i < rua.length; i++) {
			for (int j = 0; j < rua[i].length; j++) {
				
				if(rua[i][j]==1) {
					System.out.print("%");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}
	

}
