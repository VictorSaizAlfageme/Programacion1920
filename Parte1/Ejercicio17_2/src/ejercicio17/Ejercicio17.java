/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import javax.swing.JOptionPane;
public class Ejercicio17 {

    
    public static void main(String[] args) {
        int alta=0;
        int baja=10;
        int contador;
        String nombrealto="";
        String nombrebajo="";
        
        for(contador=0;contador<2;contador++){
         String nombre = JOptionPane.showInputDialog(null, "introduce tu nombre");
            int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "introduce tu nota"));
            
          if(nota<0 || nota>10){
          JOptionPane.showMessageDialog(null, "Introduce tu nota entre el 0 y el 10");
                  contador=contador-1;}
          else
           if(nota==alta){
               nombrealto=nombrealto+", "+nombre;}
           else
               if (nota>alta){
                   alta=nota;
                   nombrealto=nombre;}
                else
                   if (nota==baja)
                   {nombrebajo=nombrebajo+", "+nombre;}
                     else
                       if (nota<baja)
                       {baja=nota;
                       nombrebajo=nombre;   
        }
            
    }
                JOptionPane.showMessageDialog(null, "La nota mas alta es de "+nombrealto+" con un "+alta);
                 JOptionPane.showMessageDialog(null, "La nota mas baja es de "+nombrebajo+" con un "+baja);
    }
}
