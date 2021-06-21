/*
Realizar o cadastro de uma conta, dando a opção para que seja ou não informado ou não
o valor inicial de deposito. Em seguida, realizar um deposito e um saque, sempre informando
os dados da conta após cada operação. 
 */
package Aplicacoes;

import Entidades.Banco;
import java.util.Locale;
import java.util.Scanner;

public class MainBanco {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Banco contaBancaria;

        System.out.print("Entre com o numero da conta: ");
        int numConta = scn.nextInt();
        System.out.print("Entre com o nome do titular: ");
        scn.nextLine();
        String nomeTitular = scn.nextLine();
        System.out.print("Possui deposito inicial (S/N) ? ");
        char resposta = scn.next().charAt(0);

        if (resposta == 'S') {
            System.out.print("Entre com o valor de deposito inicial: ");
            double depositoInicial = scn.nextDouble();
            contaBancaria = new Banco(numConta, nomeTitular, depositoInicial);
        } else {
            contaBancaria = new Banco(numConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Dados da conta ");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.print("Entre com valor para desposito: ");
        double novoDeposito = scn.nextDouble();
        contaBancaria.deposito(novoDeposito);
        System.out.println("Dados da conta atualizados");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.print("Entre com valor para saque: ");
        double saque = scn.nextDouble();
        contaBancaria.saque(saque);
        System.out.println("Dados da conta atualizados");
        System.out.println(contaBancaria);

    }

}
