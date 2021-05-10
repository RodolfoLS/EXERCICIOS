package candidatura.questao5;

public class QuestaoCinco {

	public static void main(String[] args) {
		
		Animais ani = new Animais();
		Aves ave = new Aves(null, null, null);
		Mamiferos mami = new Mamiferos();
		
		
		System.out.println(ani.dormir(null));
		System.out.println(ani.comer(null));
		System.out.println(mami.mamar(null));
		System.out.println(ave.voar(null));
	}
}
