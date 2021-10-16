/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.servicos;

/**
 *
 * @author afrancelino
 */
public interface ServicoPagamentoOnline {

    public double pagamento(double valor);

    public double juros(double valor, int meses);

}
