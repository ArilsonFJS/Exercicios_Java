package ListaDupla;

public class ListaDupla {

    No inicio;
    No fim;
    int tamanho;

    public void inserirInicio(Funcionario funcionario) {
        No no = new No();
        no.funcionario = funcionario;
        no.anterior = null;
        no.proximo = inicio;

        if (inicio != null) {
            inicio.anterior = no;
        }
        inicio = no;
        if (tamanho == 0) {
            fim = inicio;
        }
        tamanho++;
    }

    public boolean vazia() {
        return (this.inicio == null);
    }

    public boolean removerFuncionario(int matricula) {
        No atual = this.inicio;
        No antes = null;
        if (vazia()) {
            return false;
        } else {
            while (((atual != null) && atual.getFuncionario().getMatricula() == matricula)) {

                antes = atual;
                atual = atual.getProximo();
            }
            if (atual == this.inicio) {
                if (this.inicio == this.fim) {
                    this.fim = null;
                }
                this.inicio = this.inicio.getProximo();
            } else {
                if (atual == this.fim) {
                    this.fim = antes;
                }
                antes.setProximo(atual.getProximo());
            }
            return true;
        }
    }
    
    public String exibirLista(){
        String msg = "";
        if(vazia()){
            msg = "A lista está vazia";
        }else{
            No atual = this.inicio;
            while (atual != null){
                msg+=   "\nNome: " + atual.getFuncionario().getNome()
                        + "\nCargo: " + atual.getFuncionario().getCargo()
                        + "\nSalario: " + atual.getFuncionario().getSalario()
                        + "\nMatricula: " + atual.getFuncionario().getMatricula();
            }
        }
        return msg;
    }
}
