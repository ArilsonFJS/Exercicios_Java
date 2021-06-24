/*
Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date()
 */
package Entidades;

import Enum.StatusPedido;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author arils
 */
public class Pedido {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date dataPedido;
    private StatusPedido status;

    private List<OrdemPedido> pedidos = new ArrayList<>();
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(Date dataPedido, StatusPedido status, Cliente cliente) {
        this.dataPedido = dataPedido;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public List<OrdemPedido> getPedidos() {
        return pedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addPedido(OrdemPedido pedido) {
        pedidos.add(pedido);
    }

    public void removePedido(OrdemPedido pedido) {
        pedidos.remove(pedido);
    }

    public double totalPedido() {

        double soma = 0.0;
        for (OrdemPedido op : pedidos) {
            soma += op.subTotal();
        }
        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data e hora do pedido: ");
        sb.append(sdf.format(dataPedido) + "\n");
        sb.append("Status: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente.getNome() + "\n");
        sb.append("\n");
        sb.append("========================\n");
        sb.append("\n");
        sb.append("> PEDIDO(S)");
        sb.append("\n");

        for (OrdemPedido pedido : pedidos) {
            sb.append("\n" + pedido);
        }
        sb.append("\n");
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", totalPedido()));
        return sb.toString();
    }
}
