/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import javax.swing.JOptionPane;


/**
 *
 * @author 1GDAW05
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String num1 = JOptionPane.showInputDialog("Introduce una nota del 0 al 10:");
            double n1 = Integer.parseInt(num1);
            if  (n1 >= 5 )
                if(n1 <= 10)
                JOptionPane.showMessageDialog(null, "Aprobado");
                else
                 JOptionPane.showMessageDialog(null, "El valor no es correcto");
            else
                JOptionPane.showMessageDialog(null, "Suspenso");
    }
    
}
