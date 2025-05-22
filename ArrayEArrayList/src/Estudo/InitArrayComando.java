package Estudo;
//O tamanho do array
//O valor do seu primeiro elemento
//incremento utilizado para calcular os valores dos elementos remanescentes do array.

public class InitArrayComando {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.printf("Erro: Digite novamente o comando inteiro, incluindo%n" + "um tamanho de matriz, valor inicial e incremento.%n");			
		}
		else {
			int arraylength=Integer.parseInt(args[0]);
			int[]array=new int[arraylength];
			
			int initialValue=Integer.parseInt(args[1]);
			int increment=Integer.parseInt(args[2]);
			
			for (int i = 0; i < array.length; i++) 
				array[i]=initialValue+increment*i;
				
				System.out.printf("%s%8s%n", "Index", "Value");
				for (int i = 0; i < array.length; i++) 
					System.out.printf("%5d%8d%n",i,array[i]);			
		}
		
	}
}
