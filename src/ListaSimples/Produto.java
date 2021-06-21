package ListaSimplesmenteLigada;

public class Produto {

    private String nome, categoria;
    private double preco;
    private int codigo, quantidade;

    public Produto() {

    }

    public Produto(String nome, String categoria, double preco, int codigo, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 1){
            this.quantidade = quantidade;
        }else {
            throw new IllegalArgumentException("Quantidade inválida !");
        }
    }

    @Override
    public String toString() {
        return"|> Produto: " + nome
                + "\n |> Categoria: " + categoria
                + "\n |> Preço R$: " + String.format("%.2f", preco)
                + "\n |> Codigo: " + codigo 
                + "\n |> Quantidade: " + quantidade
                + "\n---------------------";
    }
}
