package ContasBancarias;

import java.util.Date;

public class Transacao {
	private String operacao;
	private float v;
	private Date dataHora;
	private float novoSaldo;
	
	public Transacao() {
		
	}
	
	public Transacao(float saldo, String deposito, float v) {
		
		
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public float getV() {
		return v;
	}

	public void setV(float v) {
		this.v = v;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public float getNovoSaldo() {
		return novoSaldo;
	}

	public void setNovoSaldo(float novoSaldo) {
		this.novoSaldo = novoSaldo;
	}
	
}
