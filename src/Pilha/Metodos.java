package Pilha;

public class Metodos {

    private Elemento inicio = null;

    private Elemento atual, aux;

    private int quantidade = 0;

    /**
     *
     * Retorna a quantidade de elementos presentes na pilha.
     *
     * @return int *
     */
    public int size() {

        return this.quantidade;

    }

    public boolean empty() {

        return inicio == null;

    }

    public Elemento top() {

        if (!empty()) {

            return atual;

        } else {

            throw new IllegalArgumentException("Pilha vazia!");

        }

    }

    public void push(Object valor) {

        if (empty()) {

            Elemento novoElemento = new Elemento(null, null, valor);

            this.inicio = novoElemento;

            this.aux = inicio;

            this.atual = inicio;

        } else {

            Elemento novoElemento = new Elemento(null, aux, valor);

            this.atual = novoElemento;

            this.aux.setProx(atual);

            this.aux = atual;

        }

        quantidade++;

    }

    public void pop() {

        if (!empty()) {

            if (atual != inicio) {

                aux = atual.getAnt();
                aux.setProx(null);
                atual.setAnt(null);
                atual = aux;

            } else {

                inicio = null;
                atual = null;
            }

            quantidade--;

        } else {
            System.out.println("Pilha vazia!");
        }
    }

    public void exibir() {

        System.out.print("[");

        Elemento elemento = inicio;

        while (elemento != null) {

            System.out.print(elemento.getObjeto() + ",");

            elemento = elemento.getProx();

        }

        System.out.println("]");

    }

}
