
package ModeloBD;

import java.sql.*;

public class GenericoBD {
    
    private Connection con;

    
    public GenericoBD() {
    }
    
    
    // Realizar conexion
   public void conectar(){
       try{
               // Identificamos el driver
                 Class.forName("com.mysql.jdbc.Driver");
                 //obtenemos la conexión
                 String bd="proyecto";
                 String url = "jdbc:mysql://localhost/"+bd;
                 String login="root";
                 String password = "";
                 con = DriverManager.getConnection(url,login,password);
 
                if (con==null){
                       throw new Exception("Problemas con la conexión");
                 }
          }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
   }
   
   
   // Cerrar conexion con la base de datos
   public void desconectar(){
       try
       {
            con.close();
       }
       catch(Exception e)
       {
           System.out.println("Problemas cerrando la conexión");
       }
   }
   
   public Connection getCon() 
    {
        return con;
    }
   
   
   
}