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
public class Pelicula extends Obra{
    //Atributos
    
    private String productora;
    private int duracion;
    
    //Constructores

    public Pelicula() {
    }

    public Pelicula(String productora, int duracion, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.productora = productora;
        this.duracion = duracion;
    }
    
    //get and set

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
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
