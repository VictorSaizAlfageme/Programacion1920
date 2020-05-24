package main;
import Clases.*;
import ModeloBD.*;
import Vista.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JComboBox;

/**
 *
 * @author victor
 */
public class Proyecto {

    private static ClienteBD Cbd;
    private static PlatoBD Pbd;
    private static PedidoBD Pedidobd;
    private static PlatoPedidoBD PPbd;
    private static GenericoBD bdCon;
    
    private static VentanaPrincipal vp;
    private static VentanaClientes vcliente;
    private static VentanaPlatos vplato;
    private static VentanaPedido vpedido;
    
    
    private static Cliente c;
    private static Plato p;   
    
    private static ArrayList<Plato> listaNombres = new ArrayList<>();
    private static ArrayList<Plato> listaUnidades = new ArrayList<>();
    private static ArrayList<Integer> listaCodigosPlatos = new ArrayList<>();
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
   
        try
        {
            bdCon = new GenericoBD();
            bdCon.conectar();
            Cbd = new ClienteBD(bdCon.getCon());
            Pbd = new PlatoBD(bdCon.getCon());
            Pedidobd = new PedidoBD(bdCon.getCon());
            PPbd = new PlatoPedidoBD(bdCon.getCon());
            
            
            System.out.println("Conectado a la Base de Datos");
            
            vp = new VentanaPrincipal();
            vp.setLocationRelativeTo(null);
            vp.setVisible(true);
         }
        catch(Exception e)
        {
             System.out.println("Problemas al lanzar la ventana");
        }
    }
    
    public static void cerrarVenatanaPlatos(){
        
        vplato.setVisible(false);
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
    }
    
    public static void cerrarVenatanaClientes(){
        
        vcliente.setVisible(false);
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
    }
    
    public static void cerrarVenatanaPedidos(){
        
        vpedido.setVisible(false);
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
    }
    
    
    public static void añadirCliente(){
        
        vcliente = new VentanaClientes();
        vp.setVisible(false);
        
        vcliente.mostrarCAñadir();
        
        vcliente.setLocationRelativeTo(null);
        vcliente.setVisible(true);
    }
    
     public static void borrarCliente(){
        
        vcliente = new VentanaClientes();
        vp.setVisible(false);
        
        vcliente.mostrarCBorrar();
        
        vcliente.setLocationRelativeTo(null);
        vcliente.setVisible(true);
   }
      public static void buscarCliente(){
        
        vcliente = new VentanaClientes();
        vp.setVisible(false);
        
        vcliente.mostrarCBuscar();
        
        vcliente.setLocationRelativeTo(null);
        vcliente.setVisible(true);
   }
      
       public static void modificarCliente(){
        
        vcliente = new VentanaClientes();
        vp.setVisible(false);
        
        vcliente.mostrarCModificar();
        
        vcliente.setLocationRelativeTo(null);
        vcliente.setVisible(true);
   }
     
    
        
    public static void terminar(){
       bdCon.desconectar();
       System.exit(0);
       
   }
     
    public static void añadirPlato(){
        
        vplato = new VentanaPlatos();
        vp.setVisible(false);
        
        vplato.mostrarPAñadir();
        
        vplato.setLocationRelativeTo(null);
        vplato.setVisible(true);
   }
    
    public static void modificarUnidadesPlato(){
        
        vplato = new VentanaPlatos();
        vp.setVisible(false);
        
        vplato.mostrarPModificarUnidades();
        
        vplato.setLocationRelativeTo(null);
        vplato.setVisible(true);
   }
    
    public static void borrarPlato(){
        
        vplato = new VentanaPlatos();
        vp.setVisible(false);
        
        vplato.mostrarPBorrar();
        
        vplato.setLocationRelativeTo(null);
        vplato.setVisible(true);
   }
    
    public static void cambiarNombrePlato(){
        
        vplato = new VentanaPlatos();
        vp.setVisible(false);
        
        vplato.mostrarPCambiarNombrePlato();
        
        vplato.setLocationRelativeTo(null);
        vplato.setVisible(true);
   }
    
   
    
    public static void pedido(){
        
        vpedido = new VentanaPedido();
        vp.setVisible(false);
                
        vpedido.setLocationRelativeTo(null);
        vpedido.setVisible(true);
   }
    
    
     public static void altaCliente(String DNI, String Nombre,String Telefono) {
           try {
               
           
           c = new Cliente(DNI,Nombre,Telefono);
           Cbd.alta(c);
           
           }
           catch(Exception e){
               System.out.println("Error al insertar un cliente" + e.getClass());
           }
       }
         
    public static String getNombreCliente(){
        return c.getNombre();
    }
     
    public static String getDNICliente(){
        return c.getDNI();
    }
    
    public static String getTelefonoCliente(){
        return c.getTelefono();
    }
    
    public static String getNombrePlato(){
        return p.getNombre();
    }
    
    public static int getUnidadesPlato(){
        return p.getUnidades();
    }
      
    public static boolean buscarClientePorNombre(String Nombre) throws Exception
    {
        c = Cbd.validarNombre(Nombre);
        return c != null;
    }
    
    public static boolean buscarClientePorDNI(String DNI) throws Exception
    {
        c = Cbd.validarDNI(DNI);
        return c != null;
    }
    
    
    public static boolean borrarClientePorDNI(String DNI)
    {
        boolean existe = false;
        try {
            existe = Cbd.borrarCliente(DNI);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        return existe;
        
    }

    

    public static boolean modificarCliente(String DNI, String Nombre,String Telefono) {
        boolean modificado;   
        
        try {  
           c = new Cliente(DNI,Nombre,Telefono);
            modificado = Cbd.modificar(c);
            return modificado;
                     
           }
           catch(Exception e){
               System.out.println("Error al modificar un cliente"+ e.getClass());
           }
        
           return false;
           
       }
    
    public static void añadirPlato(String Nombre, int Unidades) {
           try {
               
           
           p = new Plato(Nombre,Unidades);
           Pbd.añadirplato(p);
           
           }
           catch(Exception e){
               System.out.println("Error al insertar un plato" + e.getClass() );
           }
       }
    
    public static boolean buscarPlatoPorNombre(String Nombre) throws Exception
    {
        p = Pbd.validarNombre(Nombre);
        return p != null;
    }

    public static Plato mostrarUnidades(String Nombre) {  
        
        try {  
            p = Pbd.mostrarUnidades(Nombre);
            return p;
                     
           }
           catch(Exception e){
               System.out.println("Error al actualizar las unidades" + e.getClass());
           }
        
           return p;
           
       }


    public static boolean cambiarUnidadesPlato(String Nombre, int UnidadesActuales) {
        boolean cambiadas;   
        
        try {  
            
            cambiadas = Pbd.actualizarUnidades(Nombre, UnidadesActuales);
            return cambiadas;
                     
           }
           catch(Exception e){
               System.out.println("Error al actualizar las unidades" + e.getClass());
           }
        
           return false;
           
       }
    
     public static boolean borrarPlato(String Nombre)
    {
        boolean existe = false;
        try {
            existe = Pbd.borrarPlato(Nombre);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        return existe;
        
    }
     
     public static boolean modificarPlato(String NombreV, String NombreN) {
        boolean modificado;   
        
        try {  
            
            modificado = Pbd.modificar(NombreV, NombreN);
            return modificado;
                     
           }
           catch(Exception e){
               System.out.println("Error al modificar el nombre de un plato" + e.getClass());
           }
        
           return false;
           
       }
     
     public static void llenarComboBox(JComboBox cb) throws Exception
     {
        ArrayList<Plato> listaPlatos = Pbd.seleccionarPlato();
        for(int x = 0; x < listaPlatos.size(); x++)
            cb.addItem(listaPlatos.get(x).getNombre());
     }
     
     public static boolean llenarUnidades(String Nombre)
     {
         try{
             p = Pbd.validarNombre(Nombre);
            return p !=null;
             
         }catch(Exception e){
               System.out.println("Error al insertar las unidades del plato" + e.getClass());
           }
         
         return p !=null;
         
     }
     
     public static void guardarPedidos(){
        
        try {
            
            listaNombres = Pbd.seleccionarNombrePlato();
            listaUnidades = Pbd.seleccionarUnidadesPlato();
        
        } catch (Exception e) {
            System.out.println("Error al guardar informacion de cada plato" + e.getClass());
        }
    }
     
    public static String obtenerCodigoCliente(String Nombre){
        String DNI="";
        
        try {
            
            boolean FormatoDNI = validarDni(Nombre);
        
            if(!FormatoDNI){
            DNI = Cbd.obtenerDNI(Nombre);
            }else{
                DNI = Nombre;
            }
            
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
            
        return DNI;
            
        
    }
    
    private static boolean validarDni(String DNI) throws Exception{
        String dnipat = "^\\d{8}[A-HJ-NP-TV-Z]$";
        if (Pattern.matches(dnipat, DNI)== false ){
            return false;
        }
        else{
            return true;
        }
    }
    
    
    
    public static void insertarPedido(String Cliente) throws Exception
       {
        int codigoPlato = 0;
        int codigoPedido = Pedidobd.obetenerUlitmoCodigoPedido();
        
        Pedidobd.insertarPedido(Cliente, codigoPedido);
        
        
        for(int x = 0; x < listaNombres.size(); x++){
            codigoPlato = Pbd.obtenerCodigoPlato(listaNombres.get(x).getNombre());
            listaCodigosPlatos.add(x, codigoPlato);
        }
        
        for(int i = 0; i < listaCodigosPlatos.size(); i++){
            PPbd.insertarPlatos(codigoPedido,listaCodigosPlatos.get(i), listaUnidades.get(i));
        }
        
        
        
        
        }
     
     
     
}