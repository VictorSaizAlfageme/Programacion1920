package Modelo.UML;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalTime;

public class Acontecimiento {
    // No pongo id en la clase, pero en la base de datos podría tenerlo.
    private String nombre;
    private String lugar;
    private String fecha;
    private String horaI;
    private String horaF;
    private int aforo;

    public Acontecimiento() {
    }

    public Acontecimiento(String nombre, String lugar, String fecha, String horaI, String horaF, int aforo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaI = horaI;
        this.horaF = horaF;
        this.aforo = aforo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraI() {
        return horaI;
    }

    public void setHoraI(String horaI) {
        this.horaI = horaI;
    }

    public String getHoraF() {
        return horaF;
    }

    public void setHoraF(String horaF) {
        this.horaF = horaF;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    
    @Override
    public String toString(){
        return nombre + " " + lugar + " " + fecha + " " + getHoraI() + " " + getHoraF() + " "  + aforo;
    }
}
