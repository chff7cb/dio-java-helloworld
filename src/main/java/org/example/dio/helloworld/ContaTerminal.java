package org.example.dio.helloworld;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String codigoAgencia = stdin.next();

        System.out.println("Agora digite o número da conta:");
        int numeroConta = stdin.nextInt();

        System.out.println("Informe seu nome:");
        stdin.nextLine();
        String nomeCliente = stdin.nextLine();

        System.out.println("Por fim, informe o saldo da conta:");
        double saldoConta = stdin.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n",
                nomeCliente, codigoAgencia, numeroConta, saldoConta);
    }
}
