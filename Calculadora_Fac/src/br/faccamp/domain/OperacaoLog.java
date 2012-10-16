package br.faccamp.domain;

public class OperacaoLog extends Operacao {

	public OperacaoLog(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String PrimeiroOperador) {
		Integer primeiro = new Integer(getPrimeiroOperador());
		return ((Math.log(primeiro)) + "");
	}
}