import java.util.Scanner;
public class CrescDecres_15 {
	   public static void main(String args[]){
		 
		   Scanner ler = new Scanner(System.in);
		    int a[], b[], c[], i, or, n;
		    a = new int [10];
		    b = new int [10];
		    c = new int [10];
		    
		    //Lendo o vetor A
		    for(i=0; i<10; i++ ) {
		      System.out.println("Insira o "+(i+1)+"� n�mero de A");
		      a[i] = ler.nextInt();
		      b[i] = a[i];    
		      c[i] = a[i];
		    }
		    
		    //Fazendo a ordem Crescente de B
		    for (i = 0; i < 10 - 1; i++) {
		      for (or = 0; or < 10 - 1 - i; or++) { 
		        if (b[or] > b[or + 1]) { 
		          n= b[or]; 
		          b[or] = b[or + 1];
		          b[or + 1] = n; 
		        } 
		      } 
		     } 
		     
		    //Fazendo a ordem Decrescente de C
		    for (i = 0; i < 10 - 1; i++) { 
		      for (or = 0; or < 10 - 1 - i; or++) {
		        if (c[or] < c[or + 1]) { 
		          n = c[or];
		          c[or] = c[or + 1]; 
		          c[or + 1] = n;
		        }
		      }
		    }
		    
		    //Apresentando os Vetores A, B e c em suas respectivas ordens 
		    
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

	   
	    