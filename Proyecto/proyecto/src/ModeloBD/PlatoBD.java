/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Clases.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class PlatoBD {
    
    private Plato p;
    private PreparedStatement sentenciaPre;
    private String plantilla;
 
    private Connection con;
    
    
    // Realizar conexion
    public PlatoBD (Connection con)
    {
        this.con = con;
    }
    
    
    // Añadir un plato a la base de datos
    public void añadirplato(Plato p) throws Exception
    {
            
            plantilla = "INSERT INTO plato (CodigoPlato, Nombre, Unidades) VALUES (null,?,?)";
            sentenciaPre = con.prepareStatement(plantilla);
            sentenciaPre.setString(1,p.getNombre().toLowerCase());
            sentenciaPre.setInt(2, p.getUnidades());
                 
            sentenciaPre.executeUpdate();
    }
    
    
    
    // Buscar si un nombre de un plato existe en la base de datos
    public Plato validarNombre(String Nombre) throws Exception
    {
        
        plantilla = "select * from plato where Nombre = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,Nombre.toLowerCase());
            
       ResultSet resultado = sentenciaPre.executeQuery();
        if (resultado.next())
        {
            rellenarPlato(resultado);
        }
        else
            p = null;
        
        return p;
    }
    
    
    
    // En caso de que exista un plato, obtener información sobre el
    public void rellenarPlato (ResultSet resultado) throws Exception
    {
      
       p = new Plato();
       p.setNombre(resultado.getString("Nombre"));
       p.setUnidades(resultado.getInt("Unidades"));
      
    }
    
    
    // Buscar las unidades de un plato según su nombre
    public Plato mostrarUnidades(String Nombre)throws Exception
    {
        
        plantilla = "select Unidades from plato where nombre = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,Nombre);
          
        ResultSet resultado = sentenciaPre.executeQuery(); 
        if (resultado.next())
        {
            rellenarUnidadesPlato(resultado);
        }
        else
            p = null;
        
        return p;
    }
    
    
    
    // Obtener las unidades de un plato en caso de que exista
    public void rellenarUnidadesPlato(ResultSet resultado) throws Exception
    {
      
       p = new Plato();
       p.setUnidades(resultado.getInt("Unidades"));
      
    }
    
    
    
    // Modificar las unidades de un plato
    public boolean actualizarUnidades(String Nombre, int UnidadesActuales)throws Exception
    {
        
        plantilla = "update plato set Unidades = ? where Nombre = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setInt(1,UnidadesActuales);
        sentenciaPre.setString(2,Nombre);
           
       int n = sentenciaPre.executeUpdate();
        if (n == 1)
        {
            return true;
        }
        
        return false;
    }
    
    
    
    
    // Eliminar un plato de la base de datos
    public boolean borrarPlato(String Nombre) throws Exception
    {
               
            plantilla = "delete from plato where Nombre = ?";
            sentenciaPre = con.prepareStatement(plantilla);
            sentenciaPre.setString(1,Nombre);
            
            int n = sentenciaPre.executeUpdate();
            if(n == 1)
            {
                return true;
            }
            
            return false;
    }
    
    
    
    // Modificar el nombre de un plato
    public boolean modificar(String NombreV, String NombreN) throws Exception
    {
        
        plantilla = "update plato set Nombre = ? where Nombre = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,NombreN);
        sentenciaPre.setString(2,NombreV);
           
       int n = sentenciaPre.executeUpdate();
        if (n == 1)
        {
            return true;
        }
        
        return false;
    }
    
    
    
    // Obtener toda de la información de todos los platos y meterlos en un ArrayList
    public ArrayList<Plato>  seleccionarPlato() throws Exception
    {
        ArrayList<Plato> listaPlatos = new ArrayList();
       
        
        plantilla = "select * from plato";
        sentenciaPre = con.prepareStatement(plantilla);
  
      ResultSet resultado = sentenciaPre.executeQuery();
       while(resultado.next())
       {
                // Creamos el objeto
                Plato p = new Plato();
                p.setCodigoPlato(resultado.getInt("CodigoPlato"));
                p.setNombre(resultado.getString("Nombre"));
                p.setUnidades(resultado.getInt("Unidades"));
                
                listaPlatos.add(p);
       }
       return listaPlatos;
    }
    
    
    
    // Obtener solamente el nombre de de todos los platos y meterlos en un ArrayList
    public ArrayList<Plato>  seleccionarNombrePlato() throws Exception
    {
        ArrayList<Plato> listaNombresPlatos = new ArrayList();
       
        
        plantilla = "select Nombre from plato";
        sentenciaPre = con.prepareStatement(plantilla);
  
      ResultSet resultado = sentenciaPre.executeQuery();
       while(resultado.next())
       {
                // Creamos el objeto
                Plato p = new Plato();
                p.setNombre(resultado.getString("Nombre"));
                
                listaNombresPlatos.add(p);
       }
       return listaNombresPlatos;
    }
    
    
    // Obtener solamente el nombre de de todos los platos y meterlos en un ArrayList
    public ArrayList<Plato>  seleccionarUnidadesPlato() throws Exception
    {
        ArrayList<Plato> listaNombresPlatos = new ArrayList();
       
        
        plantilla = "select Unidades from plato";
        sentenciaPre = con.prepareStatement(plantilla);
  
      ResultSet resultado = sentenciaPre.executeQuery();
       while(resultado.next())
       {
            // Creamos el objeto
            Plato p = new Plato();
            p.setNombre(resultado.getString("Unidades"));

            listaNombresPlatos.add(p);
       }
       return listaNombresPlatos;
    }
    
    
    
    // Obtener solamente el codigo de de todos los platos y meterlos en un ArrayList
    public int obtenerCodigoPlato(String Nombre) throws Exception
    {
        int codigo = 1;
        plantilla = "select CodigoPlato from plato where Nombre = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,Nombre);
  
        ResultSet resultado = sentenciaPre.executeQuery();
        if(resultado.next())
       {
        codigo = resultado.getInt("CodigoPlato");
                
       }
        
       return codigo;
    }
    
    
    
    // Restar unidades pedidas en el pedido a las unidades ya existentes
    public void restarUnidades(int CodigoPlato, int UnidadesPedidas) throws Exception
    {
        
        plantilla = "update plato set Unidades = Unidades - ? where CodigoPlato = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setInt(1, UnidadesPedidas);
        sentenciaPre.setInt(2, CodigoPlato);
           
        sentenciaPre.executeUpdate();
       
    }
    
    
    
    // Obtener datos de todos los platos y meterlos en un ArrayList
    public ArrayList<Plato> obtenerPlatos(ArrayList<Plato> listaPlatos) throws Exception {
        
        plantilla = "SELECT * FROM plato order by Nombre";
        sentenciaPre = con.prepareStatement(plantilla);
            
       ResultSet resultado = sentenciaPre.executeQuery();
       while (resultado.next())
        {
           Plato plato = new Plato();
           plato.setNombre(resultado.getString("Nombre"));
           plato.setUnidades(resultado.getInt("Unidades"));
           
           listaPlatos.add(plato);
           
        }
      
       return listaPlatos;
       
    }
    
    
    
    // Contar el numero de platos que hay
    public String contarPlatos() throws Exception
    {
        
        int contador = 0;
        plantilla = "SELECT CodigoPlato FROM plato";
        sentenciaPre = con.prepareStatement(plantilla);
           
        ResultSet resultado = sentenciaPre.executeQuery(plantilla);
        while(resultado.next()){
            contador++;
        }
        
        String nPlatos = String.valueOf(contador);
        
        return nPlatos; 
       
    }
    
    
}
