package ex4Gerenciador;

import java.io.*;

public class GravaDados {

	public static BufferedWriter bw;

	public static void gerenciaArquivo(String nomeArquivo, String dado) {
		try {
			bw = new BufferedWriter(new FileWriter(nomeArquivo + ".txt"));
			bw.write(dado);
			bw.close();
			System.out.println("Cadastro de " + nomeArquivo + " realizado com sucesso!");
		} catch (Exception e) {
		}
	}
}