package exercicios;
//Utilize um array unidimensional para resolver o seguinte problema: uma empresa paga seu pessoal de vendas por
//comissão. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante essa semana. Por exemplo, um vendedor
//que vende R$ 5.000 brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650. Escreva um aplicativo (utilizando
//um array de contadores) que determina quanto o pessoal de vendas ganhou em cada um dos seguintes intervalos (suponha que o salário
//de cada vendedor foi truncado para uma quantia inteira):
//Capítulo 7 Arrays e ArrayLists 235
//a) $200–299
//b) $300–399
//c) $400–499
//d) $500–599
//e) $600–699
//f) $700–799
//g) $800–899
//h) $900–999
//i) R$ 1.000 e acima
//Resuma os resultados em formato tabular.

public class exercicios10 {
	public static void main(String[] args) {
		int[]array=new int[9];
		System.out.print("Salário   ");
		System.out.print("  Vendas Brutas");
		System.out.print("   Comissão ganha\n");
		for (int i = 0; i < array.length; i++) {
			if(i==0) {
				array[0]=200;
				System.out.printf("R$%d-%d   ",array[i],array[i]+99);
			}else if(i!=0 && i!=8 ){
				array[i]=array[i-1]+100;
				System.out.printf("R$%d-%d   ",array[i],array[i]+99);
			}else {
				array[8]=1000;
				System.out.printf("R$%d      ",array[i]);
			}
			
			
			
			
			switch (array[i]) {
			case 200:
				int salariominimo=200;
				int salariomaximo=299;
				
				double vendaminima=(salariominimo-200)/0.09;
				double vendamaxima=(salariomaximo-200)/0.09;
				double comissaominima=0.09*vendaminima;
				double comissaomaxima=0.09*vendamaxima;		
				
				System.out.printf("R$%3.0f--%.0f",vendaminima,vendamaxima);		
				System.out.printf("%13.0f--%.0f%n",comissaominima,comissaomaxima);
				break;
				
			case 300:
				 salariominimo=300;
				 salariomaximo=399;
				
				vendaminima=(salariominimo-200)/0.09;
				vendamaxima=(salariomaximo-200)/0.09;
				comissaominima=0.09*vendaminima;
				comissaomaxima=0.09*vendamaxima;
				
				System.out.printf("R$%.0f--%.0f",vendaminima,vendamaxima);	
				System.out.printf("%11.0f--%.0f%n",comissaominima,comissaomaxima);
				break;
				
			case 400:	
				salariominimo=400;
				 salariomaximo=499;
				
				 vendaminima=(salariominimo-200)/0.09;
				vendamaxima=(salariomaximo-200)/0.09;
				comissaominima=0.09*vendaminima;
				comissaomaxima=0.09*vendamaxima;
				
				System.out.printf("R$%.0f--%.0f",vendaminima,vendamaxima);	
				System.out.printf("%11.0f--%.0f%n",comissaominima,comissaomaxima);
				break;
			case 500:	
				salariominimo=500;
				 salariomaximo=599;
				
				 vendaminima=(salariominimo-200)/0.09;
				vendamaxima=(salariomaximo-200)/0.09;
				comissaominima=0.09*vendaminima;
				comissaomaxima=0.09*vendamaxima;
				
				System.out.printf("R$%.0f--%.0f",vendaminima,vendamaxima);	
				System.out.printf("%11.0f--%.0f%n",comissaominima,comissaomaxima);
				break;	
				
			case 600:	
				salariominimo=600;
				 salariomaximo=699;
				
				 vendaminima=(salariominimo-200)/0.09;
				 vendamaxima=(salariomaximo-200)/0.09;
				 comissaominima=0.09*vendaminima;
				 comissaomaxima=0.09*vendamaxima;
				
				System.out.printf("R$%.0f--%.0f",vendaminima,vendamaxima);			
				System.out.printf("%11.0f--%.0f%n",comissaominima,comissaomaxima);
				break;
				
			case 700:	
				salariominimo=700;
				 salariomaximo=799;
				
				 vendaminima=(salariominimo-200)/0.09;
				 vendamaxima=(salariomaximo-200)/0.09;
				 comissaominima=0.09*vendaminima;
				 comissaomaxima=0.09*vendamaxima;
				
				System.out.printf("R$%.0f--%.0f",vendaminima,vendamaxima);	
				System.out.printf("%11.0f--%.0f%n",comissaominima,comissaomaxima);
				break;
				
			case 800:	
				salariominimo=800;
				 salariomaximo=899;
				
				 vendaminima=(salariominimo-200)/0.09;
				 vendamaxima=(salariomaximo-200)/0.09;
				 comissaominima=0.09*vendaminima;
				 comissaomaxima=0.09*vendamaxima;
				
				System.out.printf("R$%.0f--%.0f",vendaminima,vendamaxima);	
				System.out.printf("%11.0f--%.0f%n",comissaominima,comissaomaxima);
				break;
				
			case 900:	
				salariominimo=900;
				salariomaximo=999;
				 vendaminima=(salariominimo-200)/0.09;
				 vendamaxima=(salariomaximo-200)/0.09;	
				 comissaominima=0.09*vendaminima;
				 comissaomaxima=0.09*vendamaxima;
				System.out.printf("R$%.0f--%.0f",vendaminima,vendamaxima);
				System.out.printf("%11.0f--%.0f%n",comissaominima,comissaomaxima);
				break;	
				
			case 1000:
				salariominimo=1000;			
				vendaminima=(salariominimo-200)/0.09;	
				 comissaominima=0.09*vendaminima;
				System.out.printf("R$%3.0f",vendaminima);	
				System.out.printf("%20.0f",comissaominima);
				
				break;	
			default:
				System.out.println("Inválido");
				break;
			}
			
			
			
			
			
		}
		
	}

}
