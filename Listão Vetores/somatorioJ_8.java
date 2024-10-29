import java.util.Scanner;
public class somatorioJ_8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i,j;
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		
		for (i=0; i<10; i++) {
			System.out.println("Insira o "+(i+1)+ " número");
			a[i]=ler.nextInt();
			
		}
		
		for (i=0; i<10; i++) {
			System.out.println("Insira o "+(i+1)+ " número");
			b[i]=ler.nextInt();
			
		}
		
		for (i=0; i<10; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.print();
	}
}
