import java.util.Scanner;
public class Regras2_14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int [10];
		int b[] = new int [10];
		int c[] = new int [10];
		int i;
		
		//Vetor A
		for(i=0; i<10; i++) {
			System.out.println("Escreva o " +(i+1)+ "� n�mero de A");
			a[i] = ler.nextInt();
		}
		
		//Vetor B
		for(i=0; i<10; i++) {
			System.out.println("Escreva o " +(i+1)+ "� n�mero de B");
			b[i] = ler.nextInt();
		}
		
		//Condi��o A
		for (i=0; i<10; i++) {
			if(a[i]>b[i]) {
				c[i] = 1;
			}
		}
		
		//Condi��o B
		for (i=0; i<10; i++) {
			if(a[i]==b[i]) {
				c[i] = 0;
			}
		}
		
		//Condi��o C
		for (i=0; i<10; i++) {
			if(a[i]<b[i]) {
				c[i] = -1;
			}
		}
		
		System.out.print("C = [");
		for (i=0; i<10;i++) {
			System.out.print(c[i]+ " ");
		}
		System.out.print("]\n");
		
		ler.close();
		
	}		
}


