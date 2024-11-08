import java.util.*;
public class Pares_4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, c;
		int a[] = new int[10];
		
		//iniciar leitura
		for(i=0; i<10; i++) {
			System.out.println("porfavor insira o " + (i+1) + "° numero" );
			a[i] = ler.nextInt();
	
		}
		for(i=0; i<10; i++) {
			System.out.print("A[");
			System.out.print(a[i] + ": e seus pares ");
			for(c=0; c<=a[i]; c++) {
				
				if(c % 2==0) {
					System.out.print(c+" ");
				}
			}
			System.out.println("\n-------------------");
		}
	}
}
