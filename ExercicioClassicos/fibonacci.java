package exercicios;
import java.util.*;
public class fibonacci {
	public static void main(String[] args) {
		int n, n2=0, n3=1, f=0, i=0;
		Scanner ler = new Scanner (System.in);
		System.out.println("Insira um número para obeter a sequência");
		n = ler.nextInt();
		while (i<n){
			System.out.println(f+"");
			f = n2+n3;
			n2=n3;
			n3=f;
			i++;
		}
	}
}