package br.faccamp.domain;

public class OperacaoRaiz extends Operacao {

	public OperacaoRaiz(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String PrimeiroOperador) {
		Integer primeiro = new Integer(getPrimeiroOperador());
		return ((Math.sqrt(primeiro)) + "");
	}
}