package br.eu.up.model;

public class Pqp {
	
	public int Quantidade;
	
	public void setQuantidade(int Quantidade) throws Exception {
		if (Quantidade < 0 || Quantidade > 4) {
			throw new Exception();
		}
		this.Quantidade = Quantidade;
	}	

}
