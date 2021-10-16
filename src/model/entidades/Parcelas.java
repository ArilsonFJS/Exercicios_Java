package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author afrancelino
 */
public class Parcelas {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
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

    @Override
    public String toString() {
        return sdf.format(dataVencimento)+ " Mensalidade: " + String.format("%.2f", valor);
    }

}
