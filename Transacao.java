package ContasBancarias;

public class Transacao {
	private String operacao;
	private float valor;
	private String dataHora;
	
	public Transacao(String operacao, float valor, String dataHora) {
		this.operacao = operacao;
		this.valor = valor;
		this.dataHora = dataHora;
	}

}
