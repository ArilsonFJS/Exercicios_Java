package Entidades;

import java.util.Date;

/**
 *
 * @author arils
 */
public class HoraContrato {

    private Date date;
    private Double valorPorHora;
    private Integer horas;

    public HoraContrato() {
    }

    public HoraContrato(Date date, Double valorPorHora, Integer horas) {
        this.date = date;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    //Calcular valor total do contrato
    public double valorTotal(){
        return valorPorHora * horas;
    }
}
