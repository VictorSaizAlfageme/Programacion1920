
package Modelo.BD;

import java.sql.*;

public class BaseDatos {
    
    private Connection BD;

    public BaseDatos() {
    }
    
   public void conectar(){
       try{
               // Identificamos el driver
                Class.forName("com.mysql.jdbc.Driver");
                 //obtenemos la conexión
                 String bd="t9p1e2";
                 String url = "jdbc:mysql://localhost/"+bd;
                 String login="root";
                 String password = "";
                 BD = DriverManager.getConnection(url,login,password);
 
                if (BD==null){
                       throw new Exception("Problemas con la conexión");
                 }
          }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
   }
   
   public void desconectar(){
       try
       {
            BD.close();
       }
       catch(Exception e)
       {
           System.out.println("Problemas cerrando la conexión");
       }
   }
   
   public Connection getCon()
   {
       return BD;
   }
    
}