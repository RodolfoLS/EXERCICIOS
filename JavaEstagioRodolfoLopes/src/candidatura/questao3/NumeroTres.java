package candidatura.questao3;

import java.util.Random;

public class NumeroTres {

	public static void main (String[] args) {

		Random random = new Random();
        
	int r = random.nextInt(9) + 1;
	int s = random.nextInt(999) + 1;
	int soma = 0;
	for (int i = 1; i <= s; i++) {
               
		if(r%i == 0) {
			soma += i;
		}

            
		if (i > r) {
			break;
		}
	}
	System.out.println(soma + " � a soma dos divisores de R.");
	System.out.println(r + " � o n�mero rand�mico de R.");
	System.out.println(s + " � o n�mero rand�mico de S");
}
		
	}
	
