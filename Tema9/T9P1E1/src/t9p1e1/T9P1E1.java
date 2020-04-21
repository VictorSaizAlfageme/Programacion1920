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
    
    
    static ArrayList<Persona> listapersonas = new ArrayList();
    static Persona per = new Persona();
    
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
         
     public static String mostrarPersonas() throws Exception{
       tp = new TablaPersonas(bd.getCon());
       String resultado = tp.ConsultarDatos(nombre);
       return resultado;
   } 
   
   public static void mostrarDatosPersonas() throws Exception{
       tp = new TablaPersonas(bd.getCon());
       listapersonas = tp.VerDatos();
       vreg = new Registrarse();
       per = listapersonas.get(0);
       tp.VerDatos(listapersonas.size(),per.getNombre(),per.getEdad(),per.getProfesion(),per.getTelefono());
       vreg.setVisible(true);
   }
   
   public static void DatosDeLaLista(int posi){
       per = listapersonas.get(posi);
       tp.VerDatos(listapersonas.size(),per.getNombre(),per.getEdad(),per.getProfesion(),per.getTelefono());
   }
    
    
    public static void finalizar() {
        vreg.setVisible(false);
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
        System.exit(0);
    }
    
    
    
      
    
            
}

