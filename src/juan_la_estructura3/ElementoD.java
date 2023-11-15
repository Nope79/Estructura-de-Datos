package juan_la_estructura3;

/**
 *
 * @author LMC Master79
 */
public class ElementoD {
    
    private Producto dato;
    private ElementoD next;
    private ElementoD before;

    public ElementoD(Producto dato) {
        this.dato = dato;
        this.next = null;
        this.before = null;
    }

    

    public Producto getDato() {
        return dato;
    }

    public void setDato(Producto dato) {
        this.dato = dato;
    }

    public ElementoD getNext() {
        return next;
    }

    public void setNext(ElementoD next) {
        this.next = next;
    }

    public ElementoD getBefore() {
        return before;
    }

    public void setBefore(ElementoD before) {
        this.before = before;
    }
    
    

    @Override
    public String toString() {
        return "ElementoD{" + "dato=" + dato + ", next=" + next + ", before=" + before + '}';
    }
}