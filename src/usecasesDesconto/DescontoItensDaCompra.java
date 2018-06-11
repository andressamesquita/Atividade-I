package usecasesDesconto;

import model.Desconto;

public class DescontoItensDaCompra implements Desconto {
	
	public Double calculaDesconto(Double valorDacompra) {
		return valorDacompra*0.1;
	}

}
