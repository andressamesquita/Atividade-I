package model;

public abstract class Desconto {
	
	protected Double valor;
	
	public Desconto(Double valor){
		this.valor = valor;
	}
	
	public abstract Double calculaDesconto();
	
}
