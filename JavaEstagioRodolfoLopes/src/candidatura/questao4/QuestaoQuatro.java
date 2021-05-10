package candidatura.questao4;



public class QuestaoQuatro {

	private void diasMes(int m) {
		
		switch(m) {
		
			case 1:
				System.out.println("Mês com 31 dias");
			break;
			
			case 2:
				System.out.println("Mês com 30 dias");
			break;
			
			case 3:
				System.out.println("Mês com menos de 30 dias");
			break;
			
			default:
				System.out.println("Número invalído");
	
		}
		
	}
	
	public final void qualDiaMes() {
		double random = Math.random();
		int r = (int) (1 + random *(12 - 1));
		
		
		QuestaoQuatro qq2 = new QuestaoQuatro();
		
		for (int i = 1; i <= 1; r++) {
			i = r;
			System.out.println(i);
			
			if(i == 2) {
				qq2.diasMes(3);
			} else if (i == 4 || i == 6 || i ==9 || i == 11 ) {
				qq2.diasMes(2);
			} else {
				qq2.diasMes(1);
			}
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		QuestaoQuatro qq = new QuestaoQuatro();
		
		qq.qualDiaMes();
		

		
	}

	
}
	

	
	

