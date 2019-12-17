/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1parte6;
import clases.*;
import javax.swing.JOptionPane;


public class Ejer1Parte6 {

    public static void main(String[] args) {
        double[] datos = new double[3];
        int radio = pedirDatos();
        Figura figura = new Figura(radio);
        
        datos[0] = calcularCircunferencia(figura);
        datos[1] = calcularArea(figura);
        datos[2] = calcularVolumen(figura);
        
        mostrarDatos(datos);
    }

    public static int pedirDatos() {
        return Integer.parseInt(
                JOptionPane.showInputDialog("Introduce el radio de la figura: "));
    }
    
    public static void mostrarDatos(double [] datos) {
        JOptionPane.showMessageDialog(null, 
                String.format("Circunferencia: %.2f\nArea: %.2f\nVolumen: %.2f", 
                        datos[0], datos[1], datos[2]));
    }

    public static double calcularCircunferencia(Figura figura) {
         double radio = figura.getRadio();
         return 2 * Math.PI * radio;
    }
    
    public static double calcularArea(Figura figura) {
        double radio = figura.getRadio();
        return Math.PI * Math.pow(radio, 2);
    }
    
    public static double calcularVolumen(Figura figura) {
        double radio = figura.getRadio();
        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }
}
