package model;

import java.util.List;

public class Compra {
	
	private Double valorCompra;
	private List<Item> ListaDeCompras;
	private int pontos;
	private boolean fidelidadeDaRede;
	private Item item;
	
	public Compra(Item item, Double vc, int p, boolean fdr){
		
		this.setValorCompra(vc);
		this.setPontos(p);
		this.setFidelidadeDaRede(fdr);
		this.setItem(item);
	}

	public List<Item> getListaDeCompras() {
		return ListaDeCompras;
	}

	public void setListaDeCompras(Item item) {
		this.ListaDeCompras.add(item);
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public boolean isFidelidadeDaRede() {
		return fidelidadeDaRede;
	}

	public void setFidelidadeDaRede(boolean fidelidadeDaRede) {
		this.fidelidadeDaRede = fidelidadeDaRede;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	
}
