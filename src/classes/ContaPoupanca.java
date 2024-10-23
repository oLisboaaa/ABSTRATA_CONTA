package classes;

// Classe ContaPoupanca
public class ContaPoupanca extends ContaBancaria {
    private static final double taxaSaque = 1.50;
    private static final double taxaDep = 0.50;
    private static final double taxaCons = 0.25;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void saque(double valor) {
        double totalSaque = valor + taxaSaque;
        if (saldo >= totalSaque) {
            saldo -= totalSaque;
            System.out.println("Saque de R$" + valor + " realizado com sucesso! Taxa: R$" + taxaSaque);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    @Override
    public void deposito(double valor) {
        saldo += valor - taxaDep;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso! Taxa: R$" + taxaDep);
    }

    @Override
    public void consultaSaldo() {
        saldo -= taxaCons;
        System.out.println("Saldo atual: R$" + saldo + ". Taxa de consulta: R$" + taxaCons);
    }
}
