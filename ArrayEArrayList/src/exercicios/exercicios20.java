package exercicios;

import Estudo.rascunho;

//Vendas totais) Utilize um array bidimensional para resolver o seguinte problema: uma empresa tem quatro vendedores  (1 a 4)
//que vendem cinco produtos diferentes (1 a 5). Uma vez por dia, cada vendedor passa uma nota de cada tipo de produto diferente vendido.
//Cada nota contém o seguinte:
//a) O número do vendedor
//b) O número do produto
//c) O valor total em reais desse produto vendido nesse dia
//Portanto, cada vendedor passa entre 0 e 5 notas de vendas por dia. Suponha que as informações a partir de todas as notas durante o
//último mês estejam disponíveis. Escreva um aplicativo que leia todas essas informações sobre as vendas do último mês e resuma as vendas
//totais por vendedor e por produto. Todos os totais devem ser armazenados no array bidimensional sales. Depois de processar todas as in-
//formações do último mês, exiba os resultados em formato tabular, com cada coluna representando um vendedor particular e cada linha re-
//presentando um produto particular. Some cada linha para obter o total das vendas de cada produto no último mês. Some cada coluna para
//obter o total de vendas por vendedor no último mês. Sua saída tabular deve incluir esses totais cruzados à direita das linhas totalizadas e na
//parte inferior das colunas totalizadas.
public class exercicios20 {
 private static int[][]array= new int[5][4];
	 
	 public exercicios20(int[][]array) {
		 this.array=array;
	 }
	 
	 public static void inicializararray() {
			
			int [][]array1={ {1,2,3,4}, {1,2,3,4},{0,0,0,0},{2,4,6,8},{1,3,5,7} };	
			exercicios20 array2 = new  exercicios20(array1);
			array2.programa();
			
			
		}
	 
	 
	public static void main(String[] args) {
     rascunho.inicializararray();
   
   }
	
	
	
	public static int somarlinhas(int[]array) {
		int soma=0;
		
		for (int i = 0; i < array.length; i++) 
			soma += array[i];	
		
		
		 return soma;
	}
	
	
	public static void somarcolunas() {
		
		for (int i = 0; i < array[0].length; i++) {
			int soma = 0;
			
			for (int j = 0; j < array.length; j++) {
				
				soma += array[j][i];
				
			
			}
			System.out.printf("%15d",soma);
			
		}
	}
	
	
	
 public static void programa() {
	
	
    System.out.println("Relatório de vendas");
    System.out.println("                   ");
    System.out.print("                  ");
    for (int i = 0; i < 4; i++) {
    	System.out.printf("vendedor %-6d",i+1);
	}
    System.out.println("Total de vendas do produto");
   
    
    
     
   for (int i = 0; i < array.length; i++) {
	   System.out.printf("produto %d",i+1);
   	
   	for (int number : array[i]) {
   		System.out.printf("%15d", number);	
		}
   	int somarlinhas = somarlinhas(array[i]);
   	System.out.printf("%15d%n",somarlinhas);
	}
   System.out.print("total");
   System.out.print("    ");
   somarcolunas();
	
		
		
}

	
	
	


}
