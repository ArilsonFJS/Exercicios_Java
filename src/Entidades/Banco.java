package Entidades;

public class Banco {

    private int numConta;
    private String nomeTitular;
    private double saldo;

    public Banco(int numConta, String nomeTitular, double depositoInicial) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }

    public Banco(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void saque(double quantia) {
        saldo -= quantia + 5.0;
    }

    public String toString() {
        return "Numero da conta: "
                + numConta
                + ", Titular da conta: "
                + nomeTitular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }

}
