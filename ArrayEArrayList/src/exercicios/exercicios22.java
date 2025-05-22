package exercicios;

// 
//Monitore a posição atual da tartaruga todas as vezes e se a caneta está atualmente para cima ou para baixo. Suponha que a tartaruga sempre
//inicie na posição (0, 0) do chão com sua caneta para cima. O conjunto de comandos de tartaruga que seu aplicativo deve processar é mostra-
//do na Figura 7.29.
//Comando Significado
//1 Caneta para cima
//2 Caneta para baixo
//3 Vira para a direita
//4 Vira para a esquerda
//5,10 Avance 10 espaços (substitua 10 por um número diferente de
//espaços)
//6 Exiba o array 20 por 20
//9 Fim dos dados (sentinela)
//Figura 7.29 | Comandos dos gráficos de tartaruga.
//Capítulo 7 Arrays e ArrayLists 237
//Suponha que a tartaruga esteja em algum lugar próximo ao centro do chão. O “programa” seguinte desenharia e exibiria um quadra-
//do de 12 por 12 deixando a caneta na posição levantada:
//2
//5,12
//3
//5,12
//3
//5,12
//3
//5,12
//1
//6
//9
//À medida que a tartaruga se move com a caneta por baixo, configure os elementos apropriados do array floor como 1s. Quando o
//comando 6 (exibir o array) for dado, onde quer que haja um 1 no array, exiba um asterisco ou o caractere que você escolher. Onde quer que
//haja um 0, exiba um espaço em branco.
//Escreva um aplicativo para implementar as capacidades dos gráficos de tartaruga discutidas aqui. Escreva vários programas de gráfico
//de tartaruga para desenhar formas interessantes. Adicione outros comandos para aumentar as capacidades de sua linguagem de gráfico de
//tartaruga

public class exercicios22 {
	 private static byte[][] piso = new byte[20][20];
	    private static int[] comandos = {2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9};
	    private static boolean canetaAbaixada = false; // Caneta está abaixada?
	    private static int direcao = 1; // 0 = cima, 1 = direita, 2 = baixo, 3 = esquerda
	    private static int linha = 0; // Posição atual (linha)
	    private static int coluna = 0; // Posição atual (coluna)

	    public static void main(String[] args) {
	        for (int i = 0; i < comandos.length; i++) {
	            int comando = comandos[i];

	            switch (comando) {
	                case 1:
	                    canetaAbaixada = false; // Levantar a caneta
	                    break;
	                case 2:
	                    canetaAbaixada = true; // Abaixar a caneta
	                    break;
	                case 3:
	                    virarDireita(); // Virar para a direita
	                    break;
	                case 4:
	                    virarEsquerda(); // Virar para a esquerda
	                    break;
	                case 5:
	                    int passos = comandos[++i]; // Avançar o número de passos especificados
	                    mover(passos);
	                    break;
	                case 6:
	                    imprimirPiso(); // Exibir o piso
	                    break;
	                case 9:
	                    return; // Fim dos dados
	            }
	        }
	    }

	    // Métodos auxiliares
	    public static void virarDireita() {
	        direcao = (direcao + 1) % 4; // Muda a direção para a direita
	    }

	    public static void virarEsquerda() {
	        direcao = (direcao + 3) % 4; // Muda a direção para a esquerda
	    }

	    public static void mover(int passos) {
	        for (int i = 0; i < passos; i++) {
	            // Atualizar posição com base na direção
	            switch (direcao) {
	                case 0: // Cima
	                    if (linha > 0) linha--;
	                    break;
	                case 1: // Direita
	                    if (coluna < piso[linha].length - 1) coluna++;
	                    break;
	                case 2: // Baixo
	                    if (linha < piso.length - 1) linha++;
	                    break;
	                case 3: // Esquerda
	                    if (coluna > 0) coluna--;
	                    break;
	            }

	            // Marcar o piso se a caneta estiver abaixada
	            if (canetaAbaixada) {
	                piso[linha][coluna] = 1;
	            }
	        }
	    }

	    public static void imprimirPiso() {
	        for (int l = 0; l < piso.length; l++) {
	            for (int c = 0; c < piso[l].length; c++) {
	                if (piso[l][c] == 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	

}
