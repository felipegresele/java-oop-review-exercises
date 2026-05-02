package NivelIntermediario.desafios.desafios3;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(500);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(80);

        ContaPoupanca contaPoupanca = new ContaPoupanca(1000);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(500, 1);

        //Desafio Bônus
        ContaCorrente corrente = new ContaCorrente(2500, TipoConta.CORRENTE);
        corrente.consultarSaldo();
        corrente.depositar(500);
        corrente.depositar(80);

        ContaPoupanca poupanca = new ContaPoupanca(2500, TipoConta.POUPANCA);
        poupanca.consultarSaldo();
        poupanca.depositar(2000,2);
    }

}
