package lista01;
import java.util.Scanner;
public class ValoresInvertidos {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		int a,b,c;
		System.out.println ("Insira o valor A: ");
		a = ler.nextInt ();
		System.out.println ("Insira o valor B: ");
		b = ler.nextInt ();
		c = a;
		a = b;
		b = c;
		System.out.println ("Valor A: " +a);
		System.out.println ("Valor B: " +b);
	}
}