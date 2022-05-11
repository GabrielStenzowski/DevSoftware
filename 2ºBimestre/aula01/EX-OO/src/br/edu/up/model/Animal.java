package br.edu.up.model;

public class Animal {
	
	public String nome;
	private int idade;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) throws Exception {
		if (idade < 0 || idade > 150) {
			throw new Exception();
		}
		this.idade = idade;
	}	

}
