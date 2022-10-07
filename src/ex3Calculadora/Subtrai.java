package ex3Calculadora;

public class Subtrai extends Calculadora{
	@Override
	public double calcular (double a, double b) {
		System.out.println("Subclasse Subtrai com sobrescrita:");
		return a-b;
	}

}
