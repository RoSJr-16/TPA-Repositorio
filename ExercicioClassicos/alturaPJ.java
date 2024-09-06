
public class alturaPJ {
	public static void main(String[] args) {
		double aj, ap;
		int i=0;
		//leitura
		aj = 1.34;
		ap = 1.45;
		//while
		while (aj<ap) {
			aj = aj+0.025;
			ap = ap+0.02;
			i=i+1;
			}
		System.out.println("Se passaram " +i+ " anos, João está mais alto que Pedro." );
		}
	}