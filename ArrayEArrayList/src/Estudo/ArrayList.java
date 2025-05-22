package Estudo;

public class ArrayList {
	public static void main(String[] args) {
		java.util.ArrayList<String> cores = new java.util.ArrayList<>();
		//com o método display for aprimorado
		cores.add("Amarelo");
		cores.add(0,"Vermelho");
		gerarArrayList(cores,"As cores são: ");
	   //com o for por contador.	
		System.out.print("ArrayList é: ");
		for (int i = 0; i < cores.size(); i++) {
			System.out.printf("%s ",cores.get(i));			
		}
		System.out.println();
		
		cores.add("Green");
		cores.add("Vermelho");
		gerarArrayList(cores,"As cores agora são: ");
		
		cores.remove("Vermelho");
		gerarArrayList(cores,"As cores,depois da remoção, agora são: ");
		
		cores.remove(1);
		gerarArrayList(cores,"Removendo o primeiro indice do ArrayList, as cores agora são: ");
		//operador ternário
		System.out.printf("O Amarelo %s na lista",cores.contains("Amarelo")?"existe":"não existe");
		System.out.println();
		//if else
		if (cores.contains("Amarelo")==true) {
			System.out.println("O elemento existe");
			
		}else {
			System.out.println("O elemento não existe");
		}
		
		System.out.println("O tamanho da coleção é: "+cores.size());
		
		
		
		
	
		
	}
	public static void gerarArrayList(java.util.ArrayList<String> cores,String descrição) {
		System.out.printf(descrição);
		
		for (String cor : cores) {
			System.out.printf("%s ",cor);
			
		}
		System.out.println();
	}

}
