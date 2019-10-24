/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num = JOptionPane.showInputDialog("Introduce un número");
        int n = Integer.parseInt(num);
        
        int contador = 0;
        int x = -1;
        contador = n;
        int z = 0;
        
           
        while (contador>0){
        x = x + 2;
        z = z + x;
        contador = contador -1;
        }
        JOptionPane.showMessageDialog (null, "El numero es " + z);
    }
}


