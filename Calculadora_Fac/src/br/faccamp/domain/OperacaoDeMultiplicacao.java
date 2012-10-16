package br.faccamp.domain;

public class OperacaoDeMultiplicacao extends Operacao {

	public OperacaoDeMultiplicacao(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		Integer primeiro = new Integer(getPrimeiroOperador());
		Integer segundo = new Integer(segundoOperador);
		return (primeiro * segundo) + "";
	}

}