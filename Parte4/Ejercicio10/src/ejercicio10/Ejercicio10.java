/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
import excepciones.error;
import javax.swing.JOptionPane;
import java.util.Arrays;
import excepciones.*;
/**
 *
 * @author Egibide
 */
public class Ejercicio10 {
    public static int matriz[][];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int x = 0;
        int y = 0;
        int suma = 0;
        boolean pregunta = false;
                
        
         int[][] matriz = new int [4][4];
         
         for (x = 0; x <matriz.length; x++){
            for (y = 0; y <matriz.length; y++){
                 matriz[x][y] = num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            
             }
         }
         
        do {
         try
        {     
        String operacion = JOptionPane.showInputDialog("¿Que deseas realizar? Escribe EXIT para salir."
                +"\n A) Calcular la suma de una fila."
                +"\n B) Calcular la suma de una columna." 
                +"\n C) Calcular la suma de una diagonal." 
                +"\n D) Calcular la suma de una diagonal inversa."
                +"\n E) Calcular la media de los valores de la matriz");
         
        String operaciones = operacion.toUpperCase();
        
         if (operaciones.length()!= 1){
                    throw new OperacionError();
        }
         else
             if (!operaciones.equals("A") && !operaciones.equals("B") && !operaciones.equals("C") && !operaciones.equals("D") && !operaciones.equals("E") && !operaciones.equals("EXIT"))
                  JOptionPane.showMessageDialog(null, "Escribe los valores correctos");
         
        
        
        switch (operaciones) { 
            case "A":
                sumaFila(matriz);
                break;
            
            case "B":
                sumaColumna(matriz);
                break;
            case "C":
                diagonalD(matriz);
                break;
            case "D":
                diagonalI(matriz);
                break;
            case "E":
                media(matriz);
                break;
            case "EXIT":
         JOptionPane.showMessageDialog(null, "Gracias por haber utilizado este programa");
         pregunta = true;
         break;
      
    }
    
        }catch (OperacionError e){
                JOptionPane.showMessageDialog(null, "Introduce un numero del 1 al 4");
            }
       catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "NO SALGAS");
            }
       
       catch (Exception e){
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
        }while (pregunta == false);
        }
           
         
         
        public static void sumaFila(int matriz[][]) {
        
        try{
            int suma = 0;
            int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce una fila para realizar la suma"));
             if (fila<0 || fila>4){
                 throw new error();
             }
             for (int x=0; x < matriz.length;x++){
                 suma = suma + matriz[fila-1][x];
             }
            JOptionPane.showMessageDialog(null, "La suma de los matriz " + matriz[fila-1][0] + " + "+ matriz[fila-1][1] + " + "+ matriz[fila-1][2]+ " + " + matriz[fila-1][3] + " es " + suma);
         
         }catch (error e){
             JOptionPane.showMessageDialog(null, "Has seleccionado una fila inexistente");
         }
        }
         
        public static void sumaColumna(int matriz[][]) {
        
        try{
            int suma = 0;
            int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce una columna para realizar la suma"));
             if (columna<0 || columna>4){
                 throw new error();
             }
             for (int x=0; x < matriz.length;x++){
                 suma = suma + matriz[x][columna-1];
             }
            JOptionPane.showMessageDialog(null, "La suma de los matriz " + matriz[0][columna-1] + " + "+ matriz[1][columna-1] + " + "+ matriz[2][columna-1]+ " + " + matriz[3][columna-1] + " es " + suma);
         
         }catch (error e){
             JOptionPane.showMessageDialog(null, "Has seleccionado una fila inexistente");
         }
        }
         
        public static void diagonalD(int matriz[][]) {
        
            int suma = 0;
            int y = 0;
            for (int x=0; x < matriz.length;x++){
                suma = suma + matriz[x][y];
                y++;
             }
            JOptionPane.showMessageDialog(null, "La suma de los matriz " + matriz[0][0] + " + "+ matriz[1][1] + " + "+ matriz[2][2]+ " + " + matriz[3][3] + " es " + suma);
        
        }
        public static void diagonalI(int matriz[][]) {
         int suma = 0;
            int x = 4;
            for (int y=0; y < matriz.length;y ++){
                suma = suma + matriz[x][y];
                x--;
             }
            JOptionPane.showMessageDialog(null, "La suma de los matriz " + matriz[3][0] + " + "+ matriz[2][1] + " + "+ matriz[1][2]+ " + " + matriz[0][3] + " es " + suma);
        
   
        }
        
        public static void media(int matriz[][]) {
        int suma = 0;
        for (int x=0; x < matriz.length;x++){
             for (int y=0; y < matriz.length;y++){
                suma = suma + matriz[x][y];
            }}
        int media = suma
            JOptionPane.showMessageDialog(null, "La suma de los matriz " + matriz[3][0] + " + "+ matriz[2][1] + " + "+ matriz[1][2]+ " + " + matriz[0][3] + " es " + suma);
        
   
        }
}
