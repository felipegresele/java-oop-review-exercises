package NivelIntermediario.desafios.desafios3;

public interface Conta {

    void consultarSaldo();

    void depositar(double valor);

    //TODO: sobrecarga de metodo para novo parametro de taxa de deposito
    void depositar(double valor, int taxa);

    //void sacar(double valor);
}
