package ContasBancarias;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Transacao transacao = new Transacao();
		ContaCorrente conta = new ContaCorrente(int numeroConta, int numeroAgencia);
		float v;
		
		int op;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("1.Depositar");
			System.out.println("2.Sacar");
			System.out.println("3.Obter extrato");
			System.out.println("4.Sair");
			op = entrada.nextInt();
			
		}while(op!=4);
		
		if(op == 1) {
			conta.Depositar(v);
		}
	}
}
