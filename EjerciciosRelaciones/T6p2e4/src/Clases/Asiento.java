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
public class Asiento {
    
    private int NumeroAsiento;
    private boolean Estado;
    private String Compartimineto;
    private Pasajero Pasajero;
    private Vuelo Vuelo;

    public Asiento() {
    }

    public Asiento(int NumeroAsiento, boolean Estado, String Compartimineto, Pasajero Pasajero, Vuelo Vuelo) {
        this.NumeroAsiento = NumeroAsiento;
        this.Estado = Estado;
        this.Compartimineto = Compartimineto;
        this.Pasajero = Pasajero;
        this.Vuelo = Vuelo;
    }

       

    public int getNumeroAsiento() {
        return NumeroAsiento;
    }

    public void setNumeroAsiento(int NumeroAsiento) {
        this.NumeroAsiento = NumeroAsiento;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public String getCompartimineto() {
        return Compartimineto;
    }

    public void setCompartimineto(String Compartimineto) {
        this.Compartimineto = Compartimineto;
    }

    public Pasajero getPasajero() {
        return Pasajero;
    }

    public void setPasajero(Pasajero Pasajero) {
        this.Pasajero = Pasajero;
    }
   
    public Vuelo getVuelo() {
        return Vuelo;
    }

    public void setVuelo(Vuelo Vuelo) {
        this.Vuelo = Vuelo;
    }
    
        
    
    public static void Reservar(){
        
    }
    
    public static void Comprar(){
        
    }
    
    public static boolean MostrarDisponibilidad(){
        return false;
        
    }
    
    public static void Desbloquear(){
        
    }
    
    
    
}
