/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio2;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Egibide
 */
public class Ejericicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean terminar = false;
        
        String segunnvl = "";
        String segunidi = "";
        
        
        ArrayList<ArrayList<Integer>> alumnos = new ArrayList<ArrayList<Integer>>();
      
        
        alumnos.add(0, new ArrayList<Integer>());   
        alumnos.add(1, new ArrayList<Integer>());  
        alumnos.add(2, new ArrayList<Integer>());  
        alumnos.add(3, new ArrayList<Integer>());  
        
       
        String[] idiomas = new String[4];
        
        idiomas[0] = "Ingles";
        idiomas[1] = "Francés";
        idiomas[2] = "Alemán";
        idiomas[3] = "Ruso";
        
    
        
        String[] nivel = new String[4];
        
        nivel[0] = "Básico";
        nivel[1] = "Medio";
        nivel[2] = "Perfeccionamiento";
        
        do{
            try {
        
       
        int idioma=0;
        int idioma1=-1;
        boolean lenguage = false;
        
        do {
            try{
        
        
        idioma = Integer.parseInt(JOptionPane.showInputDialog("Introduce el idioma al que quieres añadir alumnos"
                + "\n\n1. Inglés"
                + "\n\n2. Francés"
                + "\n\n3. Alemán"
                + "\n\n4. Ruso"));
        if (idioma==1 || idioma==2 || idioma==3 || idioma==4){
            idioma1 = idioma - 1;
            lenguage = true;
        }
         else {
            JOptionPane.showMessageDialog(null, "El idioma introducido no existe o esta mal escrito" );
       
        }
        
                    
        }catch (java.lang.IndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "El idioma no existe" );

        }catch (java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Has escrito un valor no valido, vuelve a intenarlo");

        }catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
        }

        }while(lenguage==false);
        
        int nvl=0;
        int nivel1 = -1;
        boolean lvl = false;
        
         do {
             try {
        
        
        
        nvl = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel"
                + "\n\n1. Basico"
                + "\n\n2. Medio"
                + "\n\n3. Perfeccionamiento"));
        
        if (nvl==1 || nvl==2 || nvl==3){
            nivel1 = nvl - 1;
            lvl = true;
        }
        else {
            JOptionPane.showMessageDialog(null, "El nivel introducido no existe o esta mal escrito" );

        }
        
        }catch (java.lang.IndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "El idioma no existe" );

        }catch (java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Has escrito un valor no valido, vuelve a intenarlo");

        }catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());

        }
        }while(lvl==false);
        
         
        Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de alumnos que quieres añadir"));
        
        alumnos.get(nivel1).add(numero);
        
         
        int fin = JOptionPane.showConfirmDialog(null, "¿Quieres continuar añadiendo alumnos?");
        
        if (fin == 1)
            terminar = true;
        
        
        }catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Has escrito un valor no valido, vuelve a intenarlo");
               
        }
            
        }while (terminar == false);
        
      
      
        for (int contador = 0; contador < alumnos.size(); contador++){
            
        segunnvl += "En el nivel " + nivel[contador] + " se han apuntado " + alumnos.get(contador) + " alumnos \n";
        }
        
        JOptionPane.showMessageDialog(null, segunnvl);
              
    
        
    }
    
}
