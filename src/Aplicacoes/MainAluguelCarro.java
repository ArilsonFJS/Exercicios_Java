package Aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entidades.AluguelCarro;
import model.entidades.Veiculo;
import model.servicos.AluguelServico;
import model.servicos.TaxaServicoBrasil;

/**
 *
 * @author afrancelino
 */
public class MainAluguelCarro {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Entre os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modelo = scn.nextLine();
        System.out.print("Data de saida  (dd/MM/yyyy HH:mm): ");
        Date saida = sdf.parse(scn.nextLine());
        System.out.print("Data de devolucao (dd/MM/yyyy HH:mm): ");
        Date devolucao = sdf.parse(scn.nextLine());

        AluguelCarro aluguelCarro = new AluguelCarro(saida, devolucao, new Veiculo(modelo));

        System.out.print("Entre com o preco por hora: ");
        double precoHora = scn.nextDouble();
        System.out.print("Entre com o preco por dia: ");
        double precoDia = scn.nextDouble();

        AluguelServico aluguelServico = new AluguelServico(precoHora, precoDia, new TaxaServicoBrasil());

        aluguelServico.processarFatura(aluguelCarro);

        System.out.println("FATURA");
        System.out.println("Pagamento basico: " + String.format("%.2f", aluguelCarro.getFatura().getPagamentoBasico()));
        System.out.println("Taxa: " + String.format("%.2f" + aluguelCarro.getFatura().getTaxa()));
        System.out.println("Valor total: " + String.format("%.2f" + aluguelCarro.getFatura().getPagamentoTotal()));

    }
}
