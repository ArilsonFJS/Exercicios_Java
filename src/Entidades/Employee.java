package Entidades;

/**
 *
 * @author arils
 */
public class Employee {

    private String name;
    private Integer hours;
    private Double valueHour;

    public Employee() {
    }

    public Employee(String nome, Integer horas, Double valorHora) {
        this.name = nome;
        this.hours = horas;
        this.valueHour = valorHora;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public Integer getHoras() {
        return hours;
    }

    public void setHoras(Integer horas) {
        this.hours = horas;
    }

    public Double getValorHora() {
        return valueHour;
    }

    public void setValorHora(Double valorHora) {
        this.valueHour = valorHora;
    }

    public double payment() {
        return hours * valueHour;
    }
}
