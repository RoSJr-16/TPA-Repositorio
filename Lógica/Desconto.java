package lista01;
import java.util.Scanner; 
public class Desconto {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		double produto, desconto, novoPreco;
		System.out.println ("Insira o preço do produto: ");
		produto = ler.nextDouble ();
		desconto = produto/100*5;
		novoPreco = desconto;
		System.out.println ("Produto com desconto: " +novoPreco);
	}
}