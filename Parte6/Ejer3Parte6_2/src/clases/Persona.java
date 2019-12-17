/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author 1gdaw07
 */
public class Persona {
    private String nombre;
    private String dNacimiento;
    private String mNacimiento;
    private String aNacimiento;
    private String direccion;
    private String codigoPostal;
    private String ciudad;

    public Persona() {

    }

    public Persona(String nombre, String dNacimiento, String mNacimiento, String aNacimiento, String direccion, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.aNacimiento = aNacimiento;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getdNacimiento() {
        return dNacimiento;
    }

    public String getmNacimiento() {
        return mNacimiento;
    }

    public String getaNacimiento() {
        return aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setdNacimiento(String dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public void setmNacimiento(String mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public void setaNacimiento(String aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dNacimiento=" + dNacimiento + ", mNacimiento=" + mNacimiento + ", aNacimiento=" + aNacimiento + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
