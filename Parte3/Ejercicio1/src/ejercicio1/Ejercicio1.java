/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio1 {

public static void main(String[] args) {

int contador = 0;
String cadena = JOptionPane.showInputDialog("Escribe lo que quieras");
for (int x =0; x < cadena.length(); x++){
if ((cadena.charAt(x)=='a') || (cadena.charAt(x)=='e') || (cadena.charAt(x)=='i') || (cadena.charAt(x)=='o') || (cadena.charAt(x)=='u'))
contador++;
}
 JOptionPane.showMessageDialog(null, contador);

    

}
}
               

    
    

    
    


