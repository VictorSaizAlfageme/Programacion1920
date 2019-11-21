/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author Egibide
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int num;
        int numero;
        String total="";
        int fallos =0;
        
        int pregunta;
        int[] ventas = new int [10];
        int[] productos = {10, 23, 30, 47, 55, 65, 135, 256, 526, 663} ;
       
        
        do{
        do{
            
        fallos = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el producto que se ha comprado"
        + "\n 10 "
        + "\n 23 "        
        + "\n 30 "
        + "\n 47 "        
        + "\n 55 "       
        + "\n 65 "        
        + "\n 135 "        
        + "\n 256 "        
        + "\n 526 "
        + "\n 663 "
        ));
                   
        
            
       
        for(int contar =0; contar<productos.length; contar++){
        if(productos[contar]!=num){
           fallos++;
            }
        }
        }while(fallos==10);
        
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad que deseas de ese producto"));
            
            for (int y =0; y<productos.length; y++ ){
            
            if (productos[y]==num){
                ventas[y] = ventas[y] + numero;
               
            }
            }
         pregunta = JOptionPane.showConfirmDialog(null, "¿Quieres añadir más productos?");
            
        }while(pregunta==0);
       
        for (int z =0;z<productos.length;z++){
            if(ventas[z]!=0){
        total = total + "Del producto " + productos[z] + " disponemos de " + ventas[z] + "\n";
            }
        }
        
       
        
      JOptionPane.showMessageDialog(null, total);
        
    }
    
}
