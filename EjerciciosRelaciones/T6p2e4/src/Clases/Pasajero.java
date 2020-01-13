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
public class Pasajero {
    
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private int Edad;
    private Asiento Asiento;
    private ArrayList<Vuelo> ListaVuelos;
    
    
    public Pasajero() {
    }

    public Pasajero(String Cedula, String Nombre, String Apellido, String Sexo, int Edad, Asiento Asiento, ArrayList<Vuelo> ListaVuelos) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Asiento = Asiento;
        this.ListaVuelos = ListaVuelos;
    }

        

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Asiento getAsiento() {
        return Asiento;
    }

    public void setAsiento(Asiento Asiento) {
        this.Asiento = Asiento;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return ListaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> ListaVuelos) {
        this.ListaVuelos = ListaVuelos;
    }

  
    
    
    public static void AgregarNuevo(){
        
    }
    
    public static void Modificar(){
        
    }
    
    public static void AsignarVuelo(){
        
    }
    
    public static Pasajero Buscar(){
        return null;
        
    }
    
}
