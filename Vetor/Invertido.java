import java.util.Scanner;
public class Invertido {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, ib=9;
		int a[] = new int[10];
		int b[]  = new int[10];
		//iniciar a conta de A
		for(i=0; i<10; i++) {
			System.out.println("Escreva o " + (i+1) + " valor de A");
			a[i] = ler.nextInt();
			b[ib] = a[i];
			ib--;
		}
		System.out.print("a = [");
		for(i=0; i<10; i++) {
			System.out.print(a[i]+" ");	
		}

	}
}
