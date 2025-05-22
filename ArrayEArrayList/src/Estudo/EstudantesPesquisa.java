package Estudo;
//Vinte estudantes foram solicitados a classificar em uma escala de 1 a 5 a qualidade de comida no refeitório estudantil, com 1 sendo horrível e 5 sendo excelente.
//Coloque as 20 respostas em um array de inteiros e determine a frequência de cada classificação
public class EstudantesPesquisa {
	
	public static void main(String[] args) {
		//respostas dos alunos{1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14}
		int[] respostas= {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
		int[] frequencia= new int[6];
		
		for (int i = 0; i < respostas.length; i++) 
				
		try {
			++frequencia[respostas[i]];		
			
		} catch (Exception e) {
			System.out.println(e);//chamo um método toSttring
			System.out.printf("respostas[%d]=%d%n%n",i,respostas[i]);
		}
		
		System.out.printf("%s%10s%n","Notas","frequencia");
		
		for (int notas = 1; notas < frequencia.length; notas++) {
			System.out.printf("%d%10d%n",notas,frequencia[notas]);
			
		}
		
		
	}
	

}
