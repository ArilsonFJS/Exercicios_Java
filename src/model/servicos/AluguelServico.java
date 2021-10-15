package model.servicos;

import model.entidades.AluguelCarro;
import model.entidades.Fatura;

/**
 *
 * @author afrancelino
 */
public class AluguelServico {
    
    private Double precoHora;
    private Double precoDia;
    
    private TaxaServico taxaServico;
    
    public AluguelServico() {
    }
    
    public AluguelServico(Double precoHora, Double precoDia, TaxaServico taxaServico) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.taxaServico = taxaServico;
    }
    
    public Double getPrecoHora() {
        return precoHora;
    }
    
    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }
    
    public Double getPrecoDia() {
        return precoDia;
    }
    
    public void setPrecoDia(Double precoDia) {
        this.precoDia = precoDia;
    }
    
    public TaxaServico getTaxaServico() {
        return taxaServico;
    }
    
    public void setTaxaServico(TaxaServico taxaServico) {
        this.taxaServico = taxaServico;
    }
    
    public void processarFatura(AluguelCarro aluguelCarro) {
        
        long t1 = aluguelCarro.getSaida().getTime();
        long t2 = aluguelCarro.getDevolucao().getTime();
        
        double horas = (double) (t1 - t2) / 100 / 60 / 60;
        
        double pagementoBasisco;
        
        if (horas <= 12.0) {
            pagementoBasisco = precoHora * Math.ceil(horas);
        } else {
            pagementoBasisco = precoDia * Math.ceil(horas / 24);
        }
        
        double taxa = taxaServico.taxa(pagementoBasisco);
        
        aluguelCarro.setFatura(new Fatura(pagementoBasisco, taxa));
        
    }
}
