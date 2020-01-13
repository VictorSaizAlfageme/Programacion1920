
package t6p2e4;

import Modelo.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class T6p2e4 {

    public static void main(String[] args) {
        try
        {
        // Vuelo
        Vuelo v= new Vuelo();
        v.setNumeroDeVuelo(1);
        v.setHoraDeSalida("10:00");
        v.setHoraDeLlegada("15:00");
        v.setLugarDeOrigen("Foronda");
        v.setLugarDeDestino("Los Rodeos");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
	String fechaSalida = "15-01-2020";
	Date date = sdf.parse(fechaSalida); // Se puede producir una excepción
	v.setFechaDeSalida(date);
        
        String fechaLlegada = "20-01-2020";
	date = sdf.parse(fechaLlegada);
        v.setFechaDeRegreso(date);
        
        v.setTipoDeVuelo("comercial");
        
        // Relación de vuelo con avión. Primero creo el objeto y después los relaciono.
        Avion a = new Avion();
        a.setAerolinea("Iberia");
        a.setCodigoDeAvion("001");
        a.setNumeroDeAsientos(100);
        a.setCompartimentos("dos");
        
        // Relación
        v.setAvion(a);
        a.setVuelo(v);
        
        // Relación de vuelo con piloto.
        Piloto p = new Piloto();
        p.setCodigoPiloto("098");
        p.setNombre("Nieves");
        p.setApellido("Ruiz");
        p.setNumeroDeLicencia(9);
        // Relación
        v.setPiloto(p);
        ArrayList<Vuelo> l = p.getListaVuelos();
        l.add(v);
        p.setListaVuelos(l);
        
        // Relación con asientos. Se supone que son 100. Creo sólo tres.
        ArrayList<Asiento> lista = new ArrayList();
        
        Asiento as = new Asiento();
        as.setNumeroAsiento(1);
        as.setEstado(true);
        as.setCompartimento("uno");
        
        as.setVuelo(v);
        
        lista.add(as);
        
        as = new Asiento();
        as.setNumeroAsiento(2);
        as.setEstado(true);
        as.setCompartimento("uno");
        
        as.setVuelo(v);
        
        lista.add(as);
        
        as = new Asiento();
        as.setNumeroAsiento(3);
        as.setEstado(false);
        as.setCompartimento("dos");
        
        as.setVuelo(v);
        
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
        pa.setVuelo(v);
        
        pa.setAsiento(as);
        as.setPasajero(pa);
        
        // Ciudad
        Ciudad c = new Ciudad();
        c.setNombre("Vitoria");
        c.setCodigoCiudad("01");
        c.setVuelo(v);
        v.setCiudad(c);
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
        
    }
    
}
