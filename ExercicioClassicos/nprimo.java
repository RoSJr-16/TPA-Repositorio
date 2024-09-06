import java.util.*;
public class nprimo {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, p=0, i = 1;
		//leitura
		System.out.println("Digite um número inteiro");
		n = ler.nextInt();
		while (i<n){
			//teste de resto de divisão é = 0
			if (n % i == 0){
				p = p+1;
			}
			i=i+1;
		}
			if (p==2) {
				System.out.println(n+ " não é um número primo");
			}else {
				System.out.println(n+ " é um número primo");
			}
		ler.close();
	}

}
