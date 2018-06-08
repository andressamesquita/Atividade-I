package usecasesDesconto;

import model.Desconto;

public class DescontoItensDaCompra extends Desconto {

	public DescontoItensDaCompra(Double valor) {
		super(valor);
	}

	@Override
	public Double calculaDesconto() {
		return valor*0.1;
	}

}
