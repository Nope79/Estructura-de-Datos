package juan_la_estructuralibro;

import java.util.Random;

/**
 *
 * @author Master79
 */
public class Libro {
    
    private String titre; // titulo
    private int année; //año
    private String auteur; // autor
    private String isbn;
    
    public Libro(){
        
    }

    public Libro(String titre, int année, String auteur) {
        this.titre = titre;
        this.année = année;
        this.auteur = auteur;
        this.isbn = déclenchementIsbn();
    }
    
    public Libro(String titre, int année, String auteur, String isbn) {
        this.titre = titre;
        this.année = année;
        this.auteur = auteur;
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnnée() {
        return année;
    }

    public void setAnnée(int année) {
        this.année = année;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String déclenchementIsbn /*generarIsbn*/(){
        
        String isbn = "";
        
        Random rand = new Random();
        
        // Nous générons 2 lettres aléatoires (Generamos 2 letras aleatorias)
        for (int i = 0; i < 2; i++) {
            char lettre /*letra*/ = (char) (rand.nextInt(26) + 'A'); // Plage de A à Z en ASCII (Rango de A a Z en ASCII)
            isbn += lettre;
        }

        // Nous générons trois nombres aléatoires (Generamos tres números aleatorios)
        for (int i = 0; i < 3; i++) {
            
            int leNuméro = rand.nextInt(10); // Nombre, de 0 à 9 (Número, del 0 al 9)
            isbn += leNuméro;
        }
        
        return isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "titre=" + titre + ", ann\u00e9e=" + année + ", auteur=" + auteur + ", isbn=" + isbn + '}';
    }
    
}
