/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacoes;

import java.util.Locale;
import java.util.Scanner;
import model.entidades.ServicoJurosBrazil;
import model.entidades.ServicoJurosEua;

/**
 *
 * @author arils
 */
public class MainEmprestimo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Valor: ");
        double valor = scn.nextDouble();
        
        System.out.print("Meses: ");
        int meses = scn.nextInt();
        
        /*ServicoJurosBrazil is = new ServicoJurosBrazil(2.0);*/
        ServicoJurosEua is = new ServicoJurosEua(1.0);
        double pagamento = is.pagamento(valor, meses);
        
        System.out.print("Pagamento após "  + meses + " meses R$ ");
        System.out.println(String.format("%.2f", pagamento));
        
        scn.close();
        
        
        
    }
}
