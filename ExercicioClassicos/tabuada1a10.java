
public class tabuada1a10 {
	public static void main(String[] args) {
		int n=1, i=1, r=0;
		//While 1
		while (n<10){
			while(i<11) {
				r=i*n;
				System.out.println(n+ "x" +i+ "=" +r);
				i=i+1;
			}
			//Adição tabuada
			i=2;
			n=n+1;
			//While 2
				while(i<11) {
					r=i*n;
					System.out.println(n+ "x" +i+ "=" +r);
					i=i+1;
				}
			
		}
	}
}
