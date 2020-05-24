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
    
    public PlatoBD (Connection con)
    {
        this.con = con;
    }
    
    public void añadirplato(Plato p) throws Exception
    {
            
            plantilla = "INSERT INTO plato (CodigoPlato, Nombre, Unidades) VALUES (null,?,?)";
            sentenciaPre = con.prepareStatement(plantilla);
            sentenciaPre.setString(1,p.getNombre().toLowerCase());
            sentenciaPre.setInt(2, p.getUnidades());
                 
            sentenciaPre.executeUpdate();
    }
    
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
    
    public void rellenarPlato (ResultSet resultado) throws Exception
    {
      
       p = new Plato();
       p.setNombre(resultado.getString("Nombre"));
       p.setUnidades(resultado.getInt("Unidades"));
      
    }
    
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
    
    public void rellenarUnidadesPlato(ResultSet resultado) throws Exception
    {
      
       p = new Plato();
       p.setUnidades(resultado.getInt("Unidades"));
      
    }
    
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
                p.setNombre(resultado.getString("Nombre"));
                p.setUnidades(resultado.getInt("Unidades"));
                
                listaPlatos.add(p);
       }
       return listaPlatos;
    }
    
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
    
    
}
