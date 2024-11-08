import java.util.*;
public class Expoente_6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int a[] = new int [11];
		double expo;
		
		//leitura dos valores.
		for(i=0; i<=10; i++) {
		System.out.println("porfavor insira o "+(i+1)+"° numero");
		a[i] = ler.nextInt();
		}
		
		//printar valores e calcurar.
		System.out.print("A[ ");
		for(i=0; i<11; i++) {
			expo = (int)Math.pow(a[i], 2);
			System.out.print(expo+" ");
		}
	}
}
