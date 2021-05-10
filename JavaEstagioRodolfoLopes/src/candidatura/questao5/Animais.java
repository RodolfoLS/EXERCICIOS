package candidatura.questao5;

public class Animais {
	
	private String comer;
	protected  String dormir;
	
	
	
	public Animais(String comer, String dormir) {
		super();
		this.comer = comer;
		this.dormir = dormir;
	}
	public String getComer() {
		return comer;
	}
	public void setComer(String comer) {
		this.comer = comer;
	}
	public String getDomir() {
		return dormir;
	}
	public void setDomir(String dormir) {
		this.dormir = dormir;
	}
	
	public String comer(String comer) {
		System.out.println("Animais, Mamiferos e Aves");
		return comer;
	}
	
	public String dormir(String dormir) {
		System.out.println("Animais, Mamiferos e Aves");
		return dormir;
	}
	
	public Animais() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
