package usecasesDesconto;

import model.Desconto;

public class DescontoPFRmilPontos extends Desconto {

	public DescontoPFRmilPontos(Double valor) {
		super(valor);
	}

	@Override
	public Double calculaDesconto() {
		return valor*0.05;
	}
	

}
