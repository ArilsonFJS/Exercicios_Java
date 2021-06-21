/*
 Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
 */
package Aplicacoes;

import Entidades.Hotel;
import java.util.Scanner;

public class MainHotel {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Hotel[] vetor = new Hotel[10];

        System.out.print("Informe a quantidade de quartos: ");
        int quantidade = scn.nextInt();
        System.out.println();

        for (int i = 0; i < quantidade; i++) {
            scn.nextLine();
            System.out.print("Nome: ");
            String nome = scn.nextLine();
            System.out.print("Email: ");
            String email = scn.nextLine();
            System.out.print("Quarto desejado: ");
            int numQuarto = scn.nextInt();
            vetor[numQuarto] = new Hotel(nome, email);
            System.out.println();
        }

        System.out.println();
        System.out.println("===Quartos ocupados===");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println("Quarto: " + i + ", " + vetor[i]);
            }
        }
    }

}
