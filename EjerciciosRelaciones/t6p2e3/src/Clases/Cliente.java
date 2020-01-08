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
public class Cliente extends Persona{
    
    private String TelefonoContacto;

    public Cliente(String nombre, int edad, String telefono) {
        super(nombre,edad);
        TelefonoContacto = telefono;
    }

    public Cliente(String TelefonoContacto) {
        this.TelefonoContacto = TelefonoContacto;
    }

    public String getTelefonoContacto() {
        return TelefonoContacto;
    }

    public void setTelefonoContacto(String TelefonoContacto) {
        this.TelefonoContacto = TelefonoContacto;
    }

    @Override
    public String mostrar() {
        return this.getNombre() + "" + this.getEdad() + "" + this.getTelefonoContacto();
    }
    
    
    
}
