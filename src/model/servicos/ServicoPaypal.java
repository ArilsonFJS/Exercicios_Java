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
public class ServicoPaypal implements ServicoPagamentoOnline {

    private static final double taxaPagamento = 0.02;
    private static final double jurosMensais = 0.01;

    @Override
    public double pagamento(double valor) {
        return valor * taxaPagamento;
    }

    @Override
    public double juros(double valor, int meses) {
        return valor * jurosMensais * meses;
    }

}
