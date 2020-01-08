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
public class Directivo extends Empleado{
    
    private String Categoria;
    private ArrayList<String> subordinados;

    public Directivo(String nombre, int edad, double sueldo, String Categoria) {
        super(nombre, edad, sueldo);
        this.Categoria = Categoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public ArrayList<String> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<String> subordinados) {
        this.subordinados = subordinados;
    }

    
    @Override
    public String toString() {
        return "Directivo{" + "Categoria=" + Categoria + ", subordinados=" + subordinados + '}';
    }
    
    @Override
    public double calcular_salario_neto(){
     double sueldoNeto = (getsueldoBruto()/12)/100 * 20;
     return sueldoNeto;
    }
    
    
}
