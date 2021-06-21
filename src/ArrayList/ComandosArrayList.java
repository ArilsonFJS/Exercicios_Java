// Exercicio de fixação do método ArrayList
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ComandosArrayList {

    public static void main(String[] args) {

        //Instaciação de um ArrayList 
        ArrayList<String> lista = new ArrayList<>();

        //Adicionar elementos no Array
        lista.add("A");

        //Adicionar elementos passando a posição 
        lista.add(1, "B");

        //Coloca a lista de string em ordem alfabetica
        Collections.sort(lista);

        System.out.println(lista);
        System.out.println();

        //Buscar a posição em que o elemento esta dentro do ArrayList
        int posicao = lista.indexOf("B");
        System.out.println(posicao);
        System.out.println();

        //Buscar o elemento que esta dentro do ArrayList pela posição
        System.out.println(lista.get(0));
        System.out.println();

        //Remover um elemento do ArrayList passando a posição
        lista.remove(0);
        System.out.println(lista);
        System.out.println();

        //Remover um elemento passando o próprio elemento
        lista.remove("A");
        System.out.println(lista);
        System.out.println();

        //Insere a string dada o indice do array(Obs: sobescreve caso ja exista um string no indice indicado 
        lista.set(0, "C");
        System.out.println(lista);

        //Dado o indice retorna para variavel a string 
        String string = lista.get(0);
        System.out.println(string);

        //Exibir o tamanho do ArrayList
        System.out.println("Tamanho: " + lista.size());

        //Buscar um elemento do ArrayList 
        boolean existe = lista.contains("B");
        if (existe) {
            System.out.println("Elemento existe no ArrayList");
        } else {
            System.out.println("Elemento não existe no ArrayList");
        }
        System.out.println();

        //remove todos o elementos da lista
        lista.clear();

        //Verifica se a lista está vazia
        boolean listaVazia = lista.isEmpty();
        System.out.println(listaVazia);
    }
}
