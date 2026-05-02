package NivelIntermediario.desafios.desafios3;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        this(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Seu deposito é de R$" + valor);
        double saldoAtual = valor += saldo;
        System.out.println("Seu saldo atual na Conta Corrente agora é R$" + saldoAtual);
    }

}
