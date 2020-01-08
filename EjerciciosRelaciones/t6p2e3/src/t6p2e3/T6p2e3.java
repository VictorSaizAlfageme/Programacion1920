/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p2e3;

import Clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class T6p2e3 {
 public static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
 private static ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();
 private static ArrayList<Cliente> listaCliente  = new ArrayList<Cliente>();
 private static ArrayList<Directivo> listaDirectivo  = new ArrayList<Directivo>();
 private static ArrayList<Empresa> listaEmpresa = new ArrayList<Empresa>();;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    
        
      try{
          crearEmpleado();
          crearCliente();
          mostrarPersonas();
          mostrarEmpleado();
          mostrarCliente();
          crearDirectivo();
          calcularsalario();
          crearEmpresa();
      }
      catch(Exception e)
      {
          javax.swing.JOptionPane.showMessageDialog(null,e.getClass());
      }
    }
    
   
   public static void crearEmpleado() throws Exception{
        
       Empleado Empleado1 = new Empleado("Ander",41, 20016.65);
       Empleado Empleado2 = new Empleado("Juan",21, 13652.87);
       Empleado Empleado3 = new Empleado("Pepe",42, 9767.68);
       Empleado Empleado4 = new Empleado("Ainhoa",31, 17858.54);
       
       listaPersonas.add(Empleado1);
       listaPersonas.add(Empleado2);
       listaPersonas.add(Empleado3);
       listaPersonas.add(Empleado4);
       
       listaEmpleado.add(Empleado1);
       listaEmpleado.add(Empleado2);
       listaEmpleado.add(Empleado3);
       listaEmpleado.add(Empleado4);
       
                 
}
   
    public static void crearCliente() throws Exception{
        
     Cliente Cliente1 = new Cliente("Pepi",19, "698157421");
     Cliente Cliente2 = new Cliente("Marioneta",43, "633125487");
     Cliente Cliente3 = new Cliente("Cantimplora",23, "698578354");
     Cliente Cliente4 = new Cliente("Mago",21, "6987584241");
     
     listaPersonas.add(Cliente1);
     listaPersonas.add(Cliente2);
     listaPersonas.add(Cliente3);
     listaPersonas.add(Cliente4);
     
     listaCliente.add(Cliente1);
     listaCliente.add(Cliente2);
     listaCliente.add(Cliente3);
     listaCliente.add(Cliente4);
     
}
    
     public static void mostrarPersonas() throws Exception{
         JOptionPane.showMessageDialog(null, "Todas las Personas");
         
         for (Persona personas : listaPersonas){
         String mostrar = personas.mostrar();
         JOptionPane.showMessageDialog(null, mostrar);
         }
     }
     
      public static void mostrarEmpleado() throws Exception{
         JOptionPane.showMessageDialog(null, "Todas los Empelados");
         
         for (Empleado empleado : listaEmpleado){
         String mostrar = empleado.mostrar();
         JOptionPane.showMessageDialog(null, mostrar);
         }
     }
      
       public static void mostrarCliente() throws Exception{
         JOptionPane.showMessageDialog(null, "Todas los Clientes");
         
         for (Cliente cliente : listaCliente){
         String mostrar = cliente.mostrar();
         JOptionPane.showMessageDialog(null, mostrar);
         }
     }
       
     public static void crearDirectivo() throws Exception{
        
       Directivo Director1 = new Directivo("Victor",19, 600254.36, "Director");
       Directivo Director2 = new Directivo("Victor",19, 87984.36, "Segundo director");
                 
}
    
     public static void calcularsalario() throws Exception{
         for (Empleado empleado : listaEmpleado){
         double sueldoNetoEmpleado = empleado.calcular_salario_neto();
         JOptionPane.showMessageDialog(null, "Sueldo de los empleados" + sueldoNetoEmpleado);
         }
         
         for (Directivo director : listaDirectivo){
         double sueldoNetoDirector = director.calcular_salario_neto();
         JOptionPane.showMessageDialog(null, "Sueldo de los directores" + sueldoNetoDirector);
         }
         
     }
     
     
   
     
      public static void crearEmpresa() throws Exception{
        
        Empresa Empresa1 = new Empresa("Conforama",getlistaCliente());
        Empresa Empresa1 = new Empresa("Mercedes",19, 600254.36, "Director");
       
               
}
    
  
}
