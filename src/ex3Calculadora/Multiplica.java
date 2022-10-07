package ex3Calculadora;

public class Multiplica extends Calculadora{
	@Override
	public double calcular (double a, double b) {
		System.out.println("Subclasse Multiplica com sobrescrita:");
		return a*b;
	}

}
