package juan_la_estructuralibro2;

/**
 *
 * @author Master79
 */
public class Elemento {
    
    private Empleado employed;
    private Elemento next;
    private int size;

    public Empleado getEmployed() {
        return employed;
    }

    public void setEmployed(Empleado employed) {
        this.employed = employed;
    }

    public Elemento getNext() {
        return next;
    }

    public void setNext(Elemento next) {
        this.next = next;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
