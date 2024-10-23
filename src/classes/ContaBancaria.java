package classes;

// Classe abstrata ContaBancaria
public abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Métodos abstratos
    public abstract void saque(double valor);
    public abstract void deposito(double valor);
    public abstract void consultaSaldo();
}
