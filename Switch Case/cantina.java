package switchCase02;
import java.util.*;
public class cantina {
	public static void main(String[] args) {
		//Scanner
		Scanner ler = new Scanner (System.in);
		//Variável
		int c;
		//Leitura
		System.out.println("Insira o código do lanche:");
		c = ler.nextInt();
		//Switch Case
		switch (c) {
		case 1:
			System.out.println("Cachorro quente ");
			System.out.println("Preço: R$ 8,00 ");
			break;
		case 2:
			System.out.println("Cheeseburger ");
			System.out.println("Preço: R$ 12,00 ");
			break;
		case 3:
			System.out.println("X-Salada ");
			System.out.println("Preço: R$ 15,00 ");
			break;
		case 4:
			System.out.println("X-Salada ");
			System.out.println("Preço: R$ 15,00 ");
			break;
		case 5:
			System.out.println("Misto Quente ");
			System.out.println("Preço: R$ 11,00 ");
		case 6:
			System.out.println("Pão na chapa ");
			System.out.println("Preço: R$ 6,00 ");
		ler.close();
		}
	}
}
