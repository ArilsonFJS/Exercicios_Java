package Aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entidades.Contrato;
import model.entidades.Parcelas;
import model.servicos.ServicoContrato;
import model.servicos.ServicoPaypal;

/**
 *
 * @author afrancelino
 */
public class MainContratos {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com as informações do contrato");
        System.out.print("Numero: ");
        int numero = scn.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        Date data = sdf.parse(scn.next());
        System.out.print("Valor do contrato: ");
        double valorTotal = scn.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);

        System.out.print("Informe a quantidade de parcelas? ");
        int parcelas = scn.nextInt();

        ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());

        servicoContrato.processarContrato(contrato, parcelas);

        System.out.println("Parcelas:");
        for (Parcelas x : contrato.getLista()) {
            System.out.println(x);
        }
    }
}
