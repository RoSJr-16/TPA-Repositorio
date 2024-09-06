import java.util.*;
public class potencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in) ;
		double b, e;
		//leitura
			System.out.println("Insira uma base");
			b = ler.nextDouble();
			System.out.println("Insira um expoente");
			e = ler.nextDouble();
		//calcula da potência
			System.out.println(Math.pow(b, e));
			ler.close();
			
	}
}
