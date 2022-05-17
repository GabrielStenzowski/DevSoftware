package br.eu.up.model;

public class Pedal {

	public int NumeroDePedais;



	public void setNumeroDePedais(int NumeroDePedais) throws Exception {
		if (NumeroDePedais < 1 || NumeroDePedais > 4) {
			throw new Exception();
		}
		this.NumeroDePedais = NumeroDePedais;
	}
}	