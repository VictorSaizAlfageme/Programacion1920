/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int contador = 0;
    String reves = "";
String cadena = JOptionPane.showInputDialog("Escribe lo que quieras");
for (int x = cadena.length() -1; x >= 0; x--){
reves = reves + cadena.charAt(x);

}

JOptionPane.showMessageDialog(null, reves);
}
}
      
    

