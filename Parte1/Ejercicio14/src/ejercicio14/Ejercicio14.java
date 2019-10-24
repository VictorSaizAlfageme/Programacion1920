/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import javax.swing.JOptionPane;


/**
 *
 * @author 1GDAW05
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int total = 0;
        int cont = 0;
        
        while (cont<10)
        {   
             String num = JOptionPane.showInputDialog("Introduce un número");
             int n = Integer.parseInt(num);
             total = total + n;
             cont = cont + 1;
        
        }
        JOptionPane.showMessageDialog( null ,"El resultado de la suma es:  " + total );
        
        }
    }
    
