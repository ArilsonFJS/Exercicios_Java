package Entidades;

/**
 *
 * @author arils
 */
public class Produto02 {
    
    private String nome;
    private double preco;

    public Produto02() {
    }
    
    public Produto02(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
