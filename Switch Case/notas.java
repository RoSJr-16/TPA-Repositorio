package switchCase02;
import java.util.*;
public class notas {
	public static void main(String[] args) {
		//Scanner
		Scanner ler = new Scanner (System.in);
		
		//Variável
		int mb, b, r, i, total;
		String men;
		
		//Leitura
		System.out.println("Insira o número total de alunos:");
		total = ler.nextInt();
		System.out.println("Insira os alunos com MB:");
		mb = ler.nextInt ();
		System.out.println("Insira os alunos com B:");
		b = ler.nextInt ();
		System.out.println("Insira os alunos com R:");
		r = ler.nextInt ();
		System.out.println("Insira os alunos com I:");
		i = ler.nextInt();
		System.out.println("Escolha a nota: ");
		men = ler.next();
		
		//Switch Case
		switch (men) {
		case "mb":
			System.out.println(total*mb/100);
			break;
		case "b":
			System.out.println(total*b/100);
			break;
		case "r":
			System.out.println(total*r/100);
			break;
		case "i":
			System.out.println(total*i/100);
			break;
		}
		ler.close();
	}
}