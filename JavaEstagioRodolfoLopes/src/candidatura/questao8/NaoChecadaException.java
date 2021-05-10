package candidatura.questao8;


public  class NaoChecadaException {
		   
	public static void main(String[] args) {
		
		
		
		try {
			
			int[] vetor = new int[4];
			
			System.out.println("Antes da exceção");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impresso"); //Essa linha não será mais lida
			
		}	catch(RuntimeException e)	{
				System.out.println("Exceção ao acessar o indice do vetor que não existe");
		}
		
			System.out.println("Esse texto será impresso após a exceção");
	}
	
	
	
		  
	}

