package exercicios;
import java.util.*;
public class Media {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int ni, nf , i=0, r=0, e=0;
	double m=0;
	System.out.println("Insira um número inicial");
	ni = ler.nextInt ();
	System.out.println("Insira um número final");
	nf = ler.nextInt ();
	i = ni;
	while (i<=nf) {
		r = i+r;
		i++;
		e++;
	}
	r = r/e;
	System.out.println(r);
		ler.close();
	}
}