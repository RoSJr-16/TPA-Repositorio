import java.util.Scanner;
public class ImparPar_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int a[] = new int[20];
		int b[] = new int[20];
		
		//inializar o A.
		for(i=0; i<20; i++) {
			System.out.println("porfavor coloque o " +(i+1)+ " numero");
			a[i] = ler.nextInt();
			
		}
		//printar os resutados Impares.
		System.out.print("A [ ");
		for(i=0; i<20; i++) {
			b[i] = a[i] % 2;
			
			if(b[i]==1) {
				System.out.print(a[i] + " ");
			} 
		}System.out.print("]:são impares");
		
		//printar os resutados pares.
		System.out.print(" A [ ");
		for(i=0; i<20; i++) {
			b[i] = a[i] % 2;
			
			if(b[i]==0) {
				System.out.print(a[i] + " ");
			}
		}System.out.print("]:pares");
		ler.close();
	}
}
