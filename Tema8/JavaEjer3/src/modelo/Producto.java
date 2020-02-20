/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Joel Encinas
 */
public class Producto {

    private String nombre;
    private String precioUnitario;
    private String numUnidades;

    public Producto() {
    }

    public Producto(String nombre, String precioUnitario, String numUnidades) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.numUnidades = numUnidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(String numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        return "Producto = " + nombre + "   Precio = " + precioUnitario + "   Unidades = " + numUnidades;
    }

}
