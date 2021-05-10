package candidatura.questao8;

public class ChecadaException {

	private int identificador;
	private double saldo;
	
	
	
	public int getIdentificador() {
		return identificador;
	}



	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void depositar(double valor) throws Exception {
		if(valor < 0) {
			Exception erro = new Exception ("Não é permitido depositar um valor negativo");
			throw erro;
		}
		saldo += valor;
	}
	
	public static void main(String[] args) throws Exception {
		ChecadaException ce = new ChecadaException();
		
		
		try {
		ce.depositar(-50);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
}
