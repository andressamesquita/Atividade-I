package model;

public class Item {
	private String produto;
	private int quantidade;
	private Double valor;
	
	public Item(String p,int q, Double v){
		this.setProduto(p);
		this.setQuantidade(q);
		this.setValor(v);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
}
