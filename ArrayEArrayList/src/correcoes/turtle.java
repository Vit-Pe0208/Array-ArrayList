package correcoes;

public class turtle {
	
	private static byte[][]floor = new byte[20][20];
	private static int[]comandos={2,5,12,3,5,12,3,5,12,3,5,12,1,6,9};
	private static int direcao = 1;
	private static boolean canetabaixa=false;
	private static int linha=0;
	private static int coluna=0;
	
   public static void main(String[] args) {turtle();}
   
   public static void turtle() {
	   for (int i = 0; i < comandos.length; i++) {
		   
		   
		   switch (comandos[i]) {
		case 1:
			canetabaixa=false;
			break;
		case 2:
			canetabaixa=true;
			break;
		case 3:
			Direita();
			break;
		case 4:
			Esquerda();
			break;
		case 5:
			int passadas=comandos[++i];
			avancar(passadas);
			break;
		case 6:
			imprimir();
			break;
		case 9:
			return;
			

		}
		
	}
	   
   }
   public static void Direita() {
	   direcao = (direcao+1)%4;//define a direção da tartaruga para à direita
   }
   public static void Esquerda() {
	   direcao = (direcao+3)%4;//define a direção da tartaruga para à Esquerda
   }
   public static void avancar(int passos) {
	 for (int i = 0; i < passos; i++) {
		 switch (direcao) {
		case 0:
			if(linha>0)linha--;
			break;
		case 1:
			if(coluna< floor[linha].length -1)coluna++;
			break;
		case 2:
			if(linha<floor.length -1)linha++;
			break;
		case 3:
			if(coluna>0)coluna--;
		
		}
		if(canetabaixa) {
			floor[linha][coluna]=1;
		}
	}
	
		 
	 }
   public static void imprimir(){
	   for (int i = 0; i < floor.length; i++) {
		   for (int j = 0; j < floor[i].length; j++) {
			   if(floor[i][j]==1) {
				   System.out.print("*");
			   }else {
				   System.out.print(" ");
			   }	
		}
		System.out.println();
	}
	   
   }
   
}
