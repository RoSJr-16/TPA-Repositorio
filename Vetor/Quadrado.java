import java.util.Scanner;
public class Quadrado {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//varíavel vetor
		int i;
		int a[] = new int[10];
		int b[] = new int[10];
		
		//ler o valor de A e calculando B
		for(i=0; i<10; i++) {
			System.out.println("Escreva o " + (i+1) + " valor de A");
			a[i] = ler.nextInt();
			b[i] = a[i]*a[i];
		}
		
		//printar os valores de A e B
		System.out.print("A = [");
		for(i=0; i<10; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]\n");
		
		//apresentando B
		System.out.print("B = [");
		for(i=0; i<10; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]\n");
		
		ler.close();
	}

}
