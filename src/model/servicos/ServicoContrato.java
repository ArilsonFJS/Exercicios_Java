/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.servicos;

import java.util.Calendar;
import java.util.Date;
import model.entidades.Contrato;
import model.entidades.Parcelas;

/**
 *
 * @author afrancelino
 */
public class ServicoContrato {

    private ServicoPagamentoOnline pagamentOnline;

    public ServicoContrato(ServicoPagamentoOnline pagamentOnline) {
        this.pagamentOnline = pagamentOnline;
    }

    public void processarContrato(Contrato contrato, int meses) {

        double valorBasico = contrato.getValorTotal() / meses;

        for (int i =1 ; i <= meses; i++) {
            Date date = addMeses(contrato.getDataContrato(), i);
            double pagamentoJuros = valorBasico + pagamentOnline.juros(valorBasico, i);
            double pagamentoTotal = pagamentoJuros + pagamentOnline.pagamento(pagamentoJuros);
            contrato.addParcela(new Parcelas(date, pagamentoTotal));
        }

    }

    private Date addMeses(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }
}
