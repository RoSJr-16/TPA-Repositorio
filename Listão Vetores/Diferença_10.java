import java.util.Scanner;
public class Diferença_10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int [10];
		int b[] = new int [10];
		int c[] = new int [10];
		int i;
		
		//Vetor A
		for(i=0; i<10; i++) {
			System.out.println("Escreva o " +(i+1)+ "° número de A");
			a[i] = ler.nextInt();
		}
		
		//Vetor B
		for(i=0; i<10; i++) {
			System.out.println("Escreva o " +(i+1)+ "° número de B");
			b[i] = ler.nextInt();
		}
		
		//diferença
	    for (i=0 ; i<10 ; i++)
	    	if (a[i]!=b[i]) {
	    		c[i]=a[i];
	    	}
	    
	  //Apresentando A, B e C
		
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
