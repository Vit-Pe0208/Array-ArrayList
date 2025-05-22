package Estudo;

public class Estudo1 {
	public static void main(String[] args) {
		int a=5,b=6;
		int[] c= new int [12];
		c[0]=-45;
		c[1]=6;
		c[2]=0;
		c[7]=62;
		c[a+b]+=2;
		System.out.println("O valor na posição 11 do array é: "+c[a+b]);
		System.out.println("O tamanho do array é: "+c.length);
		int sum=c[0]+c[1]+c[2];
		System.out.println("A soma dos indices 0,1 e 2 é: "+sum);
		double x=c[6]/2;
		System.out.println("A metade do indice 6 é: "+x);
		
		
		
	}

}
