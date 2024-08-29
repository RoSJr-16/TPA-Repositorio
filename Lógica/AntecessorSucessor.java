package lista02;
import java.util.Scanner;
public class AntecessorSucessor {
	public static void main (String args []){
		Scanner ler = new Scanner (System.in);
		int numero,ante,suce;
		System.out.println ("Inisra um número: ");
		numero = ler.nextInt ();
		ante = numero - 1;
		suce = numero +1;		
		System.out.println ("Antecessor do número: " +ante);
		System.out.println ("Sucessor do número: " +suce);
	}
}
