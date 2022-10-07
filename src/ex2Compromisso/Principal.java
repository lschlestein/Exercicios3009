package ex2Compromisso;
/*
 * 2) Crie uma classe Compromisso que possui os atributos nome (do compromisso), data e hora. A classe Compromisso 
 * é herdada pelas classes Profissional e Pessoal que possuem uma interface de acesso. 
Além disso, a classe Profissional possui o método exibeCompromissoProfissional() e a classe Pessoal possui o método 
exibeCompromissoPessoal(). 
Ambos os métodos deverão ser implementados em uma classe Principal, que também fará a leitura dos valores dos 
atributos e as suas respectivas impressões na tela.
 * */

public class Principal {
	
	public static void main(String args[]) {
		Pessoal compromissoPessoal = new Pessoal("Dentista","05-10-22","15:00");
		Profissional compromissoProfissional = new Profissional("Academia Java","05-10-22","19:00");
		
		compromissoPessoal.exibeCompromissoPessoal();
		compromissoProfissional.exibeCompromissoProfissional();
	}

}
