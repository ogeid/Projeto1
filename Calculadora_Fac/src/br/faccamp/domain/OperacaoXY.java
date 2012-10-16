package br.faccamp.domain;
 
public class OperacaoXY extends Operacao {
 
    public OperacaoXY(String primeiroOperador) {
        super(primeiroOperador);
    }
 
    @Override
    public String calcula(String segundoOperador) {
        Double primeiro = new Double(getPrimeiroOperador());
        Double segundo = new Double(segundoOperador);
        return (Math.pow(primeiro,segundo))+"";
    }
 
   
}