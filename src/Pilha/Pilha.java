package Pilha;

import java.util.Scanner;

public class Pilha {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Metodos metodos = new Metodos();
        int opc;

        do {
            System.out.print("Escolha uma opção: ");
            System.out.println("\n 1 - PUSH\n 2 - POP\n 3 - EMPTY\n 4 - SIZE\n 5 - TOP\n 6 - SAIR");
            opc = scn.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Informe um valor: ");
                    int valor = scn.nextInt();
                    metodos.push(valor);
                    break;
                case 2:
                    System.out.println("Objeto removido: " + metodos.top().getObjeto());
                    metodos.pop();
                    break;
                case 3:
                    System.out.println(metodos.empty());
                    break;
                case 4:
                    System.out.println("Quantidade de elementos: " + metodos.size() + "\n");
                    break;
                case 5:
                    try {
                        System.out.println(metodos.top().getObjeto());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao Invalida !");
            }
                metodos.exibir();
        } while (opc != 6);
    }
}
