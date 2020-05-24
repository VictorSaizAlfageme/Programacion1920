/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class Cliente {
    
    private String DNI;
    private String Nombre;
    private String Telefono;
    private int pedidos;

    public Cliente() {
    }

    
    public Cliente(String DNI, String Nombre, String Telefono) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }
   

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }
    
    
    
}
