package Util;

public class Lista {

    private Node head;

    public void add(String nome) {

        Node node = new Node();
        node.setNome(nome);
        node.setProximo(node);

        head = node;
    }

    @Override
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        
        sb.append("[");
        
        Node p = head;
        
        while(p != null){
            sb.append(p.getNome() + " ");
            
            p = p.getProximo();
        }
        
        sb.append("]");
        return sb.toString();
    }
}
