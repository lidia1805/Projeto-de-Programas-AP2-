package ContasBancarias;

import java.util.Scanner;
import java.util.Date;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Lucas Silva");
		cliente1.setRg("14657-9");
		cliente1.setEndereco("Rua 02, bairro Flores");
		
		
		ContaCorrente conta = new ContaCorrente(22459, 5678);
		
		System.out.println();
		System.out.println("Nome:" + cliente1.getNome());
		System.out.println("RG:"+ cliente1.getRg());
		System.out.println("Endereço:"+ cliente1.getEndereco());
		System.out.println("Conta:" + conta.getNumeroConta());
		System.out.println("Agencia:" + conta.getNumeroAgencia());
		
		
		conta.Depositar(340.90f);
		conta.Depositar(112.10f);
		
		
		conta.Sacar(200.00f);
		conta.Depositar(100.00f);
		conta.Depositar(112.00f);
		
		System.out.println();
		conta.ObterExtrato();
		
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Maria Nascimento Cavalcante");
		cliente2.setRg("78452-6");
		cliente2.setEndereco("Bairro da União");
		
		
		ContaCorrente conta2 = new ContaCorrente(96578, 2279);
		
		System.out.println();
		System.out.println();
		System.out.println("Nome:" + cliente2.getNome());
		System.out.println("RG:"+ cliente2.getRg());
		System.out.println("Endereço:"+ cliente2.getEndereco());
		System.out.println("Conta:" + conta2.getNumeroConta());
		System.out.println("Agencia:" + conta2.getNumeroAgencia());
		
		conta2.Depositar(300.00f);
		conta2.Depositar(50.00f);
		
		
		conta2.Sacar(500.00f);
			
		System.out.println();
		conta2.ObterExtrato();;
		
		
	}

	
}


