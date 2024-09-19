import java.util.Scanner;
public class Usuario10Idades {
	public static void main(String[] args) {
		int i, aa, an , idademaxi, idademini, id;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o ano atual");
		aa = ler.nextInt();
		System.out.println(" ");
		System.out.println("Insira o ano de nascimento");
		an = ler.nextInt();		
		idademaxi = aa - an;
		idademini = idademaxi;
		//Laço For...
		for (i=2; i<=10; i++) {
			System.out.println("Insira o ano atual");
			aa = ler.nextInt();
			System.out.println(" ");
			System.out.println("Insira o ano de nascimento");
			an = ler.nextInt();	
			id = aa - an;
			if (id>idademaxi){
				idademaxi = id;
			}
			
			if (id<idademini){
				idademini = id;
			}
		}
		System.out.println("Essa é a maior idade: "+idademaxi);
		System.out.println("Essa é a menor idade: "+idademini);
		
		ler.close();
	}
}
