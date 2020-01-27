/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidarEjer22;
import Exepciones.*;
import MisClases.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.time.format.DateTimeParseException;


public class ValidarEjer22 {
    
        static String Titulo;
        static int AñoEdicion;
        static ArrayList<Obra> obras = new ArrayList();
        static ArrayList<Artista> artistas = new ArrayList();
        
        
    public static void main(String[] args) {
       int x =0;
        
       do{
           
            CrearObra();
            CrearArtista(x);
            x=x+1;
            
       }while(JOptionPane.showConfirmDialog(null, "Añadir otra obra junto a su artista")==0);
       
    }
    
    
    
    public static void CrearObra(){
        ValidarTitulo();
        ValidarAño();
        TipoDeObra();
        MostrarResultados();
    }
    
    
    public static void ValidarTitulo(){
        boolean proceso = true;
        while(proceso){
            try{
                String titulo = JOptionPane.showInputDialog("Titulo");
                Pattern p = Pattern.compile("^[A-z[ ]0-9]+$");
                Matcher m = p.matcher(titulo);
                if(!m.matches())
                {
                    throw new NoValidacion();
                }
                else {
                    Titulo=titulo;
                    proceso = false;
                }
            }
            catch(NoValidacion e)
            {
                JOptionPane.showMessageDialog(null, "Titulo no válido");
            }
        }
    }
    
    
    public static void ValidarAño(){
        boolean proceso = true;
        while(proceso){
            try{
                String ano = JOptionPane.showInputDialog("Año de edicion");
                Pattern p = Pattern.compile("^(19[0-9][0-9])|(20[0-1][0-9])|(2020)$");
                Matcher m = p.matcher(ano);
                if(!m.matches())
                {
                    throw new NoValidacion();
                }
                else {
                    int ano2 = Integer.parseInt(ano);
                    AñoEdicion = ano2;
                    proceso = false;
                }
            }
            catch(NoValidacion e)
            {
                JOptionPane.showMessageDialog(null, "Año de edicion no válido");
            }
        }
    }
    
    
    public static void TipoDeObra(){
       boolean proceso = true;
        while(proceso) {
            try{
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("TIPO DE OBRA:"
                    + "\n1. Libro"
                    + "\n2. Disco"
                    + "\n3. Película"));
            switch(opcion)
            {
                case 1:
                    Libro libro = new Libro();
                    CreacionLibro(libro);
                    proceso = false;
                    break;
                case 2: 
                    Disco disco = new Disco();
                    CreacionDisco(disco);
                    proceso = false;
                    break;
                case 3: 
                    Pelicula peli = new Pelicula();
                    CreacionPelicula(peli);
                    proceso = false;
                    break;
                default: JOptionPane.showMessageDialog(null, "Opción no válida");
            }
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
    
    
    public static void CreacionLibro(Libro libro){
        libro.setTitulo(Titulo);
        libro.setAnoEdicion(AñoEdicion);
        libro.setEditorial(ValidarEditorial());
        libro.setPaginas(ValidarPaginas());
        obras.add(libro);
    }
    
    
    public static String ValidarEditorial(){
        boolean proceso = true;
        String editorial = "";
        while(proceso){
            try{
                editorial = JOptionPane.showInputDialog("Editorial");
                Pattern p = Pattern.compile("^[A-z\\n]+$");
                Matcher m = p.matcher(editorial);
                if(!m.matches())
                {
                    throw new NoValidacion();
                }
                else {
                    proceso = false;
                }
            }
            catch(NoValidacion e)
            {
                JOptionPane.showMessageDialog(null, "Editorial no válida");
            }
       }return editorial; 
    }
    
    
    public static int ValidarPaginas(){
        boolean proceso = true;
        String paginas = "";
        while(proceso){
            try{
                paginas = JOptionPane.showInputDialog("Numero de páginas");
                Pattern p = Pattern.compile("^[0-9]{2,4}$");
                Matcher m = p.matcher(paginas);
                if(!m.matches())
                {
                    throw new NoValidacion();
                }
                else {
                    proceso = false;
                }
            }
            catch(NoValidacion e)
            {
                JOptionPane.showMessageDialog(null, "Numero de páginas no válido, introduce un numero de 2 a 4 numeros");
            }
       }return Integer.parseInt(paginas);
    }
    
    
    public static void CreacionDisco(Disco disco){
        disco.setTitulo(Titulo);
        disco.setAnoEdicion(AñoEdicion);
        disco.setDiscografica(ValidarDiscografica()); 
        disco.setNumeroCanciones(ValidarNumCanciones());
        obras.add(disco);
    }
    
    
    public static String ValidarDiscografica(){
        boolean proceso = true;
        String discografica = "";
        while(proceso){
            try{
                discografica = JOptionPane.showInputDialog("Discografica");
                Pattern p = Pattern.compile("^[A-z\\n]+$");
                Matcher m = p.matcher(discografica);
                if(!m.matches())
                {
                    throw new NoValidacion();
                }
                else {
                    proceso = false;
                }
            }
            catch(NoValidacion e)
            {
                JOptionPane.showMessageDialog(null, "Discografica no válida");
            }
       }return discografica;
    }
    
    
    public static int ValidarNumCanciones(){
        boolean proceso = true;
        String canciones = "";
        while(proceso){
            try{
                canciones = JOptionPane.showInputDialog("Número de canciones");
                Pattern p = Pattern.compile("^([1-9])|(1[0-9])$");
                Matcher m = p.matcher(canciones);
                if(!m.matches())
                {
                    throw new NoValidacion();
                }
                else {
                    proceso = false;
                }
            }
            catch(NoValidacion e)
            {
                JOptionPane.showMessageDialog(null, "Numero de canciones no válido, introduce un numero del 1 al 19");
            }
       }return Integer.parseInt(canciones);
    }
    
      
    public static void CreacionPelicula(Pelicula peli){
        peli.setTitulo(Titulo);
        peli.setAnoEdicion(AñoEdicion);
        peli.setProductora(ValidarProductora()); 
        peli.setDuracion(ValidarDuracion()); 
        obras.add(peli);
        
    }
    
    
    public static String ValidarProductora(){
       boolean proceso = true;
        String productora = "";
        while(proceso){
            try{
                productora = JOptionPane.showInputDialog("Productora");
                Pattern p = Pattern.compile("^[A-z\\n]+$");
                Matcher m = p.matcher(productora);
                if(!m.matches())
                {
                    throw new NoValidacion();
                }
                else {
                    proceso = false;
                }
            }
            catch(NoValidacion e)
            {
                JOptionPane.showMessageDialog(null, "Discografica no válida");
            }
       }return productora; 
    }
    
    
    public static int ValidarDuracion(){
        boolean proceso = true;
        String duracion = "";
        while(proceso){
            try{
                duracion = JOptionPane.showInputDialog("Duración en minutos");
                Pattern p = Pattern.compile("^[1-2][0-9]{1,2}$");
                Matcher m = p.matcher(duracion);
                if(!m.matches())
                {
                    throw new NoValidacion();
                }
                else {
                    proceso = false;
                }
            }
            catch(NoValidacion e)
            {
                JOptionPane.showMessageDialog(null, "Duración no válida, valor maximo 299 minutos");
            }
       }return Integer.parseInt(duracion);
    }
    
    public static void CrearArtista(int x){
        Artista art = new Artista();
        art.setNombre(ValidarNombre());
        art.setFechaNacimiento(ValidarFechaNacimiento());
        art.setObras2(obras.get(x));
    }
    
    public static String ValidarNombre(){
        boolean proceso = true;
        String nombre = "";
        while(proceso){
            try{
                nombre = JOptionPane.showInputDialog("Nombre del artista");
                Pattern p = Pattern.compile("^[A-Z\\sa-z]+[ ][A-Z\\sa-z]+[ ][A-Z\\sa-z]+$");
                Matcher m = p.matcher(nombre);
                if(!m.matches())
                {
                    throw new NoValidacion();
                }
                else {
                    proceso = false;
                }
            }
            catch(NoValidacion e)
            {
                JOptionPane.showMessageDialog(null, "Nombre  no válido");
            }
       }return nombre;
    }
    
    
    public static LocalDate ValidarFechaNacimiento(){
        boolean proceso = true;
        LocalDate nacimiento = null;
        while(proceso){
            try{
        String fecha = JOptionPane.showInputDialog("Fecha nacimiento (dd/MM/yyyy)");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         nacimiento = LocalDate.parse(fecha, formato);
            }catch(DateTimeParseException e)
            {
                JOptionPane.showMessageDialog(null, "Fecha de nacimiento no válida");
            }
            proceso= false;
        }return nacimiento;
    }
    
    
    public static void MostrarResultados(){
        JOptionPane.showMessageDialog(null, Artista.class.toString());
        JOptionPane.showMessageDialog(null, Disco.class.toString());
        JOptionPane.showMessageDialog(null, Libro.class.toString());
        JOptionPane.showMessageDialog(null, Obra.class.toString());
        JOptionPane.showMessageDialog(null, Pelicula.class.toString());
        
    }
    
    
    
}
