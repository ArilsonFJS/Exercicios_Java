package Entidades;

public class Funcionario2 {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario2 (){
        
    }
    public Funcionario2(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
    public void aumentoSalario(double porcentagem) {
        salario += salario * porcentagem /100.0;
    }

    @Override
    public String toString() {
        return "ID: " + id 
                + ", nome: " + nome 
                + ", salario R$ " +String.format("%.3f%n", salario);
    }
    
}
