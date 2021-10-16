package model.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author afrancelino
 */
public class Contrato {

    private int numeroContrato;
    private Date dataContrato;
    private Double valorTotal;

    private List<Parcelas> lista = new ArrayList<>();

    public Contrato() {
    }

    public Contrato(Integer numeroContrato, Date dataContrato, Double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcelas> getLista() {
        return lista;
    }

    public void addParcela(Parcelas parcela) {
        lista.add(parcela);
    }

    public void removerParcela(Parcelas parcela) {
        lista.remove(parcela);
    }
}
