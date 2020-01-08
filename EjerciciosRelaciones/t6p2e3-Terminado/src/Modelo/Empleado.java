package Modelo;

public class Empleado extends Persona{
    
    // notación Camel
    private double sueldoBruto;
    
    // private Director d;
    
    public Empleado(String nombre,int edad,double sueldo)
    {
        // Constructor de la clase padre
        super(nombre,edad);
       // this.nombre = nombre;
        this.sueldoBruto = sueldo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    @Override
    public String mostrar(){
       // return nombre + " " + edad + " " + sueldoBruto;
       return this.getNombre() + " " + this.getEdad() + " " + this.getSueldoBruto();
    }
    
    public Double calcularSalarioNeto(){
        return null;
    }
    
}
