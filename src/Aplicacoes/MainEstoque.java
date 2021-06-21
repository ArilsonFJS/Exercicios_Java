package Aplicacoes;


import Entidades.Produto;
import java.util.Locale;
import java.util.Scanner;

public class MainEstoque {
    
    

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        System.out.println("Insira os dados do produto");
        System.out.print("Nome: ");
        String nome = scn.nextLine();
        System.out.print("Preço: ");
        double preco = scn.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scn.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        
        System.out.println();
        System.out.println("informações do produto: " + produto);

        System.out.println();
        System.out.print("Informe a quantidade para adicionar ao estoque: ");
        quantidade = scn.nextInt();
        produto.addProduto(quantidade);

        System.out.println();
        System.out.println("Atualização do estoque: " + produto);

        System.out.println();
        System.out.print("Informe a quantidade para remover do estoque: ");
        quantidade = scn.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("Atualização do estoque: " + produto);

    }
}
