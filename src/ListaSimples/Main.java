package ListaSimples;

public class Main {

    public static void main(String[] args) {

        Metodos metodo = new Metodos();

        Produto p = new Produto("Frango", "Alimentos", 25.00, 1234, 2);
        metodo.inserirElementoInicio(p);

        Produto p2 = new Produto("Cerveja", "Bebida", 45.00, 888, 1);
        metodo.inserirElementoInicio(p2);

        System.out.println("SEM DESCONTO");
        metodo.exibir(metodo.getAtual());

        System.out.println("\nCOM DESCONTO");
        metodo.desconto(10, "alimentos");
        metodo.exibir(metodo.getAtual());
        
        //remove elemento inteiro
        metodo.remover(888);
        
        //remove quantidade 
        metodo.remover(1234, 1);
        metodo.exibir(metodo.getAtual());
    }
}
