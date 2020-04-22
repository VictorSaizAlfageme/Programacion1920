/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.*;
import Vista.*;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author victor
 */
public class Evento {
    
    private String Nombre;
    private Lugares Lugar;
    private Date Fecha;
    private LocalTime HoraInicio;
    private LocalTime HoraFin;
    private int Aforo;

    public Evento() {
    }

    public Evento(String Nombre, Lugares Lugar, Date Fecha, LocalTime HoraInicio, LocalTime HoraFin, int Aforo) {
        this.Nombre = Nombre;
        this.Lugar = Lugar;
        this.Fecha = Fecha;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
        this.Aforo = Aforo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Lugares getLugar() {
        return Lugar;
    }

    public void setLugar(Lugares Lugar) {
        this.Lugar = Lugar;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public LocalTime getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(LocalTime HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public LocalTime getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(LocalTime HoraFin) {
        this.HoraFin = HoraFin;
    }

    public int getAforo() {
        return Aforo;
    }

    public void setAforo(int Aforo) {
        this.Aforo = Aforo;
    }
    
    
    
    
}
