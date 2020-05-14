package Modelo.UML;

import java.util.ArrayList;

public class Persona {
    private String dni;
    private String nombre;
    private String ape1;
    private String ape2;
    private String telefono;
    
    /*
       No es necesario.
        private ArrayList<Acontecimiento> listaAcontecimientos;
    
    */

    public Persona(String dni, String nombre, String apel1, String apel2, String tel) {
        this.dni = dni;
        this.nombre = nombre;
        this.ape1 = apel1;
        this.ape2 = apel2;
        this.telefono = tel;
    }

    public Persona() {
       
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
