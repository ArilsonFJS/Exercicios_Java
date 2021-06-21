package Entidades;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public double aumentoSalarial(double porcentagem) {
        double result = (porcentagem * salarioBruto) / 100;
        return (salarioBruto + result) - imposto;
    }
}
