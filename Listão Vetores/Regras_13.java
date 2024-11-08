import java.util.Scanner;
public class Regras_13 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a[] = new int [10];
		int b[] = new int [10];
		int i, ai=0;
		
		for(i=0; i<10; i++) {
			System.out.println("Escreva o " +(i+1)+ "° número");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<10; i++) {
			//Condição A
			ai = a[i]%2;
			if(ai == 0)  {
				b[i] = b[i]+1;
				System.out.print(b[i]);
			}
		}
		
		for (i=0; i<10; i++) {
			//Condição B
			ai = a[i]%1;
			if(ai == 0)  {
				b[i] = b[i]+0;
				System.out.print(b[i]);
			}
		}

		ler.close();
		
	}

}
