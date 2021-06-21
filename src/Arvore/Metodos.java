package arvore;

public class Metodos {

    private No raiz = null, atual;

    public No getRaiz() {
        return this.raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public void inserir(int n) {
        No novoNo = new No(null, null, n);
        if (this.raiz == null) {
            this.raiz = novoNo;
        } else {
            this.atual = this.raiz;
            while (true) {
                if (novoNo.getNumero() >= this.atual.getNumero()) {
                    if (this.atual.getDireita() == null) {
                        this.atual.setDireita(novoNo);
                        break;
                    } else {
                        this.atual = this.atual.getDireita();
                    }
                }
                if (novoNo.getNumero() < this.atual.getNumero()) {
                    if (this.atual.getEsquerda() == null) {
                        this.atual.setEsquerda(novoNo);
                        break;
                    } else {
                        this.atual = this.atual.getEsquerda();
                    }
                }
            }
        }
    }

    public void ordem(No no) {
        if (no != null) {
            ordem(no.getEsquerda());
            System.out.print(no.getNumero() + " ");
            ordem(no.getDireita());
        }
    }

    public void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.getNumero() + " ");
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());
        }
    }

    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.getEsquerda());
            posOrdem(no.getDireita());
            System.out.print(no.getNumero() + " ");
        }
    }

    public int buscar(No no, int n) {
        if (no != null) {
            if (no.getNumero() == n) {
                return no.getNumero();
            } else {
                if (n > no.getNumero()) {
                    return buscar(no.getDireita(), n);
                } else {
                    return buscar(no.getEsquerda(), n);
                }
            }
        }
        throw new IllegalArgumentException("Não encontrado!");
    }

}
