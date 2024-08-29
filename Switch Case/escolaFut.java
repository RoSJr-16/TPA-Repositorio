package switchCase02;
import java.util.*;
public class escolaFut {
	public static void main(String[] args) {
	//Scanner
	Scanner ler = new Scanner (System.in);
	//Variavel
	int an;
	//Leitura
	System.out.println("Insira a idade do aluno: ");
	an = ler.nextInt ();
	//Switch Case
	switch (an){
	case 6:
		System.out.println("Categoria: Dente de Leite");
		break;
	case 7:
		System.out.println("Categoria: Júnior");
		break;
	case 8:
		System.out.println("Categoria: Júnior Max");
		break;
	case 9:
		System.out.println("Categoria: Júnior Master");
		break;
	case 10:
		System.out.println("Master");
		break;
	default:
		System.out.println("Não aceitamos maiores de 10 anos");	
	ler.close ();
	}
	
	}
	
}
