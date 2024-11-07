package vetor;
import java.util.Scanner;
public class Pesquisa_11 {
	public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
	int a[] = new int[10];
	int i, p;
	
	for(i=0; i<10; i++) {
		System.out.println("Escreva o " +(i+1)+ "valor");
		a[i] = ler.nextInt();
	}
	
	System.out.println("Insira o número que você quer buscar: ");
	p = ler.nextInt();
	
	for(i=0; i<10; i++) {
		if(p == a[i]) {
			System.out.print("O valor que você procurou é esse: " + a[i]);
		}
	}
	
}

	
}
