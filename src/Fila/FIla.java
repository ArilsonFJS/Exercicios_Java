package Fila;

public class Fila {

    //Implementação da Fila
    private Elemento inicio = null;

    private Elemento atual, aux;

    private int quantidade = 0;

    //Adicionar
    public void enqueue(Object elemento) {

        if (empty()) {

            Elemento novoElemento = new Elemento(null, null, elemento);
            this.inicio = novoElemento;
            this.aux = inicio;
            this.atual = inicio;
        } else {

            Elemento novoElemento = new Elemento(null, aux, elemento);
            this.atual = novoElemento;
            this.aux.setProx(atual);
            this.aux = atual;
        }
        quantidade++;
    }
    //Remover
    public void dequeue() {

        if (!empty()) {

            if (quantidade != 1) {
                inicio = aux.getProx();
                aux.setProx(null);
                inicio.setAnt(null);
            } else {
                inicio = null;
            }
            quantidade--;

        } else {
            System.out.println("Fila vazia!");
        }
    }
    //Exibir o atual
    public Elemento front() {

        if (!empty()) {

            return atual;
        } else {

            throw new IllegalArgumentException("Fila vazia!");
        }
    }
    //Tamanho
    public int size() {

        return this.quantidade;
    }
    //Verifica se está vazia
    public boolean empty() {

        return inicio == null;
    }
    
    //Implementção de um Elemento 
    public class Elemento {

        private Elemento prox, ant;
        private Object objeto;

        public Elemento() {
        }

        public Elemento(Elemento prox, Elemento ant, Object objeto) {
            this.prox = prox;
            this.ant = ant;
            this.objeto = objeto;
        }

        public Elemento getProx() {
            return prox;
        }

        public void setProx(Elemento prox) {
            this.prox = prox;
        }

        public Elemento getAnt() {
            return ant;
        }

        public void setAnt(Elemento ant) {
            this.ant = ant;
        }

        public Object getObjeto() {
            return objeto;
        }

        public void setObjeto(Object objeto) {
            this.objeto = objeto;
        }

        @Override
        public String toString() {
            return " " + objeto;
        }
    }
}
