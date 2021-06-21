package Entidades;

public class Livraria {
    
    //Atributos
    private String titulo;
    private String autor;
    private int isbn;
    private String genero;
    private double preco;
    
    //Construtor default
    public Livraria(){ }
    
    public Livraria (String titulo, String autor, int isbn, String genero, double preco){
        
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.preco = preco;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public String imprimir() {
        return "\nTitulo: " + titulo + "\nAutor: " + autor 
                + "\nISBN: " + isbn + "\nGenero: " + genero 
                + "\nPreco" + String.format(" R$ %.2f%n", preco);
    }
    
    
}
