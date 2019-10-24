/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import javax.swing.JOptionPane;
import excepciones.*;

/**
 *
 * @author 1gdaw05
 */
public class Ejercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean pregunta = false;
        
        while (pregunta == false){
        try
        {
            
        
        String operacion = JOptionPane.showInputDialog("¿Que deseas realizar?"
                +"\n1.- Sumar dos numeros."
                +"\n2.- Restar dos numeros." 
                +"\n3.- Visualizar la tabla de multiplicar de un numero." 
                +"\n4.- Visualizar el cociente y el resto de una division." 
                +"\n5.- Salir del programa.");
         int ope = Integer.parseInt(operacion);
        
        if (operacion.length()!= 1)
                    throw new MuchosCaracteresException();
        pregunta = true;
           
        }catch (MuchosCaracteresException e){
                JOptionPane.showMessageDialog(null, "El número solo puede ser de 1 digito");
            }
        }
            
            
       
        boolean correcto = false;
       
        switch (ope) {
            case 1:
                try
                {
                while (correcto == false) {
                String suma1 = JOptionPane.showInputDialog("Introduce un número");
                if (suma1.length()!= 2)
                    throw new MuchosCaracteresException();
                int s1 = Integer.parseInt(suma1);
                
                String suma2 = JOptionPane.showInputDialog("Introduce otro número");
                if (suma2.length()!= 2)
                    throw new MuchosCaracteresException();
                int s2 = Integer.parseInt(suma2);
                JOptionPane.showMessageDialog(null, "El resultado es de " + (s1 + s2));
                correcto = true;
                break;
               
                }
                } catch(MuchosCaracteresException e){
                JOptionPane.showMessageDialog(null, "El número solo puede ser de 2 digitos");
            }
                
            
            
            case 2:
                String resta1 = JOptionPane.showInputDialog("Introduce un número");
                int r1 = Integer.parseInt(resta1);
                String resta2 = JOptionPane.showInputDialog("Introduce otro número");
                int r2 = Integer.parseInt(resta2);
                JOptionPane.showMessageDialog(null, "El resultado es de " + (r1 - r2));
                
                break;
                
            case 3:
                String multi1 = JOptionPane.showInputDialog("Introduce un número para que te muestre la tabla de multiplicar");
                int m1 = Integer.parseInt(multi1);
                for ( int contador = 0; contador < 11; contador++) {
                    JOptionPane.showMessageDialog(null, contador +" x " + m1 + " es " + (m1 * contador));
                }
                break;
                            
            case 4: 
                String numero1 = JOptionPane.showInputDialog("Introduce un número");
                int x1 = Integer.parseInt(numero1);
                String numero2 = JOptionPane.showInputDialog("Introduce otro número");
                int x2 = Integer.parseInt(numero2);
                
                JOptionPane.showMessageDialog(null, "El resto de la división es " + x1%x2);
                JOptionPane.showMessageDialog(null, "El cociente de la división es " + x1/x2);


                break;
                
            case 5:
                JOptionPane.showMessageDialog(null, "Gracias por haber utilizado este programa");
                
                break;
        }
       
     
    }
    
}
