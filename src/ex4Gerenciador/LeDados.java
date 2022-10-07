package ex4Gerenciador;

import java.io.*;

public class LeDados {
	public static BufferedReader br;

	public void leituraArquivo(String nomeArquivo) {
		try {
			br = new BufferedReader(new FileReader(nomeArquivo + ".txt"));
			String linha = null;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			br.close();
		} catch (Exception e) {
		}
	}
}
