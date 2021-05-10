package candidatura.questao10;

public class BrechaBinaria {

	
	private int n;
	private int retorno;
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	public int getRetorno() {
		return retorno;
	}
	public void setRetorno(int retorno) {
		this.retorno = retorno;
	}

	public BrechaBinaria(int n, int retorno) {
		super();
		this.n = n;
		this.retorno = retorno;
	}
	
	public void solucao(int n) {
		
		Integer numeroBin;
		
		numeroBin = new Integer( 1 + (int) (Math.random()*2147483647));
		String printNumero = numeroBin.toBinaryString(numeroBin);
		
		System.out.println(numeroBin);
		System.out.println(printNumero);
		
		
	}
	
	
}
