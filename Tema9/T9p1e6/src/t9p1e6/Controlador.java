
package t9p1e6;

import GUI.*;
import Modelo.BD.*;
import Modelo.UML.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class Controlador {

    private static AcontecimientoBD abd;
    private static GenericoBD bdCon;
    private static PersonaBD pbd;
    private static AsistenteBD asisbd;
    
    
    private static Acontecimiento acontecimiento;
     private static ArrayList<Acontecimiento> listaAcontecimientos;
     
     private static Persona p;
    
    private static VentanaPrincipal vp;
    private static VentanaAcontecimientos ve;
    private static VentanaInscripcion vi;
    
   
    
    public static void main(String[] args) {      
        try
        {
            bdCon = new GenericoBD();
            bdCon.abrirBD();
            asisbd = new AsistenteBD(bdCon.getCon());
            abd = new AcontecimientoBD(bdCon.getCon(),asisbd);
            pbd = new PersonaBD(bdCon.getCon());
            asisbd.setPersonaBD(pbd);
           
            
            vp = new VentanaPrincipal();
            vp.setVisible(true);
         }
        catch(Exception e)
        {
             System.out.println("Problemas en el main");
        }
    }
    
    public static void visualizarVentanaAlta(){
        // Dejo por debajo la principal
         ve = new VentanaAcontecimientos("alta");
         ve.setVisible(true);
    }
    
   public static void visualizarVentanaEliminar(){
         // Dejo por debajo la principal
         ve = new VentanaAcontecimientos("baja");
         ve.setVisible(true);
   }
   
   public static void visualizarVentanaEditar(){
         // Dejo por debajo la principal
         ve = new VentanaAcontecimientos("modificacion");
         ve.setVisible(true);
   }
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
    
    public static void grabarAcontecimiento(String nombre, String lugar, LocalDate localDate, LocalTime localTimeInicio, LocalTime localTimeFin, int nro) throws Exception{
        // Crear objeto e insertarlo en la base de datos
        acontecimiento = new Acontecimiento(nombre,lugar, localDate,localTimeInicio,localTimeFin,nro);
        abd.alta(acontecimiento);
    }
    
    public static void buscarAcontecimiento(String nombre) throws Exception
    {
        // false -- No quiero los asistentes
       acontecimiento =  abd.consultaPorNombre(nombre,false);
    }
    
    public static String getLugar(){
        return acontecimiento.getLugar();
    }
    
     public static String getFecha(){
        return acontecimiento.getFecha().toString();
    }
     
      public static String getHoraInicio(){
        return acontecimiento.getHoraI().toString();
    }
      
       public static String getHoraFin(){
        return acontecimiento.getHoraF().toString();
    }
       
        public static String getAforo(){
        return acontecimiento.getAforo().toString();
    }
     
   public static void terminar() throws Exception{
       bdCon.cerrarBD();
       System.exit(0);
   }
   
   public static void borrarAcontecimiento() throws Exception{
       abd.baja(acontecimiento.getNombre());
   }
   
    public static void modificarAcontecimiento(String lugar, LocalDate localDate, LocalTime localTimeInicio, LocalTime localTimeFin, int nro) throws Exception
    {
        acontecimiento.setLugar(lugar);
        acontecimiento.setFecha(localDate);
        acontecimiento.setHoraI(localTimeInicio);
        acontecimiento.setHoraF(localTimeFin);
        acontecimiento.setAforo(nro);
        abd.modificar(acontecimiento);
    }
    
    public static void nuevaInscripcion()
    {
        vi = new VentanaInscripcion();
        vi.setVisible(true);
    }
    
    public static void llenarCombo(JComboBox combo) throws Exception
    {
        // Quiero todos los acontecimientos con plazas libres.
       listaAcontecimientos = abd.consultarLibres();
        for(int x = 0; x <  listaAcontecimientos.size();x++)
        {
                 combo.insertItemAt(listaAcontecimientos.get(x).getNombre(),x);
        }
    }
    
    public static void setAcontecimiento(int posicion)
    {
        acontecimiento =  listaAcontecimientos.get(posicion);
    }
    
    public static boolean buscarPersonaPorDni(String d) throws Exception
    {
        p = pbd.consultaPorDni(d);
        return p != null;
    }
    
    public static String getNombrePersona(){
        return p.getNombre();
    }
    
     public static String getApe1(){
        return p.getApe1();
    }
     
      public static String getApe2(){
        return p.getApe2();
    }
      
       public static String getTelefono(){
        return p.getTelefono();
    }
    
       public static void altaPersona(String d, String n, String a1,String a2,String t) throws Exception
       {
           p = new Persona(d,n,a1,a2,t);
           pbd.alta(p);
       }
       
       public static void altaAsistente() throws Exception
       {
           // Relación entre clases.
           acontecimiento.setAsistente(p);
           // Relación en la base de datos.
           asisbd.alta(p.getDni(),acontecimiento.getNombre());
       }
       
       public static String mostrarAsistencia(String evento) throws Exception
       {
           // true --- quiero los asistentes
           acontecimiento = abd.consultaPorNombre(evento,true);
           // Generar String
           String datos = "";
           if (acontecimiento.getListaAsistentes().size() == 0)
               datos = "No hay asistentes";
           else
                for(int x = 0; x < acontecimiento.getListaAsistentes().size(); x++)
                    datos += acontecimiento.getListaAsistentes().get(x).getDni() + " " + acontecimiento.getListaAsistentes().get(x).getNombre() + "\n";
           return datos;
       }
}
