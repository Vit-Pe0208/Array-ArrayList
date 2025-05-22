package exercicios;

import java.util.Scanner;

//(Série de Fibonacci) A série de Fibonacci
//0, 1, 1, 2, 3, 5, 8, 13, 21, …
//inicia-se com os termos 0 e 1 e tem a propriedade de que cada termo sucessivo é a soma dos dois termos precedentes.
//a) Escreva um método fibonacci(n) que calcule o enésimo número de Fibonacci. Incorpore esse método a um aplicativo que permita
//ao usuário inserir o valor de n.
//b) Determine o maior número de Fibonacci que pode ser exibido em seu sistema.
//c) Modifique o aplicativo que você escreveu na parte (a) para utilizar double em vez de int para calcular e retornar números de Fibo-
//nacci e utilizar esse aplicativo modificado para repetir a parte (b)
public class exercicios29 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de sequecia que você quer?");
		int n = scan.nextInt();
		 fibonacci(n);
	}
	
	public static void  fibonacci(int n) {
		int a,b,c;
		a=0;
		b=1;
		
		System.out.print(a+" ");
		for (int i = 0; i <n-1;i++) {
			c=a;
			c+=b;
			b=a;
			a=c;
			
			System.out.print(c+" ");	
		}
	}
	
	

}
