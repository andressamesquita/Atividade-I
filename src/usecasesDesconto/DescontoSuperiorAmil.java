package usecasesDesconto;

import model.Desconto;

public class DescontoSuperiorAmil extends Desconto {

	public DescontoSuperiorAmil(Double valor) {
		super(valor);
	}

	@Override
	public Double calculaDesconto() {
		return valor*0.1;
	}
	
	

}
