
public class Data {

	int dia;
	int mes;
	int ano;

	public String formatada() {
		String dataFormatada = "";
		String d = Integer.toString(this.dia);
		dataFormatada += d + "/";
		String m = Integer.toString(this.mes);
		dataFormatada += m + "/";
		String a = Integer.toString(this.ano);
		dataFormatada += a;

		return dataFormatada;

	}

}// fim da classe
