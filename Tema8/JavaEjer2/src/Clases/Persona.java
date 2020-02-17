/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gdaw07
 */
public class Persona {
    
    public String Nombre;
    public String Apellido;
    public String DNI;

    public Persona() {
    }

    
    public Persona(String Nombre, String Apellido, String DNI) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Nombre = " + Nombre + "/ Apellido = " + Apellido + "/ DNI = " + DNI;
    }
    
    
    
}
