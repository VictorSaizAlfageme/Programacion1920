/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9p1e1;
import Modelo.*;
import Vista.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author victor
 */
public class T9P1E1 {
    
    private static BaseDatos bd;
    
    private static TablaPersonas tp;
    private static Opciones vm;
    private static Registrarse vreg;
    
    private static Persona p;

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      
         try {
            bd = new BaseDatos();
            bd.conectar();

            vm = new Opciones();
            vm.setLocationRelativeTo(null);
            vm.setVisible(true);

        }
        catch(Exception e)
        {
            bd.desconectar();
            System.out.println(e.getMessage());
        }
         
                
       
     }
     
     public static void mostrarRegistro()
    {
        vm.setVisible(false);
        vreg = new Registrarse();
        vreg.setLocationRelativeTo(null);
        vreg.setVisible(true);
    }

     
    public static void insertarPersona(String Nombre,String Edad,String Profesion,String Telefono) throws Exception {
           // Insertar una persona
                p = new Persona(Nombre,Edad,Profesion,Telefono);
                tp.insertar(p);
    }
    
    
    public static void mostrarDatosPersonas() {
        String nombre = JOptionPane.showInputDialog(null, "Escribe el Nombre de la persona");
        vm.setVisible(false);
        vreg.setVisible(true);
        Registrarse.mostrardatos(nombre, p.getEdad(), p .getNombre(), p.getProfesion(), p.getTelefono());
        
    }
     
     
    public static void mostrarPersonas() {
        int x;

        JOptionPane.showInputDialog(null, "");
        
    }
    
    
    public static void finalizar() {
        vreg.setVisible(false);
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
        System.exit(0);
    }
    
    
    
      
    
            
}

