package exercicios;
//(Lista de argumento de comprimento variável) Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
//ara método product utilizando uma lista de argumentos de comprimento variável. Teste seu método com várias chamadas, cada uma
//com um número diferente de argumentos.

public class exercicios14 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c =30;
		int d =40;
		
		System.out.printf("A=%d%nB=%d%nC=%d%nD=%d%n",a,b,c,d);
		System.out.printf("O produto de A X B= %d%n",produto(a,b));
		System.out.printf("O produto de A X B X C= %d%n",produto(a,b,c));
		System.out.printf("O produto de A X B X C X D= %d%n",produto(a,b,c,d));
		
	}
	public static int produto(int...variavel) {
		int produto=1;
		for (int i : variavel) {
			produto *= i;
			
		}
		return produto;
	}
}	
