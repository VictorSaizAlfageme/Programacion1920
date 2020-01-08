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
public class Empresa {
    
    private String nombre;
    private ArrayList<String> listaEmpleado;
    private ArrayList<String> listaCliente;

    public Empresa() {
    }

       
    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Empresa(String nombre, ArrayList<String> listaEmpleado, ArrayList<String> listaCliente) {
        this.nombre = nombre;
        this.listaEmpleado = listaEmpleado;
        this.listaCliente = listaCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<String> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public ArrayList<String> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<String> listaCliente) {
        this.listaCliente = listaCliente;
    }
    
   
        
    
    
    
}
