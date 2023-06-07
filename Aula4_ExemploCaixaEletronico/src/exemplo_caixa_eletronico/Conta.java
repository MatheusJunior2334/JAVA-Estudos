package exemplo_caixa_eletronico;

import java.util.Random;
import java.util.Scanner;

public class Conta {
    int numero_conta;
    String titular_conta;
    double saldo;

    Scanner entrada = new Scanner(System.in);

    public Conta(String nome_titular, double saldo_inicial) {
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;

        Random gerador_numero = new Random();
        numero_conta = gerador_numero.nextInt(1000); //Gerador de numeros aleatorios com o 1000 de numero limite
    }

    public void VerSaldo() {
        System.out.println("O numero da conta e: " + numero_conta);
        System.out.println("O titular da conta e: " + titular_conta);
        System.out.println("O saldo da conta e: " + saldo);
    }

    public void Saque(double valor_saque) {
        if (valor_saque <= saldo) {
            saldo = saldo - valor_saque;
            System.out.println("O saldo atual e de: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void Deposito(double valor_deposito) {
        if (valor_deposito <= 0) {
            System.out.println("Deposito invalido");
        } else {
            saldo += valor_deposito; // saldo = saldo + valor_deposito
            System.out.println("O valor depositado foi de: " + valor_deposito + ", agora o seu saldo atual e de: " + saldo);
        }
    }

    public void Iniciar() {
        int opcao;
        do {
            Exibir_menu();
            opcao = entrada.nextInt();
            Escolher_funcao(opcao);
        } while (opcao != 4);
    }

    public void Exibir_menu() {
        System.out.println("Seja bem vindo(a) a h-bank");
        System.out.println("Escolha a opcao desejada");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Finalizar");
    }

    public void Escolher_funcao(int opcao) {
        double saque;
        double deposito;

        switch (opcao) {
            case 1: 
                VerSaldo();
                break;

            case 2: 
                System.out.println("Digite o valor a ser sacado: ");
                saque = entrada.nextDouble();
                Saque(saque);
                break;

            case 3:
                System.out.println("Digite o valor a ser depositado: ");
                deposito = entrada.nextDouble();
                Deposito(deposito);
                break;

            case 4:
                System.out.println("Operacao finalizada");
                break;

            default:
                System.out.println("Opcao invalida, digite 1, 2, 3 ou 4");   
        }
    }
}
