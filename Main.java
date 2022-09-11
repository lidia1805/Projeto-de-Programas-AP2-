package ContasBancarias;

import java.util.Scanner;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
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
		
		
	}
}
