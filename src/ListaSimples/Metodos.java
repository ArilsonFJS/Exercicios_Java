package ListaSimples;

public class Metodos {

    private Elemento atual = null;
    private int quantidadeElementos = 0;

    public Elemento getAtual() {
        return atual;
    }

    public void inserirElementoInicio(Object objeto) {

        Elemento novoElemento = new Elemento(atual, objeto);
        this.atual = novoElemento;
        quantidadeElementos++;
    }

    public void exibir(Elemento elemento) {

        double total = 0;
        Produto produto;

        System.out.println("\n===[Cupom Fiscal]===\n");

        for (int i = 0; i < quantidadeElementos; i++) {

            System.out.println(elemento + " ");
            produto = (Produto) elemento.getObjeto();
            total += produto.getPreco() * produto.getQuantidade();
            elemento = elemento.getAnt();
        }
        System.out.printf("Total da compra R$: %.2f%n", total);
        System.out.println("==========================");
    }

    public void desconto(double desconto, String categoria) {

        Elemento elemento = this.atual;
        Produto produto;

        while (elemento != null) {

            produto = (Produto) elemento.getObjeto();//casting

            if (produto.getCategoria().equalsIgnoreCase(categoria)) {

                double result = (produto.getPreco() * desconto) / 100;
                double precoDesconto = produto.getPreco() - result;
                produto.setPreco(precoDesconto);
            }

            elemento = elemento.getAnt();//Referencia para o elemento anterior
        }
    }

    public Object pesquisar(int codigo) {

        Elemento elemento = this.atual;

        Produto produto;

        while (elemento != null) {

            produto = (Produto) elemento.getObjeto();

            if (produto.getCodigo() == codigo) {

                return produto;
            }
            elemento = elemento.getAnt();
        }
        return null;
    }

    public boolean remover(int codigo, int quantidadeRemovida) {

        Produto produto = (Produto) pesquisar(codigo);
        if (produto != null) {
            produto.setQuantidade(produto.getQuantidade() - quantidadeRemovida);
            return true;
        }
        return false;
    }

    public boolean remover(int codigo) {

        Elemento remov = atual;

        if (atual != null) {

            Produto produto;

            Elemento aux = remov;

            while (remov != null) {

                produto = (Produto) remov.getObjeto();

                if (produto.getCodigo() == codigo) {
                    //Remoção do primeiro elemento da lista
                    if (remov == atual) {

                        atual = atual.getAnt();

                        remov.setAnt(null);
                        //Remoção do último elemento da lista
                    } else if (remov.getAnt() == null) {

                        aux.setAnt(null);
                        //Remoção de um elemento qualquer
                    } else {

                        aux.setAnt(remov.getAnt());

                        remov.setAnt(null);
                    }
                    quantidadeElementos--;

                    return true;
                }

                aux = remov;

                remov = remov.getAnt();
            }
        }

        return false;
    }
}
