package lista01;
import java.util.Scanner;
public class AnoNascimento {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		int nascimento, AnoAtual, idade;
		System.out.println ("Insira o ano do seu nascimento:");
		nascimento = ler.nextInt();
		System.out.println ("Insira o ano atual:");
		AnoAtual = ler.nextInt();
		idade = AnoAtual - nascimento;
		System.out.println ("Sua idade é: " +idade);
		ler.close ();
	}
}
