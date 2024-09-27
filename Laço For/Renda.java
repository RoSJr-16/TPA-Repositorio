package porva;
import java.util.*;
public class Renda {
	public static void main(String[] args) {
		int i=1, na=0;
		double renda, rendalta=0, media=0, soma=0; 
		Scanner ler = new Scanner (System.in);
		System.out.println("Insira a renda de 40 alunos");
		renda = ler.nextDouble();
		rendalta=renda;
		System.out.println("Aluno " +i+ " = " +renda);
		//for
		for (i=2; i<=40; i++ ) {
			System.out.println("Insira a renda de 40 alunos");
			renda = ler.nextDouble();
			// maior renda
			if (rendalta<renda){
				rendalta=renda;
				na=i;
			}
			
			//soma
			soma=soma+renda;
			
			//media
			media = soma/40;

			//n° maior renda
			if(rendalta<renda) {
				na=i;
			}
			System.out.println("Aluno " +i+ " = " +renda);
		}
		System.out.println(" ");
		System.out.println("Soma da renda dos alunos " +soma);
		System.out.println("Média da renda dos alunos " +media);
		System.out.println("Maior renda " +rendalta);
		System.out.println("Numero do aluno com maior renda " +na);
		ler.close();
	}
}