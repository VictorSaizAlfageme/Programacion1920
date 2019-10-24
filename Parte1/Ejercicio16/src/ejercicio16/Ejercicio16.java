/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW05
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 0;
        int total = 0;
        String stop = "No" ;
        
     
        while (stop.equals("No") || stop.equals("no")){
        String edad = JOptionPane.showInputDialog("Introduce una edad");
        int edad1 = Integer.parseInt(edad);
            total = total + edad1;
            x = x + 1;
            stop = JOptionPane.showInputDialog("¿Quieres parar?");
            
            
            if (stop.equals("Si") || stop.equals("si" ))
                JOptionPane.showMessageDialog(null,"La media de edad es: " + total/x);
            
                
                
                
            }
        
        }
}
    

