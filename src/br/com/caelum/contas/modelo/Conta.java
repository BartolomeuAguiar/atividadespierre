package br.com.caelum.contas.modelo;

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;

	public double getSaldo() {
		return saldo;
	}

	public void saca(float valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}
	}// fim met.saca

	public void deposita(float valor) {
		this.saldo += valor;
	}// fim met.deposita

	public double calculaRendimento() {

		return this.saldo * 0.1;
	}// fim calcula rendimentos

	public String recuperandoDadosParaImpressao() {
		String dados ="**********************";
		dados += "\nTitular: " + this.titular;
		dados += "\nNumero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo R$ " + this.saldo;
		dados += "\n**************************";
		/*
		 * dados += "\nDia: " + this.dataDeAbertura.dia; dados += "\nMês: "+
		 * this.dataDeAbertura.mes; dados += "\nAno: "+ this.dataDeAbertura.ano;
		 */
		dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
		return dados;
	}// fim do recuperardadosparaimpressao

}// fim da classe
