package Entidades;

/**
 *
 * @author arils
 */
public class OrdemPedido {

    private Integer quantidade;
    private double preco;
    private Produto02 produto;

    public OrdemPedido() {
    }

    public OrdemPedido(Integer quantidade, double preco, Produto02 produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto02 getProduto() {
        return produto;
    }

    public void setProduto(Produto02 produto) {
        this.produto = produto;
    }

    public double subTotal() {
        return quantidade * preco;
    }

    public String toString() {
        return produto.getNome()
                + " $"
                + String.format("%.2f", preco)
                + "\nQuantidade: "
                + quantidade
                + "\nSubtotal: $"
                + String.format("%.2f", subTotal())
                + "\n";
    }
}
