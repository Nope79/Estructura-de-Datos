package juan_la_estructura3;

/**
 *
 * @author LMC Alumno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("hola");
        
        Producto t = new Producto("PAPAS", "Frutas y Verduras", 15);
        
        ListaDoble x = new ListaDoble();
        
        x.add(t);
        
        System.out.println(x);
        
        // buscar uno nombre y regresa el objeto, buscar todos categoria count, eliminar todos por categoria, max y min producto, 
    }
    
}

