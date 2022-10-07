package ex3Calculadora;

import java.util.Scanner;

public class Principal extends Calculadora {

	public static void main(String[] args) {
		double x[] = new double[2];

		Principal p = new Principal();
		
		System.out.println("Insira os operandos:");
		x = p.leDouble();

		System.out.println(p.calcular(x[0], x[1])); // chamada do método calcular() da classe pai (superclasse)
		

		Divide div = new Divide();
		System.out.println(div.calcular(x[0], x[1])); // chamada do método calcular() da classe filha Divide, onde foi
														// feita a
		// sobrescrita do método calcular.

		Multiplica mult = new Multiplica();
		System.out.println(mult.calcular(x[0], x[1]));

		Subtrai sub = new Subtrai();
		System.out.println(sub.calcular(x[0], x[1]));

	}

	public double[] leDouble() {
		double x[] = new double[2];
		Scanner leitura = new Scanner(System.in);
		try {
			do {
				do {
					System.out.println("Digite o 1 número");
					x[0] = leitura.nextDouble();
				} while (x[0] == 0);
				do {
					System.out.println("Digite o 2 número");
					x[1] = leitura.nextDouble();
				} while (x[1] == 0);
			} while (x[0] == 0 && x[1] == 0);
			leitura.close();
		} catch (Exception e) {
			// leitura.next();
			System.out.println("Erro: Digite um double");
			leitura.close();
			x[0] = 0;
			x[1] = 0;
			return x;
		}
		return x;
	}
}
