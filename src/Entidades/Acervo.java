package Entidades;

import java.util.ArrayList;

public class Acervo {

    private static ArrayList<Livraria> listaLivros = new ArrayList<>();

    public static ArrayList<Livraria> getListaLivros() {
        return listaLivros;
    }

    //Adicionar um objeto na listaLivros
    public static void adicionar(Livraria l) {
        listaLivros.add(l);
    }

    //Listar os dados de todos objetos da listaLivros
    public static String listar() {
        String saida = "";

        int i = 1;
        for (Livraria l : listaLivros) {
            saida += "\n===== Livro Nº: " + (i++) + "=====";
            saida += l.imprimir() + "\n";
        }
        return saida;
    }

    //Pesquisar quantos livros do mesmo genero existem no acervo
    public static int pesquisar(String genero) {
        int qntd = 0;

        for (Livraria l : listaLivros) {
            if (l.getGenero().equalsIgnoreCase(genero)) {
                qntd++;
            }
        }
        return qntd;
    }

    //Pesquisar quantos livros em uma faixa de preço
    public static int pesquisar(double vInicial, double vFinal) {
        int qntd = 0;
        for (Livraria l : listaLivros) {
            if (l.getPreco() >= vInicial && l.getPreco() <= vFinal) {
                qntd++;
            }
        }
        return qntd;
    }

    //Remover um obejto pelo titulo
    public static boolean remover(String titulo) {
        for (Livraria l : listaLivros) {

            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                listaLivros.remove(l);
                return true;
            }
        }
        return false;
    }

    //Total do acervo
    public static double calcularTotalAcervo() {
        double total = 0;
        for (Livraria l : listaLivros) {
            total += l.getPreco();
        }
        return total;
    }
}
