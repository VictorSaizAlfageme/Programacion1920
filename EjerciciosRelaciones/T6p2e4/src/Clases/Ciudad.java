/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw07
 */
public class Ciudad {
    
    private String CodigoNombre;
    private String Nombre;
    private ArrayList<Vuelo> ListaVuelos;

    public Ciudad() {
    }

    public Ciudad(String CodigoNombre, String Nombre, ArrayList<Vuelo> ListaVuelos) {
        this.CodigoNombre = CodigoNombre;
        this.Nombre = Nombre;
        this.ListaVuelos = ListaVuelos;
    }

    

    public String getCodigoNombre() {
        return CodigoNombre;
    }

    public void setCodigoNombre(String CodigoNombre) {
        this.CodigoNombre = CodigoNombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return ListaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> ListaVuelos) {
        this.ListaVuelos = ListaVuelos;
    }
    
    
    
    
    public static void AgregarNuevo(){
        
    }
    
    public static Ciudad Obtener(){
        return null;
        
    }
    
}
