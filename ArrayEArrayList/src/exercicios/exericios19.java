package exercicios;

import java.util.Random;
import java.util.Scanner;

//Uma pequena companhia aérea acabou de comprar um computador para seu novo sistema
//automatizado de reservas. Você foi solicitado a desenvolver o novo sistema. Você escreverá um aplicativo para atribuir assentos em cada
//voo da companhia aérea (capacidade: 10 assentos).
//Seu aplicativo deve exibir as seguintes alternativas: Please type 1 for First Class e Please type 2 for Economy. [Por
//favor digite 1 para Primeira Classe e digite 2 para Classe Econômica]. Se o usuário digitar 1, seu aplicativo deve atribuir
//assentos na primeira classe (poltronas 1 a 5). Se o usuário digitar 2, seu aplicativo deve atribuir um assento na classe econômica (poltronas
//6 a 10). Seu aplicativo deve exibir um cartão de embarque indicando o número da poltrona da pessoa e se ela está na primeira classe ou na
//classe econômica.
//Utilize um array unidimensional do tipo primitivo boolean para representar o gráfico de assentos do avião. Inicialize todos os ele-
//mentos do array como false para indicar que todas as poltronas estão desocupadas. À medida que cada assento é atribuído, configure o
//elemento correspondente do array como true para indicar que o assento não está mais disponível.
//Seu aplicativo nunca deve atribuir uma poltrona que já foi reservada. Quando a classe econômica estiver lotada, seu aplicativo deve
//perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição apropriada de assento. Se não, exiba a men-
//sagem "Next flight leaves in 3 hours" [O próximo voo parte em 3 horas].
public class exericios19 {
	private static final Scanner scan = new Scanner(System.in);
	private static final int CAPACIDADE=11;
	static boolean[]assentos = new boolean[CAPACIDADE];
	
	public static void main(String[] args) {
		new exericios19().program();
		new exericios19().avião();
}	
	
	public static void program() {
       int contador=0;
		
		while(contador<10) {
		System.out.println("Por favor digite 1 para Primeira Classe e digite 2 para Classe econômica: ");
		byte tipo_classe=scan.nextByte();
		switch (tipo_classe) {
		case 1:
			verificarPrimeiraClasse(1,5);
			if(verificarPrimeiraClasse(1,5)==false) {
				preencherLugaresPrimeiraclasse(1,5);
				contador++;
			}else {
				System.out.println("Primeira classe lotada!!!,Deseja ir para a classe economica ? (digite sim para confirma ou qualquer caractere para recusar) ");
				String resposta = scan.next();
				if(resposta.equalsIgnoreCase("sim")) {
					verificarSegundaClasse(6,10);
					if(verificarSegundaClasse(6,10)==false) {
						preencherLugaresSegundaclasse(6,10);
						contador++;
					}
				}else {
					System.out.println("O próximo voo sai as tres horas.");
					contador++;
				}
			}
			
			break;
			
		case 2:
			
			verificarSegundaClasse(6,10);
			if(verificarSegundaClasse(6,10)==false) {
				preencherLugaresSegundaclasse(6,10);
				contador++;
			}else {
				System.out.println("Classe economica lotada!!!Deseja ir para a primeira classe? (digite sim para confirma ou qualquer caractere para recusar) ");
				String resposta = scan.next();
				if(resposta.equalsIgnoreCase("sim")) {
					verificarPrimeiraClasse(1,5);
					if(verificarPrimeiraClasse(1,5)==false) {
						preencherLugaresPrimeiraclasse(1,5);
						contador++;
					}
				}else {
					System.out.println("O próximo voo sai as tres horas.");
					contador++;
				}
			}
			
			break;
			
			

		default:
			System.err.println("Erro!!!, os valores precisam ser 1 para primeira classe ou 2 para segunda classe!!");
			break;
		}	
	}
		
	}
	
	public static boolean verificarPrimeiraClasse(int inicio,int valorfinal) {
		boolean resultado;
		
		if(assentos[1]==true && assentos[2]==true && assentos[3]==true && assentos[4]==true && assentos[5]==true) {
			resultado = true;
		}else {
			resultado=false;
		}
		
		return resultado;
	}
	
	public static void preencherLugaresPrimeiraclasse(int inicio,int valorfinal) {
		
		for (int i = inicio; i <= valorfinal; i++) {
			if(assentos[i]==false) {
				assentos[i]=true;
			    System.out.println("Primeira classe e seu lugar é o assento: "+i);
			    break;
			}		
			
		}
		
	}
	public static boolean verificarSegundaClasse(int inicio,int valorfinal) {
		boolean resultado;
		
		if(assentos[6]==true && assentos[7]==true && assentos[8]==true && assentos[9]==true && assentos[10]==true) {
			resultado = true;
		}else {
			resultado=false;
		}
		
		return resultado;
	}
	
	public static void preencherLugaresSegundaclasse(int inicio,int valorfinal) {
		for (int i = inicio; i <= valorfinal; i++) {
			if(assentos[i]==false) {
				assentos[i]=true;
				System.out.println("Classe econômica e seu lugar é o assento : "+i);
			break;
			}		
		}	
	}
	
	public static void avião() {
		for (int i = 1; i < assentos.length; i++) {
			System.out.println(assentos[i]);
			
			
			
		}
	}
	
	
			
	
	
	
}
		
	
	


