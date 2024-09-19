import java.util.Scanner;
public class Usuario10Idades {
	public static void main(String[] args) {
		int i, aa, an , idmax, idmini, id;
		Scanner ler = new Scanner (System.in);
		
		//leitura
		System.out.println("Insira o ano atual");
		aa = ler.nextInt();
		System.out.println(" ");
		System.out.println("Insira o ano de nascimento");
		an = ler.nextInt();
		idmax = aa - an;
		idmini = idmax;
		System.out.println(idmax);
		
		//Laço For...
		for (i=2; i<=10; i++) {
			System.out.println("Insira o ano de nascimento");
			an = ler.nextInt();	
			System.out.println(" ");
			id = aa - an;
			System.out.println(id);
		//tomada de decisão para saber o mais novo e mais velho
			if (id>idmax){
				idmax = id;
			}
			
			if (id<idmini){
				idmini = id;
			}
		}
		System.out.println("Essa é a maior idade: "+idmax);
		System.out.println("Essa é a menor idade: "+idmini);
		ler.close();
	}
}