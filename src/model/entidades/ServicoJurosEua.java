/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import java.security.InvalidParameterException;

/**
 *
 * @author arils
 */
public class ServicoJurosEua {
    
    private double taxaJuro;

    public ServicoJurosEua(double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }

    public double getTaxaJuro() {
        return taxaJuro;
    }
    
    public double pagamento(double valor, int meses){
        if(meses < 1){
            throw new InvalidParameterException("A quantidade de meses precisa ser maior que 0");
        }
        return valor * Math.pow(1.0 + taxaJuro /100.0, meses);
    }
}
