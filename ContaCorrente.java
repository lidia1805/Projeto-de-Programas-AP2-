package ContasBancarias;
import java.util.*;
import ContasBancarias.CaixaEletronico;

public class ContaCorrente {

	private float saldo;
	private int numeroConta;
	private int numeroAgencia;
	
	private ArrayList<Transacao> transacoes;
	
	
	public ContaCorrente(int numeroConta, int numeroAgencia) {
		
		this.saldo = 0.0f;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.transacoes = new ArrayList<Transacao>();

	}

	public float Depositar( float v) {
		Transacao transacaoA = new Transacao();
		transacaoA.setOperacao("Deposito");
		transacaoA.setV(v);
		transacaoA.setDataHora(new Date());
		transacaoA.setNovoSaldo(this.getSaldo());
		
		this.registrarTransacao(transacaoA);
		
		this.saldo = saldo + v;
		return this.saldo;
	}
	
	public void Sacar(float v) {
		
		
		if(v<this.saldo) {
			this.saldo = this.saldo - v;
			Transacao transacao3 = new Transacao();
			transacao3.setOperacao("Saque");
			transacao3.setV(v);
			transacao3.setDataHora(new Date());
			transacao3.setNovoSaldo(this.getSaldo());
			
			this.registrarTransacao(transacao3);

		} else {
			System.out.println();
			System.out.println("Valor requerido para saque: "+ v);
			System.out.println("Saldo insuficiente para saque!");
		}
		
	}
	
	public void ObterExtrato() {
		
		System.out.println("---------------------EXTRATO---------------------");
		for(int i =0; i< this.getExtrato().size(); i++) {
			System.out.println(this.getExtrato().get(i).getDataHora()+" - " + this.getExtrato().get(i).getOperacao()+ " - " +
			(String.format("%.02f", this.getExtrato().get(i).getV())));
		}
		System.out.println("Saldo:" + this.getSaldo());
	}
	
	public void registrarTransacao(Transacao e) {
		this.transacoes.add(e);
		
	}
	
	
	public ArrayList<Transacao> getExtrato() {
		return transacoes;
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
