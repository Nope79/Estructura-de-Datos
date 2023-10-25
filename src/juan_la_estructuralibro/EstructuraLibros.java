package juan_la_estructuralibro;

/**
 *
 * @author Master79
 */
public class /*StructureLivres*/EstructuraLibros {
    
    private Libro[] librero;
    private int index;
    
    public /*StructureLivres*/EstructuraLibros(){
        
        
        this.librero = new Libro[10];
        this.index = 0;
    }

    public Libro[] getLibrero() {
        return librero;
    }

    public void setLibrero(Libro[] librero) {
        this.librero = librero;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
    // Verificar que no sea un libro repetido
    // buscalibro() true si se agrega
    // Si la estructuratiene espacio, agregamos el libro
    // si ya esta llena, extendemos dos espacios en la estructura
    public boolean add(Libro x){
        
        if(buscarchido(x) == false){
            
            if(full() == true){
            
                extend();
            }
            
            librero[index++] = x;
            
            System.out.println("LIBRO AÑADIDO");
            return true;
        }else{
            
            System.out.println("NO SE HA AÑADIDO EL LIBRO, PUES YA ESTÁ EN EL LIBRERO :/");
        }
        return false;
    }
    
    // Verificar que podemos tener coincidencia
    // autor, titulo, pero no en un año, no tenemos el libro, retornar true
    public boolean buscarchido(Libro x){
        
        for(int i = 0; i < index; i++){
            
            if(librero[i] != null && librero[i].getAuteur().equals(x.getAuteur()) && 
                    
                    librero[i].getTitre().equals(x.getTitre()) && librero[i].getAnnée() == x.getAnnée()){
                
                return true;
            }
        }
        
        System.out.println("hola");
        return false;
    }
    
    public boolean buscarLibro(Libro x){
        
        for(int i = 0; i < index; i++){
            
            if(librero[i] != null && librero[i].equals(x)){
                
                return true;
            }
        }
        
        return false;
    }
    
    public void extend(){
        
        Libro arreglo[] = new Libro[librero.length + 2];
        
        for(int i = 0; i < index; i++){
            
            arreglo[i] = librero[i];
        }
        
        librero = arreglo;
    }
    
    public void eliminarPila(){
        
       if(empty() != true){
           
           librero[index - 1] = null;
           index--;
       }
        
        // Elimina el ultimo (index)
    }
    
    public void eliminarCola(){
        
        //elimina el primero en entrar y recorre los demas (index)
        
        if(empty() != true){
            
            for(int i = 0; i < index - 1; i++){
            
            librero[i] = librero[i + 1];
        }
        
        librero[index - 1] = null;
        index--;
        }
    }
    
    public void eliminarX(String title){
        
        if(searchTitle(title) != -1){
            
            System.out.println("BUSCANDO LIBRO...");
            
            for(int i = searchTitle(title); i < index; i++){
                
                librero[i] = librero[i + 1];
            }
        
            librero[index - 1] = null;
            index--;
            
            System.out.println("LIBRO ELIMINADO EXITOSAMENTE");
        }else{
            
            System.out.println("ESTE LIBRO NO SE ENCUENTRA DENTRO DEL LIBRERO");
        }
        //buscaTitle() retorna index
        // quita el libro y recorre el index =D
    }
    
    
    // TRABAJA DE MANERA PARALELA CON ELIMINAR Y AGREGAR
    // busca el primer libro que encuentre con el titulo
    // retorna el index o -1 sino lo encuentra
    public int searchTitle(String title){
        
        for(int i = 0; i < index; i++){
            
            if(librero[i].getTitre().equals(title)){
                
                return i;
            }
        }
        
        return -1;
    }
    
    // metodo que busca, recibe un isbn, retorna libro (obj)
    
    public Libro buscar(String isbn){
        
        for(int i = 0; i < index; i++){
            
            if(librero[i].getIsbn().equals(isbn)){
                
                return librero[i];
            }
        }
        
        return null;
    }
    
    // METODOS BASE
    
    public boolean empty(){
        
        return index == 0;
    }
    
    public boolean full(){
        
        return index == librero.length;
    }

    @Override
    public String toString(){
        
        // contenido completo de la estructura en estructura de tabla
        
        // toda la info
        
        String x = "";
        
        StringBuilder table = new StringBuilder();
        
        x += "+------------------------------------------+--------------------------------+------+-------+\n";
        x += "|Titulo                                    |Autor                           |Año   |ISBN   |\n";
        x += "+------------------------------------------+--------------------------------+------+-------+\n";

        for (int i = 0; i < index; i++) {
            Libro l = librero[i];
            table.append(String.format("| %-40s | %-30s | %-4d | %-5s |\n",l.getTitre(), l.getAuteur(), l.getAnnée(), l.getIsbn()));
        }
        
        x += table;
        x += "+------------------------------------------+--------------------------------+------+-------+\n";

        return x;
    }
    
    public String pila(){
        
        String x = "";
        
        for(int i = index - 1; i >= 0; i--){
            
            Libro p = librero[i];
            
            x += p.getTitre()+ "\n";
        }
        
        return x;
    }
    
    // HACER INTERFAZ
    
    // Ya no hacer interfaz 
    
}
