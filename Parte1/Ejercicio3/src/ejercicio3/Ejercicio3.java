/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW05
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1 = JOptionPane.showInputDialog("Introduce un numero:");
        String num2 = JOptionPane.showInputDialog("Introduce otro numero:");
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int mult = 2*n1 + 2*n2;
        JOptionPane.showMessageDialog(null, mult);
    }
    
}
