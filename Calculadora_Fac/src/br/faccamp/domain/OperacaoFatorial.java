package br.faccamp.domain;

public class OperacaoFatorial extends Operacao {

	public OperacaoFatorial(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String PrimeiroOperador) {
		Integer primeiro = new Integer(getPrimeiroOperador());
		double fat = 1;
		for (int i = 2; i<= primeiro;i++){
		fat *= i;
	 }
		return (fat + "");
	}
}