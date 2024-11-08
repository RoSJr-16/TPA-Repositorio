import java.util.Scanner;
public class Somatoria_8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i,j,s;
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		
		
		//inserir A
		for (j=0; j<10; j++) {
			System.out.println("Insira o "+(j+1)+ " número");
			a[j]=ler.nextInt();
		}
		
		//calculo B
		for(i=0; i<10; i++) {
			s=0;
			for(j = i; j<10; j++) {
				b[i] += a[j];
			}

		}
		
		System.out.print("B= ");
		for (i=0; i<10;i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.println();
		
		
		
	}
}