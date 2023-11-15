package juan_la_estructura3;

/**
 *
 * @author Master79
 */
public class ListaDoble {
    
    private ElementoD first;
    private ElementoD last;
    private Producto dato;
    private int size;

    public ListaDoble() {
        this.first = first;
        this.last = last;
        this.dato = dato;
    }    
    
    /*
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
    
    
    public void add(Producto nuevo){
        
        if(empty()){
            
            this.first = new (nuevo);
            this.last = first;
            size++;
        }else{
            
            ElementoD aux = first;
            
            while(aux != null){
                
                if(aux.getNext() == null){
                    
                    aux.setNext(new ElementoD(nuevo));
                    size++;
                    aux = null;
                }else{
                    
                    aux = aux.getNext();
                }
            }
            
            while(aux != first){
                
                aux = aux.getBefore();
            }
        }
    }
    
    public void add(Producto nuevo) {
        if (empty()) {
            
            this.first = new ElementoD (nuevo);
            this.last = first;
            this.size++;
        } else {
            ElementoD aux = first;
            while (aux != null) {
                if (aux.getNext() == null) {
                    aux.setNext(new ElementoD (nuevo));
                    this.last = aux.getNext();
                    this.last.setBefore(aux);
                    this.size++;
                    break;
                } else {
                    aux = aux.getNext();
                }
            }
        }
    }*/
    
    public void add(Producto nuevo){
        
       
        
        if(empty()){
            this.first= new ElementoD (nuevo);
            this.last= first;
            this.size++;
        }else{
            ElementoD aux= first;
            while(aux!=null){
                if(aux.getNext()==null){
                    aux.setNext(new ElementoD (nuevo));
                    this.last= aux.getNext();
                    this.last.setBefore(aux);
                    this.size++;                      break;  //aux.null;
                }else{
                   aux= aux.getNext();
                }
            }
            
        }
    }
    
    public void delete(String name){
        
        if(first.getDato().getNombre().equals(name)){
            
            first = first.getNext();
            first.setBefore(null);
            size--;
        }
        
        else if(last.getDato().getNombre().equals(name)){
            
            last = last.getBefore();
            last.setNext(null);
            size--;
        }else{
            
            ElementoD aux = first;
            
            while(aux != null){
                
                if(aux.getNext().getDato().getNombre().equals(name)){
                    
                    aux.setNext(aux.getNext().getNext());
                    aux.getNext().setBefore(aux);
                    size--;
                }else{
                    
                    aux = aux.getNext();
                }
            }
        }
    }
    
    public void correrInverso(ElementoD x){
        
        System.out.println(x.getDato());
    }
    
    public boolean empty(){
        
        return this.size == 0;
    }
    
    public String toStringchistoso(){
        
        String x = "";
        
        ElementoD aux = last;
        
        while (aux != null) {
            
            x += aux + "\n";
            aux = aux.getBefore();
        }
        
        return x;
    }
    
    public String toString() {
        
        String x = "";
        
        ElementoD aux = first;
        
        while (aux != null) {
            
            x += aux + "\n";
            aux = aux.getNext();
        }
        
        return x;
    }
}