/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 1gdaw07
 */
public class Vuelo {
    
    private int NumeroVuelo;
    private String HoraSalida;
    private String HoraLlegada;
    private String LugarOrigen;
    private String LugarDestino;
    private Date FechaSalida;
    private Date FechaRegreso;
    private String TipoVuelo;
    private Ciudad Ciudad;
    private Avion Avion;
    private Piloto Piloto;
    private Pasajero Pasajero;
    private ArrayList<Asiento> ListaAsientos;
    

    
    public Vuelo() {
    }

    public Vuelo(int NumeroVuelo, String HoraSalida, String HoraLlegada, String LugarOrigen, String LugarDestino, Date FechaSalida, Date FechaRegreso, String TipoVuelo, Ciudad Ciudad, Avion Avion, Piloto Piloto, Pasajero Pasajero, ArrayList<Asiento> ListaAsientos) {
        this.NumeroVuelo = NumeroVuelo;
        this.HoraSalida = HoraSalida;
        this.HoraLlegada = HoraLlegada;
        this.LugarOrigen = LugarOrigen;
        this.LugarDestino = LugarDestino;
        this.FechaSalida = FechaSalida;
        this.FechaRegreso = FechaRegreso;
        this.TipoVuelo = TipoVuelo;
        this.Ciudad = Ciudad;
        this.Avion = Avion;
        this.Piloto = Piloto;
        this.Pasajero = Pasajero;
        this.ListaAsientos = ListaAsientos;
    }

    public int getNumeroVuelo() {
        return NumeroVuelo;
    }

    public void setNumeroVuelo(int NumeroVuelo) {
        this.NumeroVuelo = NumeroVuelo;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(String HoraLlegada) {
        this.HoraLlegada = HoraLlegada;
    }

    public String getLugarOrigen() {
        return LugarOrigen;
    }

    public void setLugarOrigen(String LugarOrigen) {
        this.LugarOrigen = LugarOrigen;
    }

    public String getLugarDestino() {
        return LugarDestino;
    }

    public void setLugarDestino(String LugarDestino) {
        this.LugarDestino = LugarDestino;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public Date getFechaRegreso() {
        return FechaRegreso;
    }

    public void setFechaRegreso(Date FechaRegreso) {
        this.FechaRegreso = FechaRegreso;
    }

    public String getTipoVuelo() {
        return TipoVuelo;
    }

    public void setTipoVuelo(String TipoVuelo) {
        this.TipoVuelo = TipoVuelo;
    }

    public Ciudad getCiudad() {
        return Ciudad;
    }

    public void setCiudad(Ciudad Ciudad) {
        this.Ciudad = Ciudad;
    }

    public Avion getAvion() {
        return Avion;
    }

    public void setAvion(Avion Avion) {
        this.Avion = Avion;
    }

    public Piloto getPiloto() {
        return Piloto;
    }

    public void setPiloto(Piloto Piloto) {
        this.Piloto = Piloto;
    }

    public Pasajero getPasajero() {
        return Pasajero;
    }

    public void setPasajero(Pasajero Pasajero) {
        this.Pasajero = Pasajero;
    }

    public ArrayList<Asiento> getListaAsientos() {
        return ListaAsientos;
    }

    public void setListaAsientos(ArrayList<Asiento> ListaAsientos) {
        this.ListaAsientos = ListaAsientos;
    }

    

    
    
    
    public static void Reservar(){
        
    }
    
    public static void Modificar(){
        
    }
    
    public static void Eliminar(){
                
    }
    
    public static Vuelo Buscar(){
        return null;
        
    }
    
    
}
