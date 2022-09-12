package ContasBancarias;

import java.util.Scanner;
import java.util.Date;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Lucas Silva");
		cliente1.setRg("14657-9");
		cliente1.setEndereco("Rua 02, bairro Flores");
		
		
		ContaCorrente conta = new ContaCorrente();
		conta.Depositar(340.90f);
		conta.setNumeroConta(22367);
		conta.setNumeroAgencia(9987);
		
		Transacao transacaoA = new Transacao();
		transacaoA.setOperacao("Deposito");
		transacaoA.setV(200.00f);
		transacaoA.setDataHora(new Date());
		transacaoA.setNovoSaldo(conta.getSaldo());
		
		conta.registrarTransacao(transacaoA);
		
		if(conta.Sacar(200.00f)) {
			
			Transacao transacaoB = new Transacao();
			transacaoB.setOperacao("Saque");
			transacaoB.setV(200.00f);
			transacaoB.setDataHora(new Date());
			transacaoB.setNovoSaldo(conta.getSaldo());
			
			conta.registrarTransacao(transacaoB);
		} else {
			
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println("Conta:" + conta.getNumeroConta());
		System.out.println("Agencia:" + conta.getNumeroAgencia());
		System.out.println("Saldo:" + conta.getSaldo());
		
	}
}
