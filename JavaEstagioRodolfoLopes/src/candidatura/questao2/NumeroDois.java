package candidatura.questao2;

public class NumeroDois {

	
	public static void main (String[] args) {
		
		double random = Math.random();
		int r = (int) (1 + random *(10 - 1));
		int s = (int) (1 + random *(100 - 1));
		
		System.out.println(s + " N�mero rand�mico S");
		System.out.println(r + " N�mero rand�mico R");
		System.out.println("-------------------------------");
		
		for (s = s; s < 101; s++) {
			if ((s % 2 == 0) && (r * 2 == s )) {
				System.out.println("M�ltiplo do dobro de R encontrado!");
				break;
			} else {
				System.out.println(s);
			}
		}
		
		
		
	}
	
}
