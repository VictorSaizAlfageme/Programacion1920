/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String horas = JOptionPane.showInputDialog("Introduce las horas trabajadas");
        int h = Integer.parseInt(horas);
        
        int sueldo;
        int normal = 10;
        int extra = 15;
        int horasextra = 0;
        String estado = JOptionPane.showInputDialog("Introduce tu estado civil (S - Soltero / C - Casado / V - Viudo / D - Divorciado");
        String estudios = JOptionPane.showInputDialog("Introduce tu nivel de estudios (P - Primario / M - Medio / S - Superior");

        switch (estado) {
            case "S":
                if (estudios.equals("P") || estudios.equals ("M") || estudios.equals ("S"))
                    if (h < 40) {
                        sueldo = h * normal;
                        sueldo = sueldo + 100;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                        
                                                
                    }
                    else {
                        horasextra = h - 40;
                        sueldo = (normal * 40) + (horasextra * extra);
                        sueldo = sueldo + 100;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                    }
                        
                      
            break;
            
            case "C":
                if (estudios.equals("S"))
                    if (h < 40) {
                        sueldo = h * normal;
                        sueldo = sueldo + 100;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                        
                                                
                    }
                    else {
                        horasextra = h - 40;
                        sueldo = (normal * 40) + (horasextra * extra);
                        sueldo = sueldo + 100;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                    }
                        
                else {
                     if (h < 40) {
                        sueldo = h * normal;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                        
                                                
                    }
                    else {
                        horasextra = h -40;
                        sueldo = (normal * 40) + (horasextra * extra);
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                    }
                }           
                
            break;
            
            case "V": 
                if (estudios.equals("S") || estudios.equals ("P"))
                    if (h < 40) {
                        sueldo = h * normal;
                        sueldo = sueldo + 100;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                        
                                                
                    }
                    else {
                        horasextra = h - 40;
                        sueldo = (normal * 40) + (horasextra * extra);
                        sueldo = sueldo + 100;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                    }
                
                else {
                     if (h < 40) {
                        sueldo = h * normal;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                        
                                                
                    }
                    else {
                        horasextra = h -40;
                        sueldo = (normal * 40) + (horasextra * extra);
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                    }
                }      
                
            break;
            case "D":
                 if (estudios.equals("S"))
                    if (h < 40) {
                        sueldo = h * normal;
                        sueldo = sueldo + 100;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                        
                                                
                    }
                    else {
                        horasextra = h - 40;
                        sueldo = (normal * 40) + (horasextra * extra);
                        sueldo = sueldo + 100;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                    }
                
                else {
                     if (h < 40) {
                        sueldo = h * normal;
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                        
                                                
                    }
                    else {
                        horasextra = h -40;
                        sueldo = (normal * 40) + (horasextra * extra);
                        JOptionPane.showMessageDialog(null, "El sueldo es de " + sueldo);
                    }
                }      
            break;
            
        }
        
      
    }
    
}