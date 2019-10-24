/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW05
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String num1 = JOptionPane.showInputDialog("Introduce una temperatura:");
          double n1 = Integer.parseInt(num1);
          double mult = 1.8*n1 +32;
          JOptionPane.showMessageDialog(null, mult + " ºF");
    }
    
}
