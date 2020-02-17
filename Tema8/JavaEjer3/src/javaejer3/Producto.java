/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejer3;

/**
 *
 * @author 1gdaw07
 */
public class Producto {
    
    public String Nombre;
    public Double Precio;
    public Integer Unidades;

    public Producto() {
    }

    public Producto(String Nombre, Double Precio, Integer Unidades) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Unidades = Unidades;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public Integer getUnidades() {
        return Unidades;
    }

    public void setUnidades(Integer Unidades) {
        this.Unidades = Unidades;
    }

    @Override
    public String toString() {
        return "Nombre = " + Nombre + "\nPrecio = " + Precio + "\nUnidades  =  " + Unidades;
    }
    
}
