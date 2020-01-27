/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw12
 */
public class Libro extends Obra {
    //Atributos 
    
    private String editorial;
    private int paginas;
    
    //Constructores

    public Libro() {
    }

    public Libro(String editorial, int paginas, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.editorial = editorial;
        this.paginas = paginas;
    }
    
    //get and set

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoEdicion() {
        return anoEdicion;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }
    
    
    
    
}
