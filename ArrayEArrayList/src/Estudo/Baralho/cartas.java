package Estudo.Baralho;
//classe que representa uma carta
public class cartas {
	private final String face;
	private final String suit;
	
	public cartas(String cardface, String cardsuit) {

		this.face = cardface;
		this.suit = cardsuit;
	}
	
	

	public String toString() {
		return face + " de " + suit;
	}
	
	
	
	

}
