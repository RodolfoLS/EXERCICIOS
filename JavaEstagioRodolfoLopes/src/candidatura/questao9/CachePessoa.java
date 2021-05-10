package candidatura.questao9;

import java.util.ArrayList;
import java.util.List;

public class CachePessoa {

	public static void retornaPessoa(int id) {
		
		Pessoa pe = new Pessoa(1, "João", 10);
		Pessoa pe1 = new Pessoa(2, "Alice", 5);
		Pessoa pe2 = new Pessoa(3, "Fernando", 27);
		Pessoa pe3 = new Pessoa(4, "Carlos", 12);
		Pessoa pe4 = new Pessoa(5, "Priscila", 31);
		
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		listaPessoas.add(pe);
		listaPessoas.add(pe1);
		listaPessoas.add(pe2);
		listaPessoas.add(pe3);
		listaPessoas.add(pe4);
		
		System.out.println("Pesquisando nome por ID");
		for(int i = 0; i < listaPessoas.size(); i++) {
			if(listaPessoas.get(i).getId() == 1) {
				System.out.println(listaPessoas.get(i).getId()+ " - " + listaPessoas.get(i).getNome()+ " - " + listaPessoas.get(i).getIdade());
			}
			
		}
		
	}	
		public static void main(String[] args) {
			
			retornaPessoa(0);
			
		}
		
		
				
	
}
