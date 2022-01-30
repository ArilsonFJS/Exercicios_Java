/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

/**
 *
 * @author arils
 */
public class Pessoas implements Comparable <Pessoas>{
    
    private String nome;
    private Double salario;

    public Pessoas(String name, Double salario) {
        this.nome = name;
        this.salario = salario;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Pessoas o) {
        return  -salario.compareTo(o.getSalario());
    }
    
}
