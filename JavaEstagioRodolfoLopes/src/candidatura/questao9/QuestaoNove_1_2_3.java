package candidatura.questao9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class QuestaoNove_1_2_3 {

	public static void main(String[] args) {
		
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
		
		System.out.println("Lista das pessoas");
		for(int i = 0; i < listaPessoas.size(); i++) {
			System.out.println(listaPessoas.get(i).getId()+ " - " + listaPessoas.get(i).getNome()+ " - " + listaPessoas.get(i).getIdade());
		}
		
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("Lista por maior idade");
		for(int i = 0; i < listaPessoas.size(); i++) {
			Collections.sort(listaPessoas);
			System.out.println(listaPessoas.get(i).getId()+ " - " + listaPessoas.get(i).getNome()+ " - " + listaPessoas.get(i).getIdade());
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Removendo a pessoa de 27 anos");
		for(int i = 0; i < listaPessoas.size(); i++) {
			if(listaPessoas.get(i).getIdade()!= 27) {
				System.out.println(listaPessoas.get(i).getId()+ " - " + listaPessoas.get(i).getNome()+ " - " + listaPessoas.get(i).getIdade());
			}
			
		}
	
		Pessoa pe5 = new Pessoa(1, "Paulo", 8);
		Pessoa pe6 = new Pessoa(2, "Silas", 19);
		Pessoa pe7 = new Pessoa(3, "Paulo", 18);
		Pessoa pe8 = new Pessoa(4, "Pedro", 25);
		Pessoa pe9 = new Pessoa(5, "Paulo", 50);
		
		
		List<Pessoa> listasPessoas2 = new ArrayList();
		
		listasPessoas2.add(pe5);
		listasPessoas2.add(pe6);
		listasPessoas2.add(pe7);
		listasPessoas2.add(pe8);
		listasPessoas2.add(pe9);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Somente os nomes distintos.");
		for(int i = 0; i < listasPessoas2.size(); i++) {
			if(listasPessoas2.get(i).getNome()!= "Paulo") {
				System.out.println(listasPessoas2.get(i).getId()+ " - " + listasPessoas2.get(i).getNome()+ " - " + listasPessoas2.get(i).getIdade());
			}
			
		}

	}
		
	
	
	
	
}
