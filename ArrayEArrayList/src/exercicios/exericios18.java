package exercicios;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.Scanner;

//Escreva um aplicativo que executa 1.000.000 de partidas do jogo de dados craps (Figura 6.8) e responda às seguin-
//tes perguntas
//a) Quantos jogos são ganhos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?/

//b) Quantos jogos são perdidos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?

//c) Quais são as chances de ganhar no jogo de dados? [Observação: você deve descobrir que o craps é um dos jogos mais comuns de cas-
//sino. O que você supõe que isso significa?]
//Uma oportunidade de aproximadamente 50 porcento de vitória, o que siggnifica um jogo de azar quase justo.

//d) Qual é a duração média de um jogo de dados craps?

//e) As chances de ganhar aumentam com a duração do jogo?
//diminuem.

public class exericios18 {
	private static final SecureRandom numero = new SecureRandom();
	private static final int SNAKE_EYES=2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YOU_EVEN=11;
	private static final int BOX_CARS =12;
	private enum Estado{GANHAR,PERDER,CONTINUAR};
	private static final int[]array = new int[2];
	private static final int[]vitoria = new int[22];
	private static final int[]derrota = new int[22];
	
	public static void main(String[] args) {
		exericios18.craps();
		//exericios18.duracaoMedia();
		exericios18.tempodeganho();
		
	}
	
	public static void craps() {
		int meuponto=0;
		Estado status;
		
		for (int i = 0; i < 1000000; i++) {
			int somadados = rolardados();
			switch (somadados) {
			
			case SEVEN :
			case YOU_EVEN:
				status=Estado.GANHAR;
				++vitoria[1];
				break;
				
			case SNAKE_EYES:
			case TREY :	
			case BOX_CARS:	
				status=Estado.PERDER;
				++derrota[1];
				break;

			default:
				status=Estado.CONTINUAR;
				meuponto=somadados;
			
				break;
			}
			
			int contador=2;
			while(status==Estado.CONTINUAR) {
				
				somadados = rolardados();
				if(somadados==meuponto) {
					status=Estado.GANHAR;
					
					if(contador>20) {
						++vitoria[21];
					}else {
						++vitoria[contador];
					}
					
				}else if(somadados==SEVEN){
					status=Estado.PERDER;
					if(contador>20) {
						++derrota[21];
					}else {
						++derrota[contador];
					}
				}
				contador++;
			}
			
			
			
			
			if(status==Estado.GANHAR) {
				++array[0];
				
			}else {
				++array[1];
			}
		}	
		//a)
		//vitorias();
		System.out.println();
		System.out.println();
		//b)
		//derrotas();
		//c)chancesvitoria(array[0],1000000);
		//d)
		
		
		
		
		
	}
	
	
	
	public  static int rolardados() {
		int dado1=1+numero.nextInt(6);
		int dado2 = 1+numero.nextInt(6);
		
		int soma = dado1+dado2;
		return soma;
	}
	
	//a) 
	public static void vitorias() {
		for (int i = 1; i <= 20; i++) {
			System.out.printf("jogos vencidos na %d rodada: %d%n",i,vitoria[i]);	
		}
		System.out.printf("Jogos vencidos depos da %d rodada: %d",20,vitoria[21]);
	}
	//b)
	public static void derrotas() {
		for (int i = 1; i <= 20; i++) {
			System.out.printf("jogos perdidos na %d° rodada: %d%n",i,derrota[i]);	
		}
		System.out.printf("Jogos perdidos depois da %d° rodada: %d",20,derrota[21]);
	}
	//c)
	public static void chancesvitoria(int casosfavoraveis,int casospossiveis) {
		
		double calculo = (double)casosfavoraveis/ casospossiveis;
		double probabilidadevitoria= calculo*100;
		System.out.printf("A probabilidade de vitória no jogo de dados craps é aproximadamente: %.2f%%",probabilidadevitoria);
		
		
		
		
	}
	//d
	public static void duracaoMedia() {
		Long inicio_jogo=System.nanoTime();
		craps();
		Long final_jogo=System.nanoTime();
		Long tempo_total= final_jogo - inicio_jogo;
		double microsegundos =(double) tempo_total/1000;
		double duracaoMedia = microsegundos/1000000;
		System.out.printf("A duração média de uma partida de craps é: %.3f µs",duracaoMedia);
		
	}
	//e)
	public static void tempodeganho() {
		int somatotal= vitoria[21]+derrota[21];
		double possibilidadevitoria=(double)vitoria[21]/somatotal;
		
		System.out.printf("A probabilidade de vitória com a duração do jogo,considerando jogos que duram a mais de 20 partidas, é de: %.2f%%",possibilidadevitoria*100);
		
		
	}
	
}
