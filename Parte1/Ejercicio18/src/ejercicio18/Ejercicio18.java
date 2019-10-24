/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 1;
        int z = 0;
        int a = 0;
        
        String num = JOptionPane.showInputDialog("Introduce un número");
        int n = Integer.parseInt(num);
        
        while (a < n){
        JOptionPane.showMessageDialog(null, a = x+z);
        JOptionPane.showMessageDialog(null, x = a+z);
        JOptionPane.showMessageDialog(null, z = x+a);
        
    }
    }
}
