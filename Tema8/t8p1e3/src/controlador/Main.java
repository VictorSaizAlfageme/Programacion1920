/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Producto;
import vista.*;

/**
 *
 * @author Victor Saiz
 */
public class Main {

    // BD
    private static ArrayList<Producto> listaProductos;
    
    // ventanas
    private static VentanaPrincipal vp;
    private static VentanaCompra vc;
    private static VentanaVenta vv;

    public static void main(String[] args) {
        listaProductos = new ArrayList();
        
        generateBD();
        
        vp = new VentanaPrincipal();
        vc = new VentanaCompra();
        vv = new VentanaVenta();

        vp.setVisible(true);
    }
    
    public static void mostrarPrincipal() {
        vc.dispose();
        vv.dispose();
        vp.setVisible(true);
    }

    public static void mostrarCompra() {
        vp.dispose();
        vc.setVisible(true);
    }
    
    public static void mostrarVenta() {
        vp.dispose();
        vv.setVisible(true);
    }
    
    public static void generateBD() {
        Producto producto1 = new Producto("Manzana", "1", "10");
        Producto producto2 = new Producto("Donut", "2", "20");
        Producto producto3 = new Producto("Pera", "1", "30");
        
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
    }
    
    public static String mostrarInventario() {
        String texto = "";
        
        for (Producto producto : listaProductos) {
            texto += producto.toString() + "\n";
        }
        
        return texto;
    }
    
    public static boolean buscarProducto(String producto) {        
        for(Producto p: listaProductos) {
            if (p.getNombre().equalsIgnoreCase(producto)) {
                return true;
            }
        }
        
        return false;
    }
    
    public static String buscarPrecioUnitario(String producto) {
        for(Producto p: listaProductos) {
            if(p.getNombre().equalsIgnoreCase(producto)) {
                return p.getNumUnidades();
            }
        }
        
        return null;
    }
    
    public static void venderProducto(String producto, int unidades) {
        for(Producto p: listaProductos) {
            if(p.getNombre().equalsIgnoreCase(producto)) {
                p.setNumUnidades(Integer.toString(Integer.parseInt(p.getNumUnidades()) - unidades));
            }
        }
    }
    
    public static void comprarProducto(String producto, int unidades) {
     for(Producto p: listaProductos) {
            if(p.getNombre().equalsIgnoreCase(producto)) {
                p.setNumUnidades(Integer.toString(Integer.parseInt(p.getNumUnidades()) + unidades));
            }
        }
    }
}
