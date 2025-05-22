package Estudo;

public class ArrayListEstudantes {
	public static void main(String[] args) {
		java.util.ArrayList<String> alunos = new java.util.ArrayList<String>();
		
		alunos.add("Sara");
		alunos.add(0,"Albert");
		alunos.add("Vitor");
		
		System.out.println("Os alunos são: "+alunos);
		System.out.print("Os alunos são: ");
		for (int i = 0; i < alunos.size(); i++) {
			System.out.printf("%s ",alunos.get(i));		
		}
		System.out.println();
		gerarnomes(alunos,"Os aluno são: ");
		
		alunos.remove(0);
		alunos.remove("Sara");
		
		gerarnomes(alunos,"Os aluno são: ");
		
		int quantidade=alunos.size();
		System.out.println("A quantidade de alunos é: "+quantidade);
		
		
		
		
		
	}
	public static void gerarnomes(java.util.ArrayList<String> alunos,String texto) {
		System.out.print(texto);
		
		for (String nome : alunos) {
			System.out.printf("%s ",nome);
		}
		System.out.println();
		
	}

}
