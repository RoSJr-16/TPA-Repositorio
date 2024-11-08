import java.util.Scanner;
public class CresDecres_15 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int i, j;
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		
		//Inserir A
		for(i=0; i < a.length; i++) {
			System.out.println("Escreva o " +(i+1)+ "° número de A");
			a[i] = ler.nextInt();
		    b[i] = a[i];    
		    c[i] = a[i];
		}
		
		//B em ordem crescente
		for (i = 0; i < b.length; i++) {
		    for (j = 0; j < i; j++) {
		        if (b[j] > b[j]) {
		            int temp = b[j];
		            b[i] = b[j];
		            b[j] = temp;
		        }
		    }
		}
		
		//C em ordem decrescente
		for (i = 0; i < c.length; i++) {
		    for (j = 0; j < i; j++) {
		        if (b[j] > b[j]) {
		            int temp = b[j];
		            c[i] = c[j];
		            c[j] = temp;
		        }
		    }
		}
		
		//Printando A, B e C
		System.out.print("A = [");
		for (i=0; i<10;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.print("]\n");
		
		System.out.print("B = [");
		for (i=0; i<10;i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print("]\n");
		
		System.out.print("C = [");
		for (i=0; i<10;i++) {
			System.out.print(c[i]+ " ");
		}
		System.out.print("]\n");
		
		ler.close();
	}

}
