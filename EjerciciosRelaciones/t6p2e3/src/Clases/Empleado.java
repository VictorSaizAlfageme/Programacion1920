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
public class Empleado extends Persona{
    
    private double sueldoBruto;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre,edad);
        this.sueldoBruto = sueldo;
    }
    public Empleado() {
    }

    public Empleado(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getsueldoBruto() {
        return sueldoBruto;
    }

    public void setsueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String mostrar() {
        return this.getNombre() + "" + this.getEdad() + "" + this.getsueldoBruto();
    }
    
    public double calcular_salario_neto(){
     double sueldoNeto = (getsueldoBruto()/12)/100 * 20;
     return sueldoNeto;
    }
    
    
    
    
    
    
}
