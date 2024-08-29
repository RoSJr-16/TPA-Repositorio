package lista02;
import java.util.Scanner;
public class SomaQuadrado {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		int v1,v2,v3,q1,q2,q3,total;
		System.out.println ("Insira o valor 1: ");
		v1 = ler.nextInt ();
		System.out.println ("Insira o valor 2: ");
		v2 = ler.nextInt ();
		System.out.println ("Insira o valor 3: ");
		v3 = ler.nextInt ();
		q1 = v1*v1;
		q2 = v2*v2;
		q3 = v3*v3;
		total = q1+q2+q3;
		System.out.println ("Soma dos quadrados: " +total);
		ler.close ();
	}
}