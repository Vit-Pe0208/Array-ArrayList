package exercicios;

import java.util.Arrays;
import java.util.Random;

public class LebreTurtle {
	private static int[]corrida = new int[70];
	private static int posicaotartaruga = 1;
	private static int posicaolebre = 1;
	private static Random random = new Random();
	
	
	public static void main(String[] args) {
		System.out.printf("Bang!!!!!%nE lá vão eles!!!!!%n");
		
		while(posicaotartaruga<70 && posicaolebre<70) {
			Arrays.fill(corrida,0);//limpa o vetor
			int porcentagemT = 1+random.nextInt(10);
			int porcentagemL = 1+random.nextInt(10);
			
			turtle(porcentagemT);
			lebre(porcentagemL);
			imprimir();
			
			if(posicaotartaruga>=70 && posicaolebre>=70) {
				System.out.println("Ocorreu um empate");	
				break;
			}else if(posicaotartaruga>=70){
				System.out.println("A Tartaruga Venceu!!!.EH");	
				break;
			}else if(posicaotartaruga>=70) {
				System.out.println("A Lebre Ganhou OH.");
				break;
			}
		}
	
		
	}
	
	public static  void turtle(int porcentagem) {
		if(porcentagem>=1 && porcentagem<=5) {
		posicaotartaruga +=3;
		}
		else
	        if(porcentagem>=6 && porcentagem<=7) {
			posicaotartaruga -=6;
		   }
	        else {
		posicaotartaruga++;
		}
		if(posicaotartaruga<1)posicaotartaruga=1;
		if(posicaotartaruga<69)posicaotartaruga=69;
	}
	
	
	public static  void lebre(int porcentagem) {
		if(porcentagem>=1 && porcentagem<=2) {
		}
		
		else if(porcentagem>=3 && porcentagem<=4) {
		   posicaolebre +=9;
		
		 }
		else  if(porcentagem==5) {
		posicaolebre-=12;
			
		 }
		else if(porcentagem>=6 && porcentagem<=8) {
				posicaolebre++;
				
		 }
		else {
				posicaolebre-=2;
		 }
		if(posicaolebre<1)posicaolebre=1;
		if(posicaolebre>69)posicaolebre=69;
	}
	public static void imprimir() {
		
		for (int i = 1; i < corrida.length; i++) {
			if(posicaolebre == posicaotartaruga && i==posicaolebre) {
				System.out.print("AI");
			}
			else if(i==posicaotartaruga) {
				System.out.print("T");
			}else if(i==posicaolebre) {
				System.out.print("L");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	

}
