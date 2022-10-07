package ex1Mensagem;

import java.util.Scanner;

public class Principal extends Mensagem{
	

	public static void main(String[] args) {
		Principal p = new Principal();
		p.exibeMensagemA();
		p.exibeMensagemB();
	}
	
	public void exibeMensagemA() {
		System.out.println("Cuide bem dos animais");
		
	}
	
	public void exibeMensagemB() {
		Scanner leitura = new Scanner (System.in);
		String mensagem = "";
		System.out.println("Digite sua mensagem para conservação do planeta:");
		mensagem = leitura.nextLine();
		System.out.println("Mensagem: "+mensagem);
		leitura.close();
	}

}
