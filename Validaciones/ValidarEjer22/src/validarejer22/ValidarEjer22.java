/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarejer22;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import clases.*;

/**
 *
 * @author 1gdaw07
 */
public class ValidarEjer22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        // Obra
        Obra o= new Obra();
        o.setTitulo("Sarandonga");
        o.setAñoEdicion("1925");
       
        
        o.setTipoDeObra("comercial");
        
        // Relación de Obra con avión. Primero creo el objeto y después los relaciono.
        Pelicula p = new Pelicula();
        p.setProductora("Iberia");
        p.setDuracion("200");
        
        // Relación
        o.setAvion(p);
        p.setObra(o);
        
        // Relación de Obra con piloto.
        Libro p = new Libro();
        p.setCodigoPiloto("098");
        p.setNombre("Nieves");
        p.setApellido("Ruiz");
        p.setNumeroDeLicencia(9);
        // Relación
        v.setPiloto(p);
        ArrayList<Obra> l = p.getListaObras();
        l.add(v);
        p.setListaObras(l);
        
        // Relación con asientos. Se supone que son 100. Creo sólo tres.
        ArrayList<Asiento> lista = new ArrayList();
        
        Asiento as = new Asiento();
        as.setNumeroAsiento(1);
        as.setEstado(true);
        as.setCompartimento("uno");
        
        as.setObra(v);
        
        lista.add(as);
        
        as = new Asiento();
        as.setNumeroAsiento(2);
        as.setEstado(true);
        as.setCompartimento("uno");
        
        as.setObra(v);
        
        lista.add(as);
        
        as = new Asiento();
        as.setNumeroAsiento(3);
        as.setEstado(false);
        as.setCompartimento("dos");
        
        as.setObra(v);
        
        lista.add(as);
        
        v.setListaAsientos(lista);
        
        // Pasajeros
        Pasajero pa = new Pasajero();
        pa.setCedula("11.111.111A");
        pa.setNombre("Pepe");
        pa.setApellido("Gonzalez");
        pa.setSexo("Masculino");
        pa.setEdad(30);
        
        v.setPasajero(pa);
        pa.setObra(v);
        
        pa.setAsiento(as);
        as.setPasajero(pa);
        
        // Ciudad
        Ciudad c = new Ciudad();
        c.setNombre("Vitoria");
        c.setCodigoCiudad("01");
        c.setObra(v);
        v.setCiudad(c);
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
        
        
        
        
    }
    
}
