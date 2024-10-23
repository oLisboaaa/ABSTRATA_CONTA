package main;
    // Classe para testar as contas

import classes.ContaCorrente;
import classes.ContaPoupanca;

public class NuBank {
    public static void main(String[] args) {
        // Criando uma Conta Corrente
        ContaCorrente contaCo = new ContaCorrente(1000, 500);
        contaCo.consultaSaldo();
        contaCo.saque(200);
        contaCo.deposito(300);

        // Criando uma Conta Poupança
        ContaPoupanca contaPo = new ContaPoupanca(500);
        contaPo.consultaSaldo();
        contaPo.saque(100);
        contaPo.deposito(150);
    }
}
