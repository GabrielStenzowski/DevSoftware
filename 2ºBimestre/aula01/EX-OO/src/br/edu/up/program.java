package br.edu.up;

import br.edu.up.model.Cachorro;
import br.edu.up.model.Gato;
import br.edu.up.model.Homem;
import br.edu.up.model.Humano;
import br.edu.up.model.Mulher;

public class program {

	public static void main(String[] args) throws Exception {
		
 
		
		Cachorro dog1 = new Cachorro();
		dog1.nome = "Theobaldo";
		dog1.raca = "Bulldog";
		dog1.porte = "Medio";
		dog1.setIdade(4);
		
		
		
		Cachorro dog2 = new Cachorro();
		dog2.nome = "Rex";
		dog2.raca = "Corgi";
		dog2.porte = "Pequeno";
		dog2.setIdade(1);		
		

		
		Cachorro dog3 = new Cachorro();
		dog3.nome = "Mafalda";
		dog3.raca = "Golden";
		dog3.porte = "Grande";
		dog3.setIdade(3);
		

		
		Gato cat = new Gato();
		cat.setIdade(2);
		cat.nome = "Salve";
		
		Homem men = new Homem();
		men.setIdade(25);
		men.nome = "EU";
		
		Humano human = new Humano();
		human.setIdade(5);
		human.name = "Eduardo";
		
		Mulher woman = new Mulher();
		woman.setIdade(21);
		woman.name = "Bruna";

	}

}
