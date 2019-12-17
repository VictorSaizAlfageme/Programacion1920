/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Egibide
 */
public class Persona {
    // Atributos (privados)
    private String nombre;
    public int edad;
    private String DNI;
    private String Apellidos;
    
    
   /*Relacion cardinalidad 1
    private Coche Coche;
    
    public Coche getCoche() {
        return Coche;
    }
        
    public void setCoche(Coche Coche) {
        this.Coche = Coche;
    }
    */
    
    /*Relacion con cardinalidad muchos*/
    
    private ArrayList<Coche> lista;

    public ArrayList<Coche> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Coche> lista) {
        this.lista = lista;
    }
    
    public void setUnCoche(Coche Coche){
        lista.add(Coche);
    }
    
    
    // Métodos
    
    // CONSTRUCTOR  

    public Persona() {
    }

    public Persona(String nombre, int edad, String DNI, String Apellidos) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.Apellidos = Apellidos;
    }

    public Persona(String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }
   

    public Persona(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        
    }
    
    // GET
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public String getApellidos() {
        return Apellidos;
    }


        

    // SET
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }


        
    // OTROS METODOS
    
    public boolean isMayor(){
        return (edad >= 18);
    }
    
}
