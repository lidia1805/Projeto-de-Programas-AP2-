package ContasBancarias;
import java.util.*;

public class ContaCorrente {

	private float saldo;
	private int numeroConta;
	private int numeroAgencia;
	float v;
	float valor;
	
	private ArrayList<String> transacoes = new ArrayList<String>();
	
	public ContaCorrente(int numeroConta, int numeroAgencia) {
		
		saldo = 0.0f;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;

	}

	public float Depositar(float v) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor do depósito: ");
		v = entrada.nextInt();
		
		saldo = saldo + v;
		
		Transacao t = new Transacao(saldo, "deposito", v);
		RegistrarTransacao(t);
		
		return saldo;
	}
	
	public boolean Sacar(float valor) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor para saque: ");
		valor = entrada.nextInt();
		
		if(valor<saldo) {
			saldo = saldo - valor;
			Transacao t = new Transacao(saldo, "saque", v);
			RegistrarTransacao(t);
			return true;
		} else {
			return false;
		}
		
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
