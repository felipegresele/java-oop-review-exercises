package NivelIntermediario.desafios.desafios3;

import java.util.Scanner;

public class ContaBancaria implements Conta{

    double saldo;
    TipoConta tipoConta;

    public ContaBancaria() {

    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu valor é de R$" + saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Seu deposito é de R$" + valor);
        double saldoAtual = valor += saldo;
        System.out.println("Seu saldo atual agora é R$" + saldoAtual);
    }

    @Override
    public void depositar(double valor, int valorTaxaDeposito) {
    }


}
