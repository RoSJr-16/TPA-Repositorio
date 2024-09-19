import java.util.Scanner;
public class AlturaFeM {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String sexo, fim = "r";
		double altura, pesoi;
		int i=0;
		do {
			//Leitura
			System.out.println("Insira seu sexo: F ou M (coloque em minusculo por favor!!)");
			sexo = ler.next();
			System.out.println("Insira sua altura");
			altura = ler.nextDouble();
			
			//Tomada de decoisão
			if (sexo.equals("m")) {
				pesoi = 52 + (0.75 * (altura - 152.4));
				System.out.println("O seu peso ideal " +pesoi);
			}else {
				pesoi = 52 + (0.67 * (altura - 152.4));
				System.out.println("O seu peso ideal " +pesoi);
			}
			
			//Decisão usuário
			System.out.println("Quer continuar? Digite 1 para Sim ou 2 para não");
			fim = ler.next();
		}while (fim.equals ("1"));
		
			//fim do programa
		System.out.println("Programa encerrado");
		ler.close();
		}
	}