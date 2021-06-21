package Entidades;

import Enum.NivelTrabalhador;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author arils
 */
public class Trabalhador {

    private String nome;
    private NivelTrabalhador nivel;
    private double salarioBase;

    //Associacao entre objetos
    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>(); //um trabalhador possui vários contratos

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelTrabalhador nivel, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }
    
    //Adicionar contrato
    public void addContrato(HoraContrato contrato) {

        contratos.add(contrato);
    }

    //Remover contrato
    public void removerContrat(HoraContrato contrato) {

        contratos.remove(contrato);
    }
    
    //Renda com base no ano e mês
    public double renda(int ano, int mes){
        
       double soma = salarioBase;
       Calendar calendario = Calendar.getInstance();
       for(HoraContrato c : contratos){
           calendario.setTime(c.getDate());
           int c_ano = calendario.get(Calendar.YEAR);
           int c_mes = 1 + calendario.get(Calendar.MONTH); //adionado +1 metodo Calendar comeca com 0.
           
           if (ano == c_ano && mes == c_mes){
               soma += c.valorTotal();
           }
       }
       return soma;
    }
}
