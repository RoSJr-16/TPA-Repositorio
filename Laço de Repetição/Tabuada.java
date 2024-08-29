import java.util.*;
public class Tabuada {
	public static void main(String[] args) {
		int i = 0, n, r;
		Scanner ler = new Scanner (System.in);
		System.out.println("Escreva um número");
		n = ler.nextInt();		
		while (i<10){
			i+=1;
			System.out.println(r=i*n);
		}
		ler.close();
	}
}
