package exercicios;
//Escreva instruções que realizam as seguintes operações de um array unidimensional:
//a) Configure os 10 elementos do array de inteiros counts como zeros.
//b) Adicione um a cada um dos 15 elementos do array de inteiros bonus.
//c) Exiba os cinco valores de array de inteiros bestScores em formato de coluna

public class exercicio11 {
	public static void main(String[] args) {
//a)
		System.out.println("Questão A)");
		int[]counts=new int[10];
		for (int i = 0; i < counts.length; i++) {
			counts[i]=0;
			System.out.printf("%d ",counts[i]);
			
		}
		
		System.out.println();
		System.out.println("Questão B)");
//b)
		int[]bonus=new int[15];
		for (int i = 0; i < bonus.length; i++) {
			bonus[i]+=1;
			System.out.printf("%d  ",bonus[i]);
			
		}
		System.out.println();
		System.out.println("Questão C)");
//C)
		int[]bestScores=new int[5];
		for (int i = 0; i < bestScores.length; i++) {
			bestScores[i]=1+i;
			System.out.println(bestScores[i]);
			
		}
		
	}

}
