/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author Egibide
 */
public class Ejercicio7 {
    
    public static String vueltas="";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double total = total();   
        
        
        double[] cambios ={0.01,0.02,0.05,0.10,0.20,0.50,1.00,2.00,5.00,10.00,20.00,50.00,100.00,200.00,500.00} ;
        
        int[] calculo = new int [15];
        
        
        for (int x=cambios.length -1; x>-1;x--){
            do{         
            if (total>=cambios[x]){
                calculo[x]=calculo[x]+1;
                total = total - cambios[x];
            }
                
            }while (total>=cambios[x]);
            
          vueltas = vueltas + "\nBillete/Moneda de " + cambios[x] + " Cantidad a devolver " + calculo[x] + "\n";
            
        }
        
          JOptionPane.showMessageDialog(null,vueltas);
            
    }
        
    public static double total() {
        
        double venta = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del importe"));
      
        double pago = Double.parseDouble(JOptionPane.showInputDialog("Introduce el pago del comprador"));
       
        double total = pago - venta;
        
        return total;
        }

        
        
    }
    

