package helper;

import model.Compra;
import model.Desconto;
import usecasesDesconto.DescontoItensDaCompra;
import usecasesDesconto.DescontoPFRmilPontos;
import usecasesDesconto.DescontoSuperiorAmil;

public class Factory  {
	
	private Compra compra;
	private Double valorDesconto;
	
	public Factory(Compra c){
		this.compra = c;		
	}
	
	public String politicaDeDesconto(){
		
		if (compra.getValorCompra() > 1000){
			Desconto desconto = new DescontoSuperiorAmil(compra.getValorCompra());
			valorDesconto = desconto.calculaDesconto();
			return "Seu desconto eh de R$"+ valorDesconto+".";
		}
		
		if (compra.isFidelidadeDaRede() == true && compra.getPontos()>= 1000){
			Desconto desconto = new DescontoPFRmilPontos(compra.getValorCompra());
			valorDesconto = desconto.calculaDesconto();
			return "Seu desconto de cliente fiel eh R$ "+ valorDesconto+".";
		}
		
		if(compra.getItem().getQuantidade()>=20){
			Desconto desconto = new DescontoItensDaCompra(compra.getItem().getValor());
			valorDesconto = desconto.calculaDesconto();
			return "Seu item "+ compra.getItem().getProduto()+" teve desconto de R$"+valorDesconto+".";
		}
		return "Suas compras nao seguem nenhuma politica de desconto, portanto voce nao possui desconto.";
		
	}
	
}
