public class Multiplo1a100 {
	public static void main(String[] args) {
		int i=0, r=0;
		//laço for
		for (i=0; i<=100; i=i+1 ) {
			System.out.println(i);
			r = i%10;
			if (r==0) {
				System.out.println("Esse número é divisivel por 10");
			}
		}
	}
}