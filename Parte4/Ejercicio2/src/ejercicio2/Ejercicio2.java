/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import javax.swing.JOptionPane;
import java.util.Arrays;

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
        
        int max=10;
        int suma=0;
        int size = Integer.parseInt(JOptionPane.showInputDialog("Escribe el tamaño del array"));
         
        int [] array = new int[size];
        
        for(int x=0; x < size; x++){
        array[x]= (int)(Math.random()*max);
        
    }
        for(int x=0; x < size; x++){
        JOptionPane.showMessageDialog(null, array[x]);
        suma = suma + array[x];
        }
        
        JOptionPane.showMessageDialog(null, suma);
}
}
