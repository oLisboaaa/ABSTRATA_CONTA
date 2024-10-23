package classes;

// Classe concreta ContaCorrente
public class ContaCorrente extends ContaBancaria {
    private double limite;
    private static final double taxaSaque = 2.00;
    private static final double taxaDep = 1.00;
    private static final double taxaCons = 0.50;

    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    @Override
    public void saque(double valor) {
        double totalSaque = valor + taxaSaque;
        if (saldo + limite >= totalSaque) {
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
