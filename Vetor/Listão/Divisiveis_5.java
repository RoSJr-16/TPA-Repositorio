import java.util.*;
public class Divisiveis_5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, c;
		int a[] = new int[10];
		
		//leitura de dados
		for(i=0; i<10;i++) {
			System.out.println("porfavor insira o " + (i+1) + "° numero" );
			a[i] = ler.nextInt();
			
		}
		
		for(i=0; i<10; i++) {
			System.out.print("A[");
			System.out.print(a[i] + ": e seus divisiveis são: ");
			for(c=0; c<a[i]; c++) {
				
			}
			System.out.println("\n-------------------");
		}
	}
}
