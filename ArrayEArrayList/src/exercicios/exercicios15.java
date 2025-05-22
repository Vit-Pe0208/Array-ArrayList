package exercicios;
// Reescreva a Figura 7.2 para que o tamanho do array seja especificado pelo primeiro argumento de
//linha de comando. Se nenhum argumento de linha de comando for fornecido, utilize 10 como o tamanho padrão do array
public class exercicios15 {
	
	public static void main(String[] args) {
		int tamanho;
		
	   if(args.length==0) {
		   tamanho=10;
	   }else {
		   tamanho=Integer.parseInt(args[0]);
	   }
	   System.out.println(tamanho);
	   int[]array = new int [tamanho];
		
		
		
			System.out.printf("%5s%8s%n","Index","Valor");
			for (int i = 0; i < array.length; i++) {
				array[i]=0;
				System.out.printf("%5d%8d%n",i,array[i]);
				
			}
		}
		
		
		
		
		
	}


