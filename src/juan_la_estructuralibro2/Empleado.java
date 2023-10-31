package juan_la_estructuralibro2;

import java.util.Random;

/**
 *
 * @author Master79
 */
public class Empleado {
    
    private String nombre;
    private int edad;
    private String id;
    private String departamento;
    private String apePaterno;
    private String apeMaterno;

    public Empleado(String nombre, int edad, String departamento, String apePaterno, String apeMaterno) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.id = genId();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", departamento=" + departamento + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno + '}';
    }
    
    public String genId(){
        
        String identidad = "";
        identidad += this.departamento.charAt(0);
        
        
        Random x = new Random();
        
        int r = x.nextInt(0, 10);
        
        identidad += r;
        
        r += x.nextInt(0, 10);
        
        identidad += r;

        identidad += "-";
        identidad += this.apePaterno.substring(0, 2);
        identidad += this.nombre.charAt(0);
        
        identidad = identidad.toUpperCase();
        return identidad;
    }
}
