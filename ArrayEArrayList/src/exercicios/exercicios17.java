package exercicios;

import java.util.Random;

//Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar um objeto de classe Random,
//uma vez para lançar o primeiro dado e novamente para lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada
//dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12,
//as somas menos frequentes. A Figura 7.28 mostra as 36 possíveis combinações de dois dados. Seu aplicativo deve lançar o dado 36.000.000
//vezes. Utilize um array unidimensional para contar o número de vezes que cada possível soma aparece. Exiba os resultados em formato
//tabular
public class exercicios17 {
	public static void main(String[] args) {
		int[]array=new int[13];
		
		for (int i = 0; i < 36000000; i++) {
			int somar = somaDado();
			switch (somar) {
			case 2:
				++array[2];	
				break;
			case 3:
				++array[3];
				break;
			case 4:
				++array[4];	
				break;
			case 5:
				++array[5];	
				break;
			case 6:
				++array[6];	
				break;
			case 7:
				++array[7];	
				break;
			case 8:
				++array[8];	
				break;
			case 9:
				++array[9];	
				break;
			case 10:
				++array[10];	
				break;
			case 11:
				++array[11];	
				break;
			case 12:
				++array[12];	
				break;
			}	
		}
		
		
		System.out.printf("%5s%8s%n","Index", "Valor");
		for (int i = 2; i <= 12; i++) {
			
			System.out.printf("%4d%11d%n",i,array[i]);
			
		}
		
		
	
	
	
	
	
	
	}
	public static int somaDado() {
		Random random = new Random();
		
		int dado1 = 1+random.nextInt(6);
		int dado2 = 1 + random.nextInt(6);
		
		int soma=dado1+dado2;
		//System.out.printf("Valor da soma: %d%n",soma);
		
		return soma;	
	}

}
