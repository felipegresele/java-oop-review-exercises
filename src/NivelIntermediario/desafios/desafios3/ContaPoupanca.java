package NivelIntermediario.desafios.desafios3;

import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        this(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void depositar(double valor, int valorTaxaDeposito) {
        System.out.println("Seu deposito é de R$" + valor);
        double saldoAtual = (valor += saldo) - valorTaxaDeposito;
        System.out.println("Seu saldo atual agora na Conta Poupança agora é R$" + saldoAtual + " ,Taxa de R$" + valorTaxaDeposito);
    }

}
