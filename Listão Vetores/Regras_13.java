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
		
		//Condição A
		for (i=0; i<10; i++) {
			
			ai = a[i]%2;
			if(ai == 0)  {
				b[i] = b[i]+1;
			}
		}
		
		//Condição B
		for (i=0; i<10; i++) {
			ai = a[i]%1;
			if(ai == 0)  {
				b[i] = b[i]+0;
			}
		}
		
		System.out.print("B = [");
		for (i=0; i<10;i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print("]\n");

		ler.close();
		
	}

}
