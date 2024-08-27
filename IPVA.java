package lista02;
import java.util.Scanner;
public class IPVA {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int vv, ipva;
		System.out.println("Insira o preço do seu veículo:");
		vv = ler.nextInt ();
		ipva = vv/100*4;
		System.out.println("O valor do IPVA so seu veículo:" +ipva);
		ler.close();
	}

}
