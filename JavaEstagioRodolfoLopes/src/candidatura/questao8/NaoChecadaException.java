package candidatura.questao8;


public  class NaoChecadaException {
		   
	public static void main(String[] args) {
		
		
		
		try {
			
			int[] vetor = new int[4];
			
			System.out.println("Antes da exce��o");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto n�o ser� impresso"); //Essa linha n�o ser� mais lida
			
		}	catch(RuntimeException e)	{
				System.out.println("Exce��o ao acessar o indice do vetor que n�o existe");
		}
		
			System.out.println("Esse texto ser� impresso ap�s a exce��o");
	}
	
	
	
		  
	}

