package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

public class TestaArray {
	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new Conta();
			conta.deposita(i * 100);
			contas[i] = conta;
		}
		
		for(int i = 0; i< contas.length; i++) {
			System.out.println("Saldo da conta " + i + ": R$ " + contas[i].getSaldo());
		}
		
		double total = 0;
		for(Conta conta : contas) {
			
			total += conta.getSaldo();
		}
		System.out.println("A média de saldo das contas é R$ " + total/contas.length);
	}

}
