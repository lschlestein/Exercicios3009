package ex3Calculadora;

public class Divide extends Calculadora{
	@Override
	public double calcular (double a, double b) {
		System.out.println("Subclasse Divide com sobrescrita:");
		return a/b;
	}

}
