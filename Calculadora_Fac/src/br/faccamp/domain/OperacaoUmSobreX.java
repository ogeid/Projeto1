package br.faccamp.domain;

public class OperacaoUmSobreX extends Operacao {

	public OperacaoUmSobreX(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String PrimeiroOperador) {
		Double primeiro = new Double(getPrimeiroOperador());
		return ((1/primeiro) + "");
	}
}