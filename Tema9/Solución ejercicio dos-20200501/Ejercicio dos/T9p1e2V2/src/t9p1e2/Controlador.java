/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9p1e2;
import Modelo.BD.*;
import Modelo.UML.*;
import GUI.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author victor
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Acontecimiento> listaEventos;
    private static BaseDatos bd;
    private static eliminarEvento eev;
    private static TablaEventos te;
    private static Acontecimiento e;
    private static modificarEvento em;
    private static VentanaPrincipal ev;
    private static VentanaAcontecimientos vac;
    private static boolean prueba;
    public static void main(String[] args) {
        // TODO code application logic here
        bd = new BaseDatos();
        bd.conectar();
        te = new TablaEventos(bd.getCon());
        ev = new VentanaPrincipal();
        ev.setVisible(true);
     vac.setVisible(false);
    }

    public static void mostrarAcontecimientos() {
     vac = new VentanaAcontecimientos();
     vac.setVisible(true);
     ev.setVisible(false);
     eev.setVisible(false);
     em.setVisible(false);
     
    }

    public static void mostrarEmpresa() {
     ev.setVisible(true);
     eev.setVisible(false);
     em.setVisible(false);
     vac.setVisible(false);
     }

    public static void meterDatos(String nombre, Object selectedItem, String fecha, String horaini, String horafin, int aforo) {
     try
        {
    e = new Acontecimiento(nombre, selectedItem.toString(),fecha,horaini,horafin,aforo);
    te.Insertar(e);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null,"Evento añadido");
        
    }

    public static void ventanaEliminar() {
        
        eev = new eliminarEvento();
        eev.setVisible(true);
        ev.setVisible(false);
        em.setVisible(false);
        vac.setVisible(false);
      
        
        
    }

    public static void Volver() {
        vac.setVisible(false);
        ev.setVisible(false);
    }
    
    public static void rellenarCombo(JComboBox<String> todoEvento) {
     
        listaEventos = new ArrayList();
       try{
       te.buscarTodo(listaEventos);
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e.getMessage()+" Ha surgido un error ");
       }
        for (int i = 0; i < listaEventos.size(); i++) {
           String nEve = listaEventos.get(i).getNombre();
           todoEvento.addItem(nEve);
            
        }
    
    }

    public static Boolean eEventos(String evenele) {
         try{
        prueba = false;
       prueba = te.eliminarEvento(evenele);
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e.getMessage()+" Ha surgido un error ");
       }
         return prueba;
      
    
        
    }
   
    public static void mostrarModificar() {
        em = new modificarEvento();
        em.setVisible(true);
        eev.setVisible(false);
        ev.setVisible(false);
        vac.setVisible(false);
    }

    public static void acontecimientosCambio(Object eventoamodi) {
        vac = new VentanaAcontecimientos();
        vac.setVisible(true);
     
        for (int i = 0; i < listaEventos.size(); i++) {
            if(String.valueOf(eventoamodi).equalsIgnoreCase(listaEventos.get(i).getNombre()))
            e = listaEventos.get(i);  
        }
        vac.modificar(e.getNombre(),e.getLugar(),e.getFecha(),e.getHoraI(),e.getHoraF(),e.getAforo());
        
    }

    public static void modificarDatos(String nombre, Object selectedItem, String fecha, String horaini, String horafin, int aforo) {
        try
        {
    e = new Acontecimiento(nombre, selectedItem.toString(),fecha,horaini,horafin,aforo);
    te.Actualizar(e);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null,"Evento modificado");
    }

    public static void meterDatos(String text, String string, LocalDate localDate, LocalTime localTimeInicio, LocalTime localTimeFin, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

