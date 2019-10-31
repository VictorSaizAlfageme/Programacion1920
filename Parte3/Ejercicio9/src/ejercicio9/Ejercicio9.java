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
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toUpperCase;


/**
 *
 * @author Egibide
 */
public class Ejercicio9 {
public static int productos;
public static float precio;
public static float preciosiniva;
public static float precioconiva;
public static float totalsiniva;
public static float totalconiva;
public static String fin;
public static float total;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    
        String fin = "si";       
        int contador = 0;
        int porcentaje = 0;
        int x = 0;
        String detalle ="";
        String ivaa ="";
        
        
        String nombre = JOptionPane.showInputDialog("Escribe el nombre del cliente");
        
        while (fin.equals("si")){
      
        productos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos a comprado?"));
        precio = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el precio unitario?"));
        String iva = JOptionPane.showInputDialog("¿Cual es el IVA?"
                + "\n 1.Normal 21%"
                + "\n 2.Reducido 10%"
                + "\n 3.Supereducido 4%");
       
        
        
        if (iva.equals("1")){
            porcentaje= 1;
            x = 21;
        }
        else
            if (iva.equals("2")){
            porcentaje = 2;
            x = 10;
            }
            else
                if (iva.equals("3")){
            porcentaje = 3;
                x = 4;
                }
                else   
                    if (!iva.equals("3"))
                     JOptionPane.showMessageDialog (null, "Escribe un valor del 1 al 3");
        
       String mas = JOptionPane.showInputDialog("¿Quieres añadir más productos?");
       if (mas.equals("no")){
           fin = "no";
           
       }
       
       preciosiniva = productos*precio;
       precioconiva = (preciosiniva/100)*x;
       detalle = detalle + "\n" + productos +" X "+ precio +" = "+ preciosiniva;
       ivaa = ivaa + "\n" + x + "%" + " de " + precio + " = " + precioconiva;
       totalsiniva = totalsiniva + (precio*productos);
       totalconiva = totalconiva + ((precio*productos)/100*x);
       total = precioconiva+preciosiniva;
        
       }
        
        
        
        
        
        JOptionPane.showMessageDialog(null, "NOMBRE :  " + nombre 
                + "\n LINEAS DE DETALLE: " 
                + "\n" + detalle
                + "\n TOTAL SIN IVA  " + totalsiniva
                + "\n " + ivaa 
                + "\n TOTAL IVA  " + totalconiva
                + "\n TOTAL CON IVA " + total);
         
        
        
        }
       
     
       }     
    
    
    

