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
    
    public void sumarPedido(String DNI) throws Exception
    {
        
        plantilla = "update cliente set Pedidos = Pedidos + 1 where DNI = ?";
        sentenciaPre = con.prepareStatement(plantilla);
        sentenciaPre.setString(1, DNI);
           
        sentenciaPre.executeUpdate();
       
    }

    public ArrayList<Cliente> obtenerClientes(ArrayList<Cliente> listaClientes) throws Exception {
        
        plantilla = "SELECT * FROM cliente order by Nombre";
        sentenciaPre = con.prepareStatement(plantilla);
            
       ResultSet resultado = sentenciaPre.executeQuery();
       while (resultado.next())
        {
           Cliente cliente = new Cliente();
           cliente.setNombre(resultado.getString("Nombre"));
           cliente.setPedidos(resultado.getInt("Pedidos"));
           
           listaClientes.add(cliente);
           
        }
      
       return listaClientes;
       
    }
    
    public String contarClientes() throws Exception
    {
        
        int contador = 0;
        plantilla = "SELECT DNI FROM cliente";
        sentenciaPre = con.prepareStatement(plantilla);
           
        ResultSet resultado = sentenciaPre.executeQuery(plantilla);
        while(resultado.next()){
            contador++;
        }
        
        String nclientes = String.valueOf(contador);
        
        return nclientes; 
       
    }
    
    public String mediaPedidos() throws Exception
    {
        
        int contador = 0;
        int pedidos = 0;
        plantilla = "SELECT Pedidos FROM cliente";
        sentenciaPre = con.prepareStatement(plantilla);
           
        ResultSet resultado = sentenciaPre.executeQuery(plantilla);
        while(resultado.next()){
            pedidos = pedidos + resultado.getInt("Pedidos");
            contador++;
        }
        
        
        String mediaPedidos = String.valueOf(pedidos / contador);
        
        return mediaPedidos; 
       
    }
    
      
         
}
