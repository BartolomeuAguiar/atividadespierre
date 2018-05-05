
public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Hugo";
		c1.numero = 123;
		c1.agencia = "45678-9";
		Data datac1 = new Data();
		c1.dataDeAbertura = datac1;
		c1.dataDeAbertura.dia = 01;
		c1.dataDeAbertura.mes = 04;
		c1.dataDeAbertura.ano = 2017;
		/*
		 ** Conta.saldo=123; ao tentar referenciar um atributo diretamente da classe o
		 * compilador retorna um erro de que não é possivel referenciar um objeto não
		 ** estatico para um estatico.
		 */
		Conta c2 = new Conta();
		c2.titular = "Danilo";
		c2.saldo = 100;

		Conta c3 = new Conta();
		c3 = c2;
		// nesse caso os objetos são dados como iguais.

		c1.deposita(100);
		System.out.println("Saldo Atual R$ " + c1.saldo);
		System.out.println("Rendimento mensal R$ " + c1.calculaRendimento());
		System.out.println(c1.recuperandoDadosParaImpressao());
		c1.dataDeAbertura.formatada();

		if (c2 == c3) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

	}// fim do metodo maim

}// fim da classe
