package br.com.caelum.contas.modelo;

public class Cliente {
	public String nome;
	public String endereço;
	public String cpf;
	public int idade;

	public void mudarCPF(String cpf) {
		validaCPF(cpf);
		this.cpf = cpf;
	}
	
	private void validaCPF(String cpf) {
		
	}
}
