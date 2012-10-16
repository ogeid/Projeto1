package br.faccamp.domain;

public class OperacaoMaisOuMenos extends Operacao {

	public OperacaoMaisOuMenos(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String PrimeiroOperador) {
		Integer primeiro = new Integer(getPrimeiroOperador());
		return ((primeiro *(-1)) + "");
	}
}