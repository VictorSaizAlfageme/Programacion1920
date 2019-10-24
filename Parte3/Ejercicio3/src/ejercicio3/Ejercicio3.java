/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        String cadena = JOptionPane.showInputDialog("Escribe lo que quieras");
        String letra = JOptionPane.showInputDialog("¿De que caracter quieres saber el numero de veces que aparece?");
        for (int x =0; x < cadena.length(); x++){
        if (cadena.charAt(x)==letra.charAt(0))
        contador++;
        
}
 JOptionPane.showMessageDialog(null, "El caracter " +letra +" se muestra " + contador + " veces");

}
}
      
 
