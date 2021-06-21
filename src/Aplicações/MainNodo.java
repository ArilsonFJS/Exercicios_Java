package Aplicações;

import Util.Lista;
import java.util.Scanner;

public class MainNodo {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Lista lista = new Lista();

        int op;

        do {
            menu();
            op = scn.nextInt();
            
            switch(op){
                case 1:
                    System.out.print("Digite um nome: ");
                    scn.nextLine();
                    String nome = scn.nextLine();
                    lista.add(nome);
                    break;
                case 2:
                    System.out.println(lista.toString());
                    break;
                case 3:
                    System.out.println("Encenrando ...");
                    break;
                    
                default:
                    System.out.println("Valor inválido!");
            }
            
        } while (op != 3);

    }

    public static void menu() {
  
        System.out.println("1 - Inserir na lista ");
        System.out.println("2 - Exibir lista ");
        System.out.println("3 - Sair");
        System.out.println();
    }
}
