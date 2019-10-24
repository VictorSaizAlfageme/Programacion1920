/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int apto = 0;
        int apta = 0;
        int cont = 0;
        
        while (cont<2)
        {   
            
        String genero = JOptionPane.showInputDialog("Introduce un genero");
        String alt = JOptionPane.showInputDialog("Introduce una altura");
        Double alt1 = Double.parseDouble(alt);
        String pes = JOptionPane.showInputDialog("Introduce un peso");
        Double pes1 = Double.parseDouble(pes);
        if (genero.equals ("V")){
            if (alt1 > 170 && pes1 > 70){
                apto = apto + 1;
                cont=cont+1;
            }
            else
                cont=cont+1;
        }
        else{
            if (alt1 > 160 && pes1 > 60){
                apta = apta + 1;
                cont = cont + 1;
            }
            else
                 cont = cont +1;   
                    }
         
        
       
         

       
        
        
        
        
            
       
        
        
       
     
    }
    JOptionPane.showMessageDialog( null ,"Número de alumnas aptas "+apta);
    JOptionPane.showMessageDialog( null, "Número de alumnos aptos "+apto);
}
}
