package exercicios;
//(Usando a instrução for aprimorada) Escreva um aplicativo que usa uma instrução for aprimorada para somar os valores double
//passados pelos argumentos de linha de comando. [Dica: utilize o método static parseDouble da classe Double para converter uma
//String em um valor double.]

public class exercicios16 {
	public static void main(String[] args) {
		double somaDouble=0;
		for (String value : args) {
			double valor= Double.parseDouble(value);
			somaDouble +=valor;			
		}
		System.out.println(somaDouble);
		
		
	}

}
