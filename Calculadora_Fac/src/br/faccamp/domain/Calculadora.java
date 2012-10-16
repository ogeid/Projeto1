package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Calculadora  {
	
	private CalculadoraGUI gui;
	private Display display;
	private Operacao operacao;

	String memory;
	
	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);
	}

	public void processaMC() {
		memory = "";
		display.limpa();
		display.atualiza("");
	}

	public void processaMR() {
		display.atualiza(memory);
		
	}

	public void processaMS() {
		memory = (display.getConteudo());
		
	}

	public void processaMMais() {
		//memory = ((memory + display.getConteudo()) + memory "");
		display.atualiza(memory);
		
	}

	public void processaMMenos() {
		//memory = ((memory -- display.getConteudo()) + "");
	}

	public void processaCE() {
		display.limpa();
		
	}

	public void processaC() {
		display.limpa();
		
	}

	public void processaRaiz() {
		operacao = new OperacaoRaiz(display.getConteudo());
		display.limpa();
		processaIgual();
		
	}

	public void processaMaisOuMenos() {
		operacao = new OperacaoMaisOuMenos(display.getConteudo());
		display.limpa();
		processaIgual();
		
	}

	public void processaFatorial() {
		operacao = new OperacaoFatorial(display.getConteudo());
		display.limpa();
		processaIgual();
	}

	public void processaSete() {
		display.atualiza("7");
		
	}

	public void processaOito() {
		display.atualiza("8");
		
	}

	public void processaNove() {
		display.atualiza("9");
		
	}

	public void processaDivisao() {
		operacao = new OperacaoDeDivisao(display.getConteudo());
		display.limpa();	
	}

	public void processaPorcentual() {
		operacao = new OperacaoDePercentual(display.getConteudo());
		display.limpa();
		processaIgual();
	}

	public void processaQuatro() {
		display.atualiza("4");
		
	}

	public void processaCinco() {	
		display.atualiza("5");	
	}

	public void processaSeis() {	
		display.atualiza("6");	
	}

	public void processaVezes() {
		operacao = new OperacaoDeMultiplicacao(display.getConteudo());
		display.limpa();
	}

	public void processaUmSobreX() {
		operacao = new OperacaoUmSobreX(display.getConteudo());
		display.limpa();
		processaIgual();
	}

	public void processaUm() {
		display.atualiza("1");
		
	}

	public void processaDois() {
		display.atualiza("2");
		
	}

	public void processaTres() {
		display.atualiza("3");
		
	}

	public void processaMenos() {
		operacao = new OperacaoDeSubtracao(display.getConteudo());
		display.limpa();
	}

	public void processaXElevadoY() {
		operacao = new OperacaoXY(display.getConteudo());
		display.limpa();
	}

	public void processaZero() {
		display.atualiza("0");
	}

	public void processaVirgula() {
		display.atualiza(".");
	}

	public void processaIgual() {
		String conteudo = display.getConteudo();
		display.limpa();
		display.atualiza(operacao.calcula(conteudo));
	}

	public void processaLog() {
		operacao = new OperacaoLog(display.getConteudo());
		display.limpa();
		processaIgual();
	}

	public void processaMais() {
		operacao = new OperacaoDeSoma(display.getConteudo());
		display.limpa();
	}

}
