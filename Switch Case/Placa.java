package switchcase01;
import java.util.*;
public class Placa {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;
		System.out.println("Insira um número referente a um dia da semana: ");
		n = ler.nextInt();
		//Switch Case
		switch (n) {
		case 1:
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
		case 4:
			System.out.println("Terça-Feira");
			break;
		case 5:
		case 6:
			System.out.println("Quarta-Feira");
			break;
		case 7:
		case 8:
			System.out.println("Quinta-Feira");
			break;
		case 9:
		case 0:
			System.out.println("Sexta-Feira");
		default:
			System.out.println("Placa inválida");
		ler.close();
		}
	}
}
