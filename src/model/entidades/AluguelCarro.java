package model.entidades;

import java.util.Date;

/**
 *
 * @author afrancelino
 */
public class AluguelCarro {

    private Date saida;
    private Date devolucao;

    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelCarro() {
    }

    public AluguelCarro(Date saida, Date devolucao, Veiculo veiculo) {
        this.saida = saida;
        this.devolucao = devolucao;
        this.veiculo = veiculo;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

}
