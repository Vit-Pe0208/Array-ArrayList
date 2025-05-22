package correcoes;
//Crie um programa em que um "robô" começa na posição (0,0) de uma matriz 5x5 e recebe uma sequência de comandos ('D', 'E', 'B', 'C' para Direita, Esquerda, Baixo e Cima). 
//O robô se move e marca com X os lugares por onde passa. Ao final, imprima a matriz.
//Exemplo de comandos: {'D', 'D', 'B', 'B', 'E', 'C'}

public class robo {
	private static byte[][]floor=new byte[5][5];
	private static char[]comandos = {'D','D','S','S','A','T'};
	private static int linha=0;
	private static int coluna=0;

	
	public static void robo() {
		
		floor[0][0]=1;
		for (int i = 0; i < comandos.length; i++) {
			switch (comandos[i]) {
			case 'D':
				if(coluna< floor[linha].length-1)coluna++;
				break;
			case 'A':
				if(coluna>0)coluna--;
				break;	
			case 'W':
				if(linha>0)linha--;
				break;
			case 'S':
				if(linha<floor.length-1)linha++;
				break;
			case 'T':
				imprimir();
				break;	

			}
			floor[linha][coluna]=1;	
		}
		
		
	}
		
	
	public static void imprimir() {
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < floor[i].length; j++) {
				if(floor[i][j]==1) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String[] args) {robo();}
}
