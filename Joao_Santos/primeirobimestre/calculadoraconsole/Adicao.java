package calculadora;

public class Adicao implements OperacaoMatematica{
	 
	public void calculo() {
		
		Numeros.setResultado(Numeros.getValor1() + Numeros.getValor2());
		System.out.println(Numeros.getValor1() + " + " + Numeros.getValor2() + " = " + Numeros.getResultado());
	}
}
