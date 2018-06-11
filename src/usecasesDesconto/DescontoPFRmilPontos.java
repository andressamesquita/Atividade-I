package usecasesDesconto;

import model.Desconto;

public class DescontoPFRmilPontos implements Desconto {

	@Override
	public Double calculaDesconto(Double valorDacompra) {
		return valorDacompra*0.05;
	}
	

}
