/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejer3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.Position;

/**
 *
 * @author 1gdaw07
 */
public class JavaEjer3 {
    static ArrayList<Producto> listaProductos;
    static Producto producto = new Producto();
    static V1Ejer3 v = new V1Ejer3();
    static V2Ejer3 v2 = new V2Ejer3();
    static V3Ejer3 v3 = new V3Ejer3();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      listaProductos = new ArrayList();
      v.setLocationRelativeTo(null);
      v.setVisible(true);	
        
        
        Producto producto1 = new Producto("Chocolate",2.20,100);
        Producto producto2 = new Producto("Arroz",1.20,120);
        Producto producto3 = new Producto("Macarrones",0.80,60);
        Producto producto4 = new Producto("Tomate",3.20,45);
        
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        
        
    }
        
    public static void MostrarVenta() {
    v.setVisible(false);
    v2.setLocationRelativeTo(null);
    v2.setVisible(true);
    String MostrarlistaProductos = MostrarlistaProductos();
    JOptionPane.showMessageDialog(null, MostrarlistaProductos);
}  
    
 public static String MostrarlistaProductos() {   
     String MostrarlistaProductos = "";
        
        for(Producto p : listaProductos){
        MostrarlistaProductos = MostrarlistaProductos + "Nombre = " + p.getNombre() + "   //  Unidades = " + p.getUnidades() + "   //Precio = "+ p.getPrecio()  + "\n";
            }
        
        return MostrarlistaProductos;
 }
    
    
    
    public static void MostrarCompra() {
    v.setVisible(false);
    v3.setLocationRelativeTo(null);
    v3.setVisible(true);
}
    
    
        
public static void validarProducto(String nombre) {
        producto.setNombre(nombre);
}


public static void validarUnidades(String unidades) {
            Integer unidadesI = Integer.parseInt(unidades);
            producto.setUnidades(unidadesI);
            
}


public static void validarImporte(String importe) {
            double importeD = Double.parseDouble(importe);
            producto.setPrecio(importeD);
}

public static void GuardarProducto() {
    for(Producto p : listaProductos){
    if(producto.getNombre().equals(p.getNombre())){
        
        Producto productox = new Producto(producto.getNombre(),producto.getPrecio(),(producto.getUnidades() + p.getUnidades()));
        listaProductos.add(productox);
    }
    else{
        Producto AñadirProducto = new Producto(producto.getNombre(),producto.getPrecio(),producto.getUnidades());

        listaProductos.add(AñadirProducto);
    }
    }   
}

public static void MenuV1() {
    v2.setVisible(false);
    v.setVisible(true);
}

public static void MenuV2() {
    v3.setVisible(false);
    v.setVisible(true);
}

public static void CalcularPrecio() {
    
}


public static void venderProducto(String producto, int unidades) {
        for(Producto p: listaProductos) {
            if(p.getNombre().equalsIgnoreCase(producto)) {
                p.setUnidades(Integer.toString(Integer.parseInt(p.getUnidades()) - unidades));
            }
        }
    }
  
    
    
}
}
