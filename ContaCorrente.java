package ContasBancarias;
import java.util.*;

public class ContaCorrente {

	private float saldo;
	private int numeroConta;
	private int numeroAgencia;
	private float v;
	
	private ArrayList<String> transacoes = new ArrayList<String>();
	
	
	public ContaCorrente(int numeroConta, int numeroAgencia){
			
		this.saldo = 0.0f;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		
		Cliente cliente = new Cliente();
		Transaçao transacao = new Transaçao();
		
	}
	
	public boolean sacar(float v, float saldo) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor do saque: ");
        v = entrada.nextInt();
		
		if (saldo - v < 00.f) {
			return False;
		}else {
			Transacao t = new Transacao("saque", v, saldo);
			
		}
		
	}

	
	public void Depositar() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor do depósito: ");
        v = entrada.nextInt();
	}
}
