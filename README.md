# Sistema de Contas Bancárias Abstrata

Este projeto é uma implementação em Java de um sistema para gerenciar diferentes tipos de contas bancárias, incluindo **Conta Corrente** e **Conta Poupança**. Ele permite realizar operações como saque, depósito e consulta de saldo, com diferentes regras e taxas específicas para cada tipo de conta.

## 🚀 Começando

Crie a classe abstrata ContaBancaria que possui os métodos abstratos, saque, depósito e consulta.

A partir dela derivam as classes concretas ContaCorrente e ContaPoupança.

A ContaPoupança não permite saques maiores que o saldo. Já a ContaCorrente possui um limite após o saldo se esgotar.

As duas contas possuem diferentes taxas para saque, depósito e consulta.

### 📋 Pré-requisitos

Para executar este projeto, você precisará do seguinte:

* JDK (Java Development Kit) instalado na versão 8 ou superior.
* IDE IntelliJ IDEA, Eclipse, ou outra IDE de sua escolha.

```
Baixe e instale o JDK do site oficial da Oracle ou use uma distribuição como OpenJDK. Baixe e instale sua IDE preferida pelo site oficial.
```

### 🔧 Instalação

* Clone este repositório para sua máquina local:

```
git clone https://github.com/oLisboaaa/ABSTRATA_CONTA
```
* Abra o projeto na sua IDE.
* Compile e execute a classe `NuBank` para testar as operações de saque, depósito e consulta de saldo.
  
## 🛠️ Construído com

* Java - Linguagem de programação utilizada
* IDE Visual Studio Code - Ambiente de desenvolvimento integrado
* IDE Online GDB for Java - Ambiente de desenvolvimento integrado

## ✒️ Autores

* **Marcelo Lisboa** - *Trabalho Inicial* - Sistema de Contas Bancárias Abstrata