package Estudo.Baralho;

import java.security.SecureRandom;

//classe para criar o baralho,embaralhar e distribuir as cartas.

public class Baralho {
	private cartas[]guarda;
	private int atualcarta;//próxima carta a ser distribuida.
	private static final int NUMEROS_DE_CARTAS=52;
	private static final SecureRandom random = new SecureRandom();
	
	public Baralho() {
		String[]face={"ÁS","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Valete","Rainha","Rei"};
		String[]suits={"Copas","Ouros","Paus","Espadas"};
		
		guarda=new cartas[NUMEROS_DE_CARTAS];
		//atualcarta=0;//A primeira começará na posição guarda[0]
		
		for (int i = 0; i < guarda.length; i++) {
			guarda[i]=new cartas(face[i%13],suits[i/13]);			
		}		
	}
	
	public void embaralhar() {
		//atualcarta=0;
		
		for (int primeiro = 0; primeiro < guarda.length; primeiro++) {
			int segundo=random.nextInt(NUMEROS_DE_CARTAS);	
			
			cartas temp=guarda[primeiro];//guarda a primeira carta
			guarda[primeiro]=guarda[segundo];//trocar com uma carta aleatória
			guarda[segundo]=temp;//completa a troca
		}	
	}
	public cartas distribuir() {
		if (atualcarta<guarda.length) {
			return guarda[atualcarta++];	//retorna carta atual no array		
		} else {
			return null;
		}
	}

}
