package model.entidades;

import java.util.Date;

/**
 *
 * @author afrancelino
 */
public class Parcelas {

    private Date dataVencimento;
    private Double valor;

    public Parcelas() {
    }

    public Parcelas(Date dataVencimento, Double valor) {
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
