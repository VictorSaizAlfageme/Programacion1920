/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW05
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String num1 = JOptionPane.showInputDialog("Introduce un dia del 1 al 7");
            int n1 = Integer.parseInt(num1);
            switch (n1)
            {
                case 1: JOptionPane.showMessageDialog(null, "Lunes");
                break;
                case 2: JOptionPane.showMessageDialog(null, "Martes");
                break;
                case 3: JOptionPane.showMessageDialog(null, "Miercoles");
                break;
                case 4: JOptionPane.showMessageDialog(null, "Jueves");
                break;
                case 5: JOptionPane.showMessageDialog(null, "Viernes");
                break;
                case 6: JOptionPane.showMessageDialog(null, "Sabado");
                break;
                case 7: JOptionPane.showMessageDialog(null, "Domingo");
                break;
                
            }
    }
    
}
