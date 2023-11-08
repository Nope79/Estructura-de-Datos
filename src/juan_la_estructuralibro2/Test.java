package juan_la_estructuralibro2;

/**
 *
 * @author Master79
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado a = new Empleado("Angel", 19, "Coordinacion", "Diosdado", "Gutierrez");
        Empleado b = new Empleado("Juan Manuel", 2, "Direccion", "López", "Almanza");
        Empleado c = new Empleado("Julio", 19, "Table", "Díaz", "Peréz");
        Empleado d = new Empleado("nanananana", 10, "fri", "holaa", "holaaaaaa");
        //System.out.println(a);
        
        
        
        
        ListaSimple x = new ListaSimple();
        
        x.add(a);
        x.add(b);
        x.add(c);
        x.add(d);
        
        System.out.println(x.toString());
        
        System.out.println("alskdfjlkj");
        
        System.out.println(x.maxEdad());
        
        System.out.println("lkjdsflkj");
        
        System.out.println(x.minEdad());
        
        System.out.println("ldksjalfkj");
        
        System.out.println(x.busca("Juan"));
        
        System.out.println(x.busca("jjj"));
        
        System.out.println(x.buscaCompleto("Hola", "adios", "memuerolol"));
        
        System.out.println("lkasdsfjlkjfsdlkj");
        
        System.out.println(x.buscaCompleto("Juan Manuel", "López", "Almanza"));
        
        System.out.println("lkjfsdlkj");
        
        // nombre s, edad i, id gen, dep s, pat s, mat s
        
        // genid, inicial mayuscula departamento, dos numeros aleatorios, guion, primeras 2 letras mayusculas apepaterno, inicial nomhbre
    }
    
}
