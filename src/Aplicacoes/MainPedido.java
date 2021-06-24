package Aplicacoes;

import Entidades.Cliente;
import Entidades.OrdemPedido;
import Entidades.Pedido;
import Entidades.Produto02;
import Enum.StatusPedido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author arils
 */
public class MainPedido {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do Cliente");
        System.out.print("Nome: ");
        String nome = scn.nextLine();
        System.out.print("Email: ");
        String email = scn.next();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date nascimento = sdf.parse(scn.next());

        Cliente cliente = new Cliente(nome, email, nascimento);

        System.out.println();
        System.out.println("Entre com os dados do pedido: ");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(scn.next());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.print("Quantos itens para esta ordem de pedido? ");
        int n = scn.nextInt();
        System.out.println();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do pedido " + i);
            System.out.print("Nome do produto: ");
            String nomeProd = scn.next();
            System.out.print("Preço: ");
            double precoProd = scn.nextDouble();

            Produto02 produto = new Produto02(nomeProd, precoProd);

            System.out.print("Quantidade: ");
            int quantidadeProd = scn.nextInt();

            OrdemPedido ordemPedido = new OrdemPedido(quantidadeProd, precoProd, produto);
            System.out.println();

            pedido.addPedido(ordemPedido);
        }
        
        System.out.println();
        System.out.println("> Dados do pedido");
        System.out.println();
        System.out.println(pedido);
    }
}
