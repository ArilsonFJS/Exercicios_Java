/*
 */
package ArrayList;

import Entidades.Acervo;
import Entidades.Livraria;
import java.util.Scanner;

public class ProgramaLivraria {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Scanner scnString = new Scanner(System.in);

        int menu, isbn;
        double vInicial, vFinal;
        Livraria objLivro;  //referencia para classe Livraria
        String titulo, autor, genero;
        double preco;

        do {
            exibirMenu();
            menu = scn.nextInt();

            switch (menu) {
                case 1: // Cadastro do livro
                    System.out.println("==> Cadastrar livro");
                    System.out.print("Titulo: ");
                    titulo = scnString.nextLine();
                    System.out.print("Autor: ");
                    autor = scnString.nextLine();
                    System.out.print("Genero: ");
                    genero = scnString.nextLine();
                    System.out.print("ISBN: ");
                    isbn = scn.nextInt();
                    System.out.print("Preço: ");
                    preco = scn.nextDouble();
                    //Criar obejto da classe
                    objLivro = new Livraria(titulo, autor, isbn, genero, preco);

                    //Guardar no Array
                    Acervo.adicionar(objLivro);
                    break;

                case 2:
                    System.out.println("==> Listagem de livros");
                    System.out.println(Acervo.listar());
                    break;
                case 3:
                    System.out.println("==> Excluir Livro");
                    System.out.print("Digite o titulo do livro: ");
                    titulo = scnString.nextLine();

                    if (!(Acervo.getListaLivros().isEmpty())) {//Acervo não vazio
                        if (Acervo.remover(titulo)) {
                            System.out.println("Livro removido com sucesso !");
                        } else {
                            System.out.println("Titulo não encontrado !");
                        }
                    } else {
                        System.out.println("Acervo vazio !");
                    }
                    break;
                case 4:
                    System.out.println("==>Pesquisa por genero");
                    System.out.print("Informe o genero do genero: ");
                    genero = scnString.nextLine();
                    System.out.println("\nExistem " + Acervo.pesquisar(genero) + " livro(s) do genero " + genero);
                    break;
                case 5:
                    System.out.println("Pesquisar faixa de preço");
                    System.out.print("Digite o valor Inicial e o valor Final: ");
                    vInicial = scn.nextDouble();
                    vFinal = scn.nextDouble();
                    System.out.printf("\nExistem " + Acervo.pesquisar(vInicial, vFinal) + " livro(s) com preço entre " 
                            + String.format(("R$ %.2f%n e R$ %.2f%n"), vInicial, vFinal));
                    break;
                case 6:
                    System.out.println("==> Calcular total R$ do acervo");
                    System.out.printf("O total é " + String.format("R$ %.2f%n", Acervo.calcularTotalAcervo()));
                    break;
                case 7:
                    System.out.println("SAINDO ...");
                    break;
                default:
                    System.out.println("Opção inválida !!");
            }

        } while (menu != 7);

    }

    static void exibirMenu() {
        System.out.println("=========[LIVRARIA]=========");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - LISTAR");
        System.out.println("3 - EXCLUIR LIVRO");
        System.out.println("4 - PESQUISAR POR GENERO");
        System.out.println("5 - PESQUISAR POR FAIXA DE PREÇO");
        System.out.println("6 - CALCULAR TOTAL DO ACERVO");
        System.out.println("7 - SAIR");
        System.out.println("===> Escolha uma opção <===");

    }
}
