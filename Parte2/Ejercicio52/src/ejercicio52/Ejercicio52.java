/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio52;
import javax.swing.JOptionPane;

/**
 *
 * @author Egibide
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        int n;
        int q = 0;
        int w = 1;
        int e = 2;
        int muertos = 0;
        int heridos = 0;
       
        int x = (int)(Math.random()*900+100);
        String aleatorio = Integer.toString(x);
        JOptionPane.showMessageDialog(null,aleatorio);
        
        while((aleatorio.charAt(q)==aleatorio.charAt(w) || (aleatorio.charAt(w)==aleatorio.charAt(e)) || aleatorio.charAt(e)==aleatorio.charAt(q)))
        {
        JOptionPane.showMessageDialog(null, "El número generado automaticamente es erroneo, ahora se generará otro :)");
        int y = (int)(Math.random()*899+100);
        String alea = Integer.toString(y);
        aleatorio = alea;
        JOptionPane.showMessageDialog(null,aleatorio);
        }
            
        boolean condi=false;
        
        do
        {
        String num = JOptionPane.showInputDialog("Intenta acertar el número");
       
            
            
        
        
        if  (aleatorio.charAt(q)==num.charAt(q) && (aleatorio.charAt(w)==num.charAt(w)) && aleatorio.charAt(e)==num.charAt(e))
         {
            JOptionPane.showMessageDialog(null, "¡Has acertado el numero! El número era " + aleatorio);
            condi=true;
         }
          
          else {
            
              if (aleatorio.charAt(q)==num.charAt(q) || aleatorio.charAt(w)==num.charAt(w) && aleatorio.charAt(e)==num.charAt(e))
                muertos = muertos + 2; 
            else
                if (aleatorio.charAt(q)==num.charAt(q) && aleatorio.charAt(w)==num.charAt(w) || aleatorio.charAt(e)==num.charAt(e))
                    muertos = muertos + 2;
                else
                    if (aleatorio.charAt(w)==num.charAt(w) && aleatorio.charAt(q)==num.charAt(q) || aleatorio.charAt(e)==num.charAt(e))            
                        muertos = muertos + 2;
                    else
                        if (aleatorio.charAt(w)==num.charAt(w) || aleatorio.charAt(q)==num.charAt(q) || aleatorio.charAt(e)==num.charAt(e))
                            muertos = muertos + 1;

            if (aleatorio.charAt(q)==num.charAt(w) || aleatorio.charAt(q)==num.charAt(e))
                    heridos = heridos + 1;
            if (aleatorio.charAt(w)==num.charAt(q) || aleatorio.charAt(w)==num.charAt(e))
                    heridos = heridos + 1;
            if (aleatorio.charAt(e)==num.charAt(q) || aleatorio.charAt(e)==num.charAt(w))
                    heridos = heridos + 1;

        
            
            switch (muertos) {
                case 2: 
                    JOptionPane.showMessageDialog(null, "Hay 2 muertos");
                    break;
                    
                case 1: 
                    JOptionPane.showMessageDialog(null, "Hay 1 muertos");
                    break;
                    
                case 0: 
                    JOptionPane.showMessageDialog(null, "No hay muertos");
                    break;
              
            }
            
            switch (heridos) {
                case 3: 
                    JOptionPane.showMessageDialog(null, "Hay 3 heridos");
                    break;
                    
                case 2: 
                    JOptionPane.showMessageDialog(null, "Hay 2 heridos");
                    break;
                    
                case 1: 
                    JOptionPane.showMessageDialog(null, "Hay un herido");
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "No hay heridos");
              
            }
                    
            String pregunta = JOptionPane.showInputDialog("¿Quieres finalizar el juego?");
            condi= pregunta.equals("si");
            }
               
        
        }while (condi==false);     
       
        JOptionPane.showMessageDialog(null, "Gracias por jugar");  
    } 
}
   
    