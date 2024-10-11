import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, s=0;
		double m =0;
		int a[] = new int [10];
		
		//CONTA DA SOMA
		for(i=0; i<10; i++) {
			System.out.println("Insira o " + (i+1) + " valor de A");
			a[i] = ler.nextInt();
			s = s + a[i];
		}
		
		m=s/10;
		System.out.print(m);
		
		ler.close();
	}
}
