package ContasBancarias;
import java.util.*;
import ContasBancarias.CaixaEletronico;

public class ContaCorrente {

	private float saldo;
	private int numeroConta;
	private int numeroAgencia;
	
	private ArrayList<Transacao> transacoes;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int numeroConta, int numeroAgencia) {
		
		this.saldo = 0.0f;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.transacoes = new ArrayList<Transacao>();

	}

	public float Depositar(float v) {
		this.saldo = saldo + v;
		return this.saldo;
	}
	
	public boolean Sacar(float v) {
		if(v<this.saldo) {
			this.saldo = this.saldo - v;
	
			return true;
		} else {
			return false;
		}
		
	}
	
	public void registrarTransacao(Transacao e) {
		this.transacoes.add(e);
		
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	 
}
