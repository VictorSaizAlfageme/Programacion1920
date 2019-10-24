/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author 1gdaw05
 */

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String edad = javax.swing.JOptionPane.showInputDialog("Dime cuantos años tienes");
        int e = Integer.parseInt(edad);
        e = e + 1;
        javax.swing.JOptionPane.showMessageDialog(null, e);
    System.out.println("Teclea un dato");
    Scanner sc;
    sc = new Scanner(System.in);
    }
    
    
}
