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
public class Avion {
    
    private String Aerolinea;
    private String CodigoAvion;
    private int NumeroAsientos;
    private String Compartimientos;
    private ArrayList<Vuelo> ListaVuelos;

    public Avion() {
    }

    public Avion(String Aerolinea, String CodigoAvion, int NumeroAsientos, String Compartimientos, ArrayList<Vuelo> ListaVuelos) {
        this.Aerolinea = Aerolinea;
        this.CodigoAvion = CodigoAvion;
        this.NumeroAsientos = NumeroAsientos;
        this.Compartimientos = Compartimientos;
        this.ListaVuelos = ListaVuelos;
    }

    

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public String getCodigoAvion() {
        return CodigoAvion;
    }

    public void setCodigoAvion(String CodigoAvion) {
        this.CodigoAvion = CodigoAvion;
    }

    public int getNumeroAsientos() {
        return NumeroAsientos;
    }

    public void setNumeroAsientos(int NumeroAsientos) {
        this.NumeroAsientos = NumeroAsientos;
    }

    public String getCompartimientos() {
        return Compartimientos;
    }

    public void setCompartimientos(String Compartimientos) {
        this.Compartimientos = Compartimientos;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return ListaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> ListaVuelos) {
        this.ListaVuelos = ListaVuelos;
    }
    
    
    
      public static void AsignarVuelo(){
          
      }
      
      public static Avion Obtener(){
        return null;
            
        }
    
      public static void CancelarVuelo(){
          
      }
}
