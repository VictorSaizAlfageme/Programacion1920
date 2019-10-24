/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
        boolean condicion = false;
        String nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del alumno");
        do 
        {
        
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce una nota del alumno " + nombre));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce una nota del alumno " + nombre));
        int nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce una nota del alumno " + nombre));
        int nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce una nota del alumno " + nombre));
        int nota5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce una nota del alumno " + nombre));
        int nota6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce una nota del alumno " + nombre));
            
        JOptionPane.showMessageDialog (null, "La media del alumno " + nombre + " es " + (nota1+nota2+nota3+nota4+nota5+nota6) / 6);
        String nombre1 = JOptionPane.showInputDialog(null, "Introduce el nombre del alumno");
        condicion= nombre1.equals("fin");
        }while (condicion==false);     
        
          
        JOptionPane.showMessageDialog(null, "Gracias por usar este programa");  
    } 
}
    

  