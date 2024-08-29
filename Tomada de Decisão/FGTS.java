package lista05;
import java.util.Scanner;
public class FGTS {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int sal, inss, valor;
		System.out.println("Insira seu salário, pobre:");
		sal = ler.nextInt ();
		if (sal<2500){
			inss = 2500/100*11;
			System.out.println("");
			valor = sal - inss;
			System.out.println("Seu valor liquido:" + valor);
			
		}else{
			inss = 2500/100*9;
			System.out.println("Seu valor de INSS");
			valor = sal - inss;
		}
		ler.close();
		
		
	}
}
