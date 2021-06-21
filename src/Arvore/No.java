 
package arvore;
 
public class No {
   private No esquerda, direita;
   private int numero; 

    public No() {
    }

    public No(No esquerda, No direita, int numero) {
        this.esquerda = esquerda;
        this.direita = direita;
        this.numero = numero;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
}
