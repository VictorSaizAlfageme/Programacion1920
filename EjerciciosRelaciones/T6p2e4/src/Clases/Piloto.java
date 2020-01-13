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
public class Piloto {
    
    private String CodigoPiloto;
    private String Nombre;
    private String Apellido;
    private Integer NumeroLicencia;
    private ArrayList<Vuelo> ListaVuelos;

    public Piloto() {
    }

    public Piloto(String CodigoPiloto, String Nombre, String Apellido, Integer NumeroLicencia, ArrayList<Vuelo> ListaVuelos) {
        this.CodigoPiloto = CodigoPiloto;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NumeroLicencia = NumeroLicencia;
        this.ListaVuelos = ListaVuelos;
    }

   

    public String getCodigoPiloto() {
        return CodigoPiloto;
    }

    public void setCodigoPiloto(String CodigoPiloto) {
        this.CodigoPiloto = CodigoPiloto;
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

    public Integer getNumeroLicencia() {
        return NumeroLicencia;
    }

    public void setNumeroLicencia(Integer NumeroLicencia) {
        this.NumeroLicencia = NumeroLicencia;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return ListaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> ListaVuelos) {
        this.ListaVuelos = ListaVuelos;
    }
    
    
    
    
    
    public static void AgregarNuevo(){
        
    }
    
    public static void AsignarVuelo(){
        
    }
     
    public static void CancelarVuelo(){
        
    }
    
    public static void Modificar(){
        
    }
    
    public static Piloto Buscar(){
        
        
        return null;
        
    }
    
    
    
}
