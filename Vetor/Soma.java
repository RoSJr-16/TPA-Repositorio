import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int [10];
		//começar a calcular os valores A
		for(i=0; i<10; i++) {
			System.out.println("Escreva o " + (i+1) + " valor de A");
			a[i] = ler.nextInt();
		}
		//calcular valor de B
		for(i=0; i<10; i++) {
			System.out.println("Escreva o " + (i+1) + " valor de B");
			b[i] = ler.nextInt();
		}
		//calcurar C
		System.out.print("C = [");
		for(i=0; i<10; i++) {
		c[i] = a[i] + b[i];
		System.out.print(c[i]+" ");
		}
		System.out.println("]");
		
		ler.close();
	}

}
