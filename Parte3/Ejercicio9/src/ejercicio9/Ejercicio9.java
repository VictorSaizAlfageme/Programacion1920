/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import excepciones.*;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toUpperCase;


/**
 *
 * @author Egibide
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    boolean pregunta = false;
    boolean fin = false; 
    
       while (pregunta == false){
       try
        {     
        String nombre = JOptionPane.showInputDialog("Escribe el nombre del cliente");
        
        do{
            int contador = 0;
        int productos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos a comprado?"));
        int precio = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el precio unitario?"));
        String iva = JOptionPane.showInputDialog("¿Cual es el IVA?"
                + "\n 1.Normal 21%"
                + "\n 2.Reducido 10%"
                + "\n 3.Supereducido 4%");
        
        if (iva.equals(1))
            contador= 1;
        else
            if (iva.equals(2))
            contador = 2;
            else
                if (iva.equals(3))
            contador = 3;
                else   
                    if (!iva.equals(3))
                     JOptionPane.showMessageDialog (null, "Escribe un valor del 1 al 3");
        
        JOptionPane.showMessageDialog(null, "NOMBRE :  " + nombre + "\n LINEAS DE DETALLE: " + "\n " + productos + " x " + precio + " = " + (productos*precio));
         
        }while(fin==false);
        
        }
       catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "NO SALGAS");
            }
       
       catch (Exception e){
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
           
       }     
    
    }
    
}
