package lista01;
import java.util.Scanner;
public class ConversorDeDias {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int dias, meses, anos;
		System.out.println ("Insira o número de dias: ");
		dias = ler.nextInt ();
		meses = dias/30;
		anos = dias/365;
		System.out.println ("Número de mese(s): " +meses);
		System.out.println ("Número de ano(s): " +anos);
	}
}
