import java.util.Scanner;
public class Palindromo12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner  (System.in);
		int i, p1=0, p2=0, p3=0, p4=0, p5=0;
		int a[] = new int[10];
		
		for ( i=1; i<10; i++) {
			System.out.println("Insira 10 valores diferentes para um palindromo");
			a[i] = ler.nextInt();
		}
		
		p1 = a[1];
		p2 = a[2];
		p3 = a[3];
		p4 = a[4];
		p5 = a[5];
		
		if (p1 == a[9] && p2 == a[8] && p3 == a[7] && p4 == a[6] && p5 == a[5]) {
			System.out.println("É um palindromo");
		}else {
			System.out.println("Não é um palindromo");
		}
		
	}
}
