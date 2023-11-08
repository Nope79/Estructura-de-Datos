package juan_la_estructuralibro2;

import java.util.StringTokenizer;

/**
 *
 * @author Master79
 */
public class ListaSimple {
    
    private Elemento first;
    private int size;
    
    public ListaSimple(){
        
        this.first = null;
        this.size = 0;
    }
    
    public boolean empty(){
        
        return this.size == 0;
    }
    
    public void add(Empleado nuevo){
        
        if(empty()){
            
            this.first = new Elemento(nuevo);
            size++;
        }else{
            
            Elemento aux = first;
            
            while(aux != null){
                
                if(aux.getNext() == null){
                    
                    aux.setNext(new Elemento(nuevo));
                    size++;
                    aux = null;
                }else{
                    
                    aux =aux.getNext();
                }
            }
        }
    }
    
    public Empleado buscaCompleto(String nombre, String apellidoP, String apellidoM){
        
        Elemento aux = first;
        
        while(aux != null){
            
            if(aux.getEmployed().getNombre().equals(nombre) && aux.getEmployed().getApePaterno().equals(apellidoP) && aux.getEmployed().getApeMaterno().equals(apellidoM)){
                
                System.out.println("Elemento encontrado");
                return aux.getEmployed();
            }else{
                
                aux = aux.getNext();
            }
        }
        
        System.out.println("elemento no encontrado");
        return null;
    }
    
    // listo
    public Empleado busca(String nombre){
        
        Elemento aux = first;
        
        while(aux != null){
            
            if(aux.getEmployed().getNombre().equals(nombre)){
                
                System.out.println("Elemento encontrado");
                return aux.getEmployed();
            }else{
                
                aux = aux.getNext();
            }
        }
        
        System.out.println("elemento no encontrado");
        return null;
    }
    
    // Terminado
    public Empleado maxEdad(){
        
        Elemento aux = first;
        
        int max = 0;
        
        Empleado y = null;
        
        while(aux != null){
            
            if(max < aux.getEmployed().getEdad()){
                
                max = aux.getEmployed().getEdad();
                
                y = aux.getEmployed();
                
                //Empleado x = new Empleado(aux.getEmployed().getNombre(), aux.getEmployed().getEdad(), aux.getEmployed().getDepartamento(), aux.get);
            }
            
            aux = aux.getNext();
        }
        
        return y;
    }
    
    // Termindado
    public Empleado minEdad(){
        
        Elemento aux = first;
        
        int min = 120;
        
        Empleado y = null;
        
        while(aux != null){
            
            if(min > aux.getEmployed().getEdad()){
                
                min = aux.getEmployed().getEdad();
                
                y = aux.getEmployed();
                
                //Empleado x = new Empleado(aux.getEmployed().getNombre(), aux.getEmployed().getEdad(), aux.getEmployed().getDepartamento(), aux.get);
            }
            
            aux = aux.getNext();
        }
        
        return y;
    }
    
    
    // Terminado
    public String toString(){
        
        Elemento aux = first;
        String x = "";
        
        while(aux != null){
            
            x += aux.getEmployed().toString() + "\n";
            
                if(aux.getNext() == null){
                    
                    size++;
                    aux = null;
                }else{
                    
                    aux = aux.getNext();
                }
            }
        
        return x;
    }
    
}
