/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW05
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int z = 0;
        int x = 0;
        String stop = "Si" ;
                
        
        while (stop.equals ("Si")){
       String num = JOptionPane.showInputDialog("Introduce una nota");
       int n = Integer.parseInt(num);
        if (n >= 5 && n<=10)
            x = x+1;
        else
            z = z+1;
        
              
         
        stop = JOptionPane.showInputDialog("¿Quieres continuar?");
        }
        JOptionPane.showMessageDialog(null, "Han aprobado "+ x );
            
    }
    
}
