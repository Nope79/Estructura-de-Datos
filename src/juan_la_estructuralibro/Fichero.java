package juan_la_estructuralibro;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author Master79
 */
public class Fichero {
    
    // Ya tenemos metodos que leen y escriben, ahora necesito leer lo que se guarda en el tda de libros.
    // el programa debe ser capaza de que si yo modifico el texto, debe de modificarse la interfaz, por lo tanto, 
    // debo de importar acá el jframe para usar el metodo de guardado de libros.
    
    /*
    al iniciarse el jframe debe cargarse la lectura del archivo
    deben de hacerse las corroboraciones necesarias para no agregar basura al arreglo de libros
    en caso de encontrar basura no se agregaría directamente al arreglo y se pasaría a la siguiente linea
    hariamos las separaciones de la siguiente manera. el salto de linea es otra estructura, separariamos por comas los atributos (isbn, titulo, autor, año)
    
    debemos de hacer una wea rara para que 
    la escritura se debe de realizar al agragar un libro en la estructura
    
    cuando se borra un libro con cola, se tiene que realizar una escritura de nuevo, deberia de limpiar todo el texto antes de eso
    para evitar que queden remantentes 
    
    oka, de momento hay que dividir el trabajo por partes
    lo importante es que tendremos el librero vacio, este debe de agregar los libros, al momento de agregarlos escribe en el fichero,
    cuando los elimina, aunque sea solo a uno, este debe de borrar todo lo que tenga el archivo y tomar los datos del arreglo de libros de
    nuevo para volver a escribir los datos, es una manera de actualizarlo.
    
    el jframe debe de cargar la funcion de lectura en sus componentes.
    lo que lee, lo va pasando a el arreglo de libros para que este al final los añada.
    
    en el metodo de agregar, debo de usar el metodo de escribir cada que sea exitoso el metodo, para añadir el texto al fichero
    
    dicha escritura se separara por comas para luego poder leerlas mas comodamente
    
    puedo hacer un metodo de escritura que lo unico que hace es escribir al agregar y otro para reescribir cuando se eliminan o toman libros.
    
    */
    
    public void tokenizer(String x){
        
        StringTokenizer tokens = new StringTokenizer(x, "#");
        
        while(tokens.hasMoreTokens()){
            
            System.out.println(tokens.nextToken());
        }
    }
    
    public void escribirPrueba(){
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            
            fichero = new FileWriter("C:\\Users\\Master79\\Programación\\Estructura de Datos (Java)\\Juan_LA_EstructuraLibro\\fichero\\librero.txt");
            pw = new PrintWriter(fichero);
            
            for(int i = 1; i <= 10; i++){
            
                pw.println("HOLA " + i);
            }
        }catch(Exception e){
            
            e.printStackTrace();
        }finally{
            
            try{
                
                if(null != fichero){
                    
                    fichero.close();
                }
            }catch(Exception e2){
                
                e2.printStackTrace();
            }
        }
    }
    
    public String leerPrueba(){
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        String x = "";
        
        try{
            
            archivo = new File("C:\\Users\\Master79\\Programación\\Estructura de Datos (Java)\\Juan_LA_EstructuraLibro\\fichero\\librero.txt");
            
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            
            // LECTURA DEL ARCHIVO
            
            String linea;
            while((linea = br.readLine()) != null){
                
                x += linea + "#";
            }
        }catch(Exception e){
            
            e.printStackTrace();
        }finally{
            
            try{
                
                if(null != fr){
                    
                    fr.close();
                }
                
            }catch(Exception e2){
                
                e2.printStackTrace();
            }
        }
        
        System.out.println(x);
        return x;
    }
}
