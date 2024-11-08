import java.util.*;
public class Tabuada_2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, p, n=0, r;
		int a[] = new int[5];
		
		//iniciar Scanner do A
		for(i=0; i<5; i++) {
			System.out.println("Digite o " +(i+1)+ "°" +" para calcular");
			a[i] = ler.nextInt();
		}
		//Fazendo o cálculo da tabuada
		for (i=0; i<5; i++) {
			System.out.println("Tabuada do " +a[i]+" :");
			for (p=1; p<11; p++) {
				r=a[n]*p;
				System.out.println(a[n]+"x"+p+"="+r);
			}
			n++;
		}
	}
}