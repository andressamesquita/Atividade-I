package usecasesDesconto;

import model.Desconto;

public class DescontoSuperiorAmil implements Desconto {

	@Override
	public Double calculaDesconto(Double valorDacompra) {
		return valorDacompra*0.1;
	}
	
	

}
