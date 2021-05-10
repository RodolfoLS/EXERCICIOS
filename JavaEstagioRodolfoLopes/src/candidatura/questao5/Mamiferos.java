package candidatura.questao5;

public class Mamiferos extends Animais{

	private String mamar;
	
	
	public String mamar(String mamar) {
		System.out.println("Mamiferos");
		return mamar;
	}

	public String getMamar() {
		return mamar;
	}

	public void setMamar(String mamar) {
		this.mamar = mamar;
	}

	@Override
	public String getComer() {
		// TODO Auto-generated method stub
		return super.getComer();
	}

	@Override
	public void setComer(String comer) {
		// TODO Auto-generated method stub
		super.setComer(comer);
	}

	@Override
	public String getDomir() {
		// TODO Auto-generated method stub
		return super.getDomir();
	}

	@Override
	public void setDomir(String dormir) {
		// TODO Auto-generated method stub
		super.setDomir(dormir);
	}

	@Override
	public String comer(String comer) {
		// TODO Auto-generated method stub
		return super.comer(comer);
	}

	@Override
	public String dormir(String dormir) {
		// TODO Auto-generated method stub
		return super.dormir(dormir);
	}
	

	
	
	
	

	
	
}
