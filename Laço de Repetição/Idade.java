import java.util.*;
public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int an, aa, id, i=0;
		System.out.println("Insira o ano atual:");
		aa = ler.nextInt();
		while (i<6) {
			i+=1;
			System.out.println("Insira o ano de nascimento:");
			an = ler.nextInt();
			id = aa-an;
			System.out.println("Essa é a idade do úsuario: " +id);
			System.out.println(" ");
			if (id<18){
				System.out.println("Menor de idade");
			}else{
				System.out.println("Maior de idade");
			}
		}
		ler.close();
	}
}
