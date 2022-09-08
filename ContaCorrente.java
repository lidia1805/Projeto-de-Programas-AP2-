package ContasBancarias;
import java.util.*;

public class ContaCorrente {

	private float saldo;
	private int numeroConta;
	private int numeroAgencia;
	private float v;
	
	private ArrayList<String> transacoes = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Transaçao transacao = new Transaçao();

	}
	
	public void Depositar() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor do depósito: ");
        v = entrada.nextInt();
	}
}
