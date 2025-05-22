package Estudo.Baralho;

import java.util.Iterator;

public class BaralhoTest {
	public static void main(String[] args) {
		Baralho jogo = new Baralho();
		jogo.embaralhar();
		
	    for (int i = 1; i <= 52; i++) {
	    	System.out.printf("%-19s",jogo.distribuir());	
	    	
	    	if (i%4==0) {
	    		System.out.println();				
			}
		}
	    
	}

}
