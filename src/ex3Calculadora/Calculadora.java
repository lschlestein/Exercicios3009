package ex3Calculadora;
/*
 * 1)Crie uma classe chamada Calculadora para realizar as 4 operações aritméticas entre 2 números. Faça a sobrescrita 
 * de métodos de acordo com o tipo de operação. Uma classe principal deverá solicitar ao usuário os números a serem 
 * calculados e exibir o resultado das operações.
 */

public class Calculadora {

	public double calcular(double a, double b) {
		System.out.println("Superclasse Soma:");
		return a + b;
	}

}
