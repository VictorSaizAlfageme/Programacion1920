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
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */

public class ClienteBD{
    
    private Cliente c;
    private PreparedStatement sentenciaPre;
    private String plantilla;
 
    private Connection con;
    
    public ClienteBD (Connection con)
    {
        this.con = con;
    }
    
    public void alta(Cliente c) throws Exception
    {
            
            plantilla = "INSERT INTO cliente (DNI, Nombre, Telefono, Pedidos) VALUES (?,?,?,?)";
            sentenciaPre = con.prepareStatement(plantilla);
            sentenciaPre.setString(1, c.getDNI());
            sentenciaPre.setString(2,c.getNombre());
            sentenciaPre.setString(3, c.getTelefono());
            sentenciaPre.setInt(4, 0);
                 
            sentenciaPre.executeUpdate();
    }
    
    public Cliente validarNombre(String Nombre) throws Exception
    {
        
        plantilla = "select *  from cliente where lower(nombre) = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,Nombre.toLowerCase());
            
       ResultSet resultado = sentenciaPre.executeQuery();
        if (resultado.next())
        {
            rellenarCliente(resultado);
        }
        else
            c = null;
        
        return c;
    }
      
    public Cliente validarDNI(String DNI) throws Exception
    {
        
        plantilla = "select *  from cliente where DNI = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,DNI);
            
       ResultSet resultado = sentenciaPre.executeQuery();
        if (resultado.next())
        {
            rellenarCliente(resultado);
        }
        else
            c = null;
        
        return c;
    }
      
      
     
    public  void rellenarCliente (ResultSet resultado) throws Exception
    {
      
       c = new Cliente();
       c.setNombre(resultado.getString("nombre"));
       c.setDNI(resultado.getString("DNI"));
       c.setTelefono(resultado.getString("Telefono"));
      
    }
    
    public boolean borrarCliente(String DNI) throws Exception
    {
               
            plantilla = "delete from cliente where DNI = ?";
            sentenciaPre = con.prepareStatement(plantilla);
            sentenciaPre.setString(1,DNI);
            
            int n = sentenciaPre.executeUpdate();
            if(n == 1)
            {
                return true;
            }
            
            return false;
    }
      
    public boolean modificar(Cliente c) throws Exception
    {
        
        plantilla = "update cliente set Nombre = ?, Telefono = ? where DNI = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,c.getNombre());
        sentenciaPre.setString(2,c.getTelefono());
        sentenciaPre.setString(3,c.getDNI());
           
       int n = sentenciaPre.executeUpdate();
        if (n == 1)
        {
            return true;
        }
        
        return false;
    }
    
    public String obtenerDNI(String Nombre) throws Exception
    {
        String DNI = "";
        plantilla = "SELECT DNI FROM cliente WHERE LOWER(Nombre) = ? ";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1,Nombre.toLowerCase());
            
       ResultSet resultado = sentenciaPre.executeQuery();
       if (resultado.next())
        {
           DNI = resultado.getString("DNI");
        }
      
       return DNI;
       
    }
      
         
}
