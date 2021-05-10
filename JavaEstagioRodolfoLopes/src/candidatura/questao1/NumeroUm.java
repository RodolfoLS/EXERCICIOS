package candidatura.questao1;

public class NumeroUm {

	public static void main (String[] args) {
	
	double random = Math.random();
	int r = (int) (1 + random * (100 - 1));
	int t = 5;
	int m = 0;
	int resul;
	
	
	System.out.println(r);
	System.out.println();

	
			for (r = r; r < 101; r++) {
				if ((r % 2 == 0) && (r % 5 != 0 )) {
					System.out.println(r);
				}
			}
		}
	
	
	
	}