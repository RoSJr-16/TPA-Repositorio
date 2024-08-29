import java.util.*;
public class cashback {
	public static void main(String[] args) {
		//Scanner
		Scanner ler = new Scanner (System.in);
		//Variáveis
		double com,cash;
		//Leitura
		System.out.println("Insira o valor da compra:");
		com = ler.nextDouble ();
		//IF - Tomada de decisão
		if (com == 100.00) {
			cash = com/100*5;
			System.out.println("Valor de cashback " + cash);
		}else if (com<1000.00){
			cash = com/100*8;
			System.out.println("Valor de cashback " + cash);
		}else if (com<2000.00){
			cash = com/100*10;
			System.out.println("Valor de cashback " + cash);
		}else if (com<5000.00){
			cash = com/100*12.5;
			System.out.println("Valor de cashback " + cash);
		}else
			cash = com/100*15;
			System.out.println("Valor de cashback " + cash);
			ler.close();
	}
}
