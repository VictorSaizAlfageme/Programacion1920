/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Egibide
 */

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean terminar = false;
        
        JOptionPane.showMessageDialog(null, "Bienvenido a mi primera aplicacion con ArrayList");
             
        
        ArrayList<Double> valores = new ArrayList();
        do{
            try {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
        
        valores.add(numero);
                
        String fin = JOptionPane.showInputDialog("¿Quieres finalizar s/n?");
        if (fin.equalsIgnoreCase("s"))
            terminar = true;
        
        
        }catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Has escrito un valor no valido, vuelve a intenarlo");
               
        }
        }while (terminar == false);
        
        
        int opcion;
        
        do {
            
        opcion = menu();
       
        switch (opcion){
            case 1:
                visualizar(valores);
            break;
            
            case 2:
                mostrar(valores);
            break;
                
            case 3:
                mostraryeliminar(valores);
            break;
                
            case 4:
                convertirenarray(valores);
            break;
                
            case 5:
                mostrarelementos(valores);
            break;
            
            case 6:
                añadirfinal(valores);
            break;
            
            case 7:
                añadir(valores);
            break;
            
            case 8:
                borrar(valores);
            break;
            
            case 9:
                sumar(valores);
            break;
            
            case 10:
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
              
            break;
                
          
        }
        }while (opcion!=10);
           
        
    }
    

public static int menu(){
        int opcion = 0;
        do{
            try{
             
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Visualizar el valor maximo y el mínimo"
                + "\n2. Solicitar un numero y buscarlo." 
                + "\n3. Solicitar un numero, buscarlo y borrarlo. " 
                + "\n4. Convertir el arrayList en un array."
                + "\n5. Si no esta vacío, mostrar el numero de elementos que contiene."
                + "\n6. Insertar un nuevo elemento por el final."
                + "\n7. Insertar un nuevo elemento en la posicion que te indique el usuario."
                + "\n8. Borrar un elemento de una posicion concreta."
                + "\n9. Calcular la suma y la media aritmetica de los valores contenidos."
                + "\n10. Finalizar"));
        
            }catch (java.lang.IndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "La posicion no existe" );
    
            }catch (java.lang.NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Has escrito un valor no valido, vuelve a intenarlo");

            }catch (Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        }while(opcion<1 && opcion>10);

        return opcion;
    }


public static void visualizar(ArrayList<Double> valores){
                Double max = Collections.max(valores);
                Double min = Collections.min(valores);
                JOptionPane.showMessageDialog(null, "El valor maximo es " + max + " y el valor mínimo es " + min );
}



public static void mostrar(ArrayList<Double> valores){

int contador = 0;    
double solicitar = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
   
for (Double numero : valores) { 
    if (solicitar == numero){
        JOptionPane.showMessageDialog(null, "El número si existe en el ArrayList" );
        contador++;
    }
    
} 

if(contador==0){
    JOptionPane.showMessageDialog(null, "El número indicado no existe en el ArrayList" );
    
}   

    
}

public static void mostraryeliminar(ArrayList<Double> valores){
try {  
    int contador = 0;    
    double solicitar = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));

    for (Double numero : valores) { 
        if (solicitar == numero){
            JOptionPane.showMessageDialog(null, "El número si existe en el ArrayList" );
            valores.remove(numero);
            contador++;

        }
    } 
    if(contador==0){

        JOptionPane.showMessageDialog(null, "El número indicado no existe en el ArrayList" );

    }  
}catch (java.lang.IndexOutOfBoundsException e){
        JOptionPane.showMessageDialog(null, "La posicion no existe" );
    
}catch (java.lang.NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Has escrito un valor no valido, vuelve a intenarlo");
    
}catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
               
    }
}

 static void convertirenarray(ArrayList<Double> valores){
     Double[] array = valores.toArray(new Double[valores.size()]);
 }

 static void mostrarelementos(ArrayList<Double> valores){
    String lista = "";
    
    if(valores.isEmpty()){
         JOptionPane.showMessageDialog(null, "El ArrayList está vacio" );
    }
     else {
        for (Double numero : valores) { 
        lista += "El ArrayList contiene el número = " + numero + "\n\n";
        
        }
        JOptionPane.showMessageDialog(null, lista );
    } 
}
    
static void añadirfinal(ArrayList<Double> valores){
    valores.add(Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero")));
}     
     
static void añadir(ArrayList<Double> valores){
    try {
    
    int posicion = Integer.parseInt(JOptionPane.showInputDialog("¿En que posicion del ArrayList quieres introducir un número?"));
    
    valores.add(posicion, Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero")));
    
    }catch (java.lang.IndexOutOfBoundsException e){
        JOptionPane.showMessageDialog(null, "La posicion no existe" );
    
    }catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Has escrito un valor no valido, vuelve a intenarlo");
    
    }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
               
    }
           
}

static void borrar(ArrayList<Double> valores){
    try {
    int posicion = Integer.parseInt(JOptionPane.showInputDialog("¿En que posicion del ArrayList quieres introducir un número?"));
    
    valores.remove(posicion);
    }catch (java.lang.IndexOutOfBoundsException e){
        JOptionPane.showMessageDialog(null, "La posicion no existe" );
    
    }catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Has escrito un valor no valido, vuelve a intenarlo");
    
    }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
               
    }
        
}

static void sumar(ArrayList<Double> valores){
    Double suma = 0.0;
    
    for (Double numero : valores) { 
        suma += numero;
        
        }
    JOptionPane.showMessageDialog(null, "La suma del ArrayList es de " + suma );
}



}