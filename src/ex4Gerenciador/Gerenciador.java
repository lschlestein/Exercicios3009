package ex4Gerenciador;

/* 1) Crie uma classe para armazenar os atributos nome e
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

import java.io.*;

public class Gerenciador extends GravaDados {
	public static String nome = "", email = "";

	public static void gerenciaArquivo(String nome, String email) {
		try {
			bw = new BufferedWriter(new FileWriter(nome + ".txt"));
			bw.write(nome + " " + " Email: " + email);
			bw.close();
			System.out.println("Cadastro de " + nome + " realizado com sucesso!");
		} catch (Exception e) {
		}
	}

	public static void gerenciaArquivo(String nome) {
		try {
			bw = new BufferedWriter(new FileWriter(nome + ".txt"));
			bw.write(nome);
			bw.close();
			System.out.println("Cadastro de " + nome + " realizado com sucesso!");
		} catch (Exception e) {
		}
	}
}