package candidatura.questao5;

public class Aves extends Animais {

	private String voar;

	public String voar(String voar) {
		System.out.println("Aves");
		return voar;
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

	public String getVoar() {
		return voar;
	}

	public void setVoar(String voar) {
		this.voar = voar;
	}

	public Aves(String comer, String dormir, String voar) {
		super(comer, dormir);
		this.voar = voar;
	}
	
	

	
	
	
	
	
}
