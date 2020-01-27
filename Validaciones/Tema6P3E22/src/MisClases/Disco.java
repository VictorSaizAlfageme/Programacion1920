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
public class Disco extends Obra{
    //Atributos 
    
   private String discografica;
   private int numeroCanciones;
    
    //Constructores

    public Disco() {
    }

    public Disco(String discografica, int numeroCanciones, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.discografica = discografica;
        this.numeroCanciones = numeroCanciones;
    }
    
    //get and set

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
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
