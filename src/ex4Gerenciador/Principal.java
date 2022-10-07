package ex4Gerenciador;

/**1) Crie uma classe para armazenar os atributos nome e
email do usuário em um arquivo texto, em que o nome do
arquivo é o mesmo nome do usuário que foi digitado. Essa
classe deverá permitir a sobrecarga de métodos, em que o
usuário poderá gravar o nome e o email no arquivo, ou
somente o nome. Crie uma classe Principal para realizar a
leitura dos atributos. Se ambos os atributos forem
preenchidos a sobrecarga deverá ser uma. Se apenas o
nome do usuário for preenchido, então a sobrecarga deverá
ser outra. Além disso, ofereça ao usuário a opção de ler o
conteúdo do arquivo de acordo com um nome por ele
informado. */

import java.util.Scanner;

public class Principal extends Gerenciador {
	public static void main(String Args[]) {
		var leitura = new Scanner(System.in);
		System.out.println("Insira o nome");
		nome = leitura.nextLine();
		System.out.println("Insira o email");
		email = leitura.nextLine();
		if (nome != "" && email != "") {
			gerenciaArquivo(nome, email);
		}
		if (nome != "" && email == "") {
			gerenciaArquivo(nome);
		}
		System.out.println("Deseja ver os dados gravados?(S ou N)");
		String opcao = leitura.nextLine();
		leitura.close();
		if (opcao.equals("S") || opcao.equals("s"))
			ler();
	}

	public static void ler() {
		LeDados ler = new LeDados();
		ler.leituraArquivo(nome);
	}
}