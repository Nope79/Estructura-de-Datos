package juan_la_estructura3;

import java.util.Random;

/**
 *
 * @author Master79
 */
public class Producto {
    
    private String nombre;
    private String categoria;
    private double precio;
    private String clave;

    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.clave = genClave();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public String genClave(){
        
        String x = ""; 
        x += this.categoria.charAt(0);
        
        Random r = new Random();
        int n = r.nextInt(0, 10);
        
        x += n;
        
        n = r.nextInt(0, 10);
        
        x += n;
        
        x += this.nombre.charAt(0);
        
        n = r.nextInt(1, 6);
        
       // (n == 1) ? x += "A" : (n == 2) ? x += "E" : (n == 3) ? x += "I" : (n == 4) ? x += "O" : x += "U";
        
       if(n == 1){
           
           x += "A";
       }
       
       else if(n == 2){
           
           x += "E";
       }
       
       else if(n == 3){
           
           x += "I";
       }
       
       else if(n == 4){
           
           x += "O";
       }else{
           
           x += "U";
       }
        
        return x;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", clave=" + clave + '}';
    }
    
}