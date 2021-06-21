package ListaSimples;

public class Elemento {

    private Elemento anterior;
    private Object obejto;

    public Elemento() {

    }

    public Elemento(Elemento ant, Object obejto) {
        this.anterior = ant;
        this.obejto = obejto;
    }

    public Elemento getAnt() {
        return anterior;
    }

    public void setAnt(Elemento ant) {
        this.anterior = ant;
    }

    public Object getObjeto() {
        return obejto;
    }

    public void setObejto(Object obejto) {
        this.obejto = obejto;
    }

    @Override
    public String toString() {
        return " " + obejto;
    }
}
