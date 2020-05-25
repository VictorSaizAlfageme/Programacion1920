/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


/**
 *
 * @author victor
 */
public class Plato {
    
    private int CodigoPlato;
    private String Nombre;
    private int Unidades;

    public Plato() {
    }

    
    public Plato(String Nombre) {
        this.Nombre = Nombre;
    }

    public Plato(String Nombre, int Unidades) {
        this.Nombre = Nombre;
        this.Unidades = Unidades;
    }
    
    

    public Plato(int CodigoPlato, String Nombre, int Unidades) {
        this.CodigoPlato = CodigoPlato;
        this.Nombre = Nombre;
        this.Unidades = Unidades;
    }

    public int getCodigoPlato() {
        return CodigoPlato;
    }

    public void setCodigoPlato(int CodigoPlato) {
        this.CodigoPlato = CodigoPlato;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }
    
    
    
   
    
}
