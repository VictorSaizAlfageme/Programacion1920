/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class EJERCICIO11 {

       public static String productos[][] ={{"Kit Kat","Chicles de fresa","Lacasitos","Palotes"},{"Kinder Bueno","Bolsa-variada-Haribo","Chetoos","Twix"},{"Kinder-bueno","M&M","Papa Delta","Chicle de menta"},{"Lacasitos","Crunch","Milkybar","KitKat"}};
       public static double precios[][] ={{1.1,0.8,1.5,0.9},{1.8,1,1.2,1},{1.8,1.3,1.2,0.8},{1.5,1.1,1.1,1.1}};
       public static int cantidad[][]= new int[4][4];
       public static int ventas[][]= new int[4][4];

    public static void main(String[] args) {
        // TODO code application logic here
        boolean error =  true;
        
        do {
           try {
        
        int menu;
       
        for (int x = 0; x < cantidad.length; x++) {
      
            for (int z = 0; z < cantidad.length; z++) {
                cantidad [x][z] = 5;
            }}
       
        int opcion;
        do {
            
        opcion = menu();
       
        switch (opcion){
            case 1:
                pedirgolosina();
            break;
            
            case 2:
                mostrargolosina();
            break;
            
            case 3:
                rellenargolosina();
            break;
                
            case 4:
                apagar();
          
        }
        }while (opcion!=4);
           
         
         }catch (NullPointerException e){
             JOptionPane.showMessageDialog(null, "NO SALGAS");
               
         }
         error = false;
    }while(error);
     
    }
    
    public static int menu(){
        int opcion = 0;
        do{
            try{
             
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Pedir golosina "
                + "\n2.Mostrar golosinas"
                + "\n3.Rellenar golosinas"
                + "\n4.Apagar máquina"
                + "\n\n Indica la operacion que deseas realizar"));
        
            }catch (NumberFormatException e){
                 JOptionPane.showMessageDialog(null, "Escribe un numero del 1 al 4");
               
            }
        }while(opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4);
       
        return opcion;
    }
    
     public static void pedirgolosina(){
         
        String producto = JOptionPane.showInputDialog("¿Que producto quieres?");
        
        if (producto.length()!=2){
            JOptionPane.showMessageDialog(null, "No existe ese producto");
           
        }
        else {
        int fila= Integer.parseInt(Character.toString(producto.charAt(0)));
        int columna= Integer.parseInt(Character.toString(producto.charAt(1)));
        
        if (cantidad[fila][columna] == 0){
           JOptionPane.showMessageDialog(null, "No queda ese producto, lo sentimos.");
           
       }
        else{
           JOptionPane.showMessageDialog(null, "Gracias por comprar " + productos[fila][columna]);
           cantidad[fila][columna] = cantidad[fila][columna] -1;
           ventas[fila][columna] += 1;
       }
        }
     }
     
    public static void mostrargolosina(){
        String mensaje = "";
        for (int x = 0; x < productos.length; x++) {
      
            for (int z = 0; z < productos.length; z++) {
             mensaje += "Producto " + productos[x][z] + " / Codigo: " + x + z + " / Precio: " + precios[x][z] + "€\n";
         
            }}
         JOptionPane.showMessageDialog(null, mensaje);
    }
          
    public static void rellenargolosina(){
        String contra = JOptionPane.showInputDialog("Escibe la contraseña");
        if (contra.equals("MaquinaExpendedora2019"))
        {
        String producto = JOptionPane.showInputDialog("¿Que producto quieres?");
        int fila= Integer.parseInt(Character.toString(producto.charAt(0)));
        int columna= Integer.parseInt(Character.toString(producto.charAt(1)));
        int añadir = Integer.parseInt(JOptionPane.showInputDialog("Teclea la cantidad de producto que quieres añadir "));
        cantidad[fila][columna] += añadir;
        }
        else JOptionPane.showMessageDialog(null, "No eres la persona indicada para rellenar nuestras maquinas");
        
    }
    
    public static void apagar(){
        String fin = "";
        for (int x = 0; x < productos.length; x++) {
        for (int z = 0; z < productos.length; z++) {
            if (ventas[x][z]!=0){
             fin += "Producto " + productos[x][z] + " / Codigo: " + x + z + " / Precio: " + precios[x][z] + "€ / Se han vendido: " + ventas[x][z] + "\n";
        }
        }
        }
         
        JOptionPane.showMessageDialog(null, fin);
        JOptionPane.showMessageDialog(null, "Gracias por comprar en una de nuestras maquinas expendedoras ");
            
    }
    
}
