/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6p3e22;
import Exepciones.*;
import MisClases.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.time.format.DateTimeParseException;


public class Tema6P3E22 {
    
        static String titulog;
        static int anoediciong;
        static ArrayList<Obra> obras = new ArrayList();
        static ArrayList<Artista> artistas = new ArrayList();
        
        
    public static void main(String[] args) {
       int x =-1;
        
       do{
            CreacionObra();
            CreacionArtista(x);
            x=x+1;
       }while(JOptionPane.showConfirmDialog(null, "Añadir otra obra con su artista")==0);
       
    }
    
    
    
    public static void CreacionObra(){
        ValidarTitulo();
        ValidarAnoEdicion();
        TipoDeObra();
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
                    titulog=titulo;
                    proceso = false;
                }
            }
            catch(NoValidacion e)
            {
                JOptionPane.showMessageDialog(null, "Titulo no válido");
            }
        }
    }
    public static void ValidarAnoEdicion(){
        boolean proceso = true;
        while(proceso){
            try{
                String ano = JOptionPane.showInputDialog("Año de edicion");
                Pattern p = Pattern.compile("^(19[2-9][0-9])|(20(([0-1][0-9])|(20)))$");
                Matcher m = p.matcher(ano);
                if(!m.matches())
                {
                    throw new NoValidacion();
                }
                else {
                    int ano2 = Integer.parseInt(ano);
                    anoediciong = ano2;
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
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("TIPO DE OBRA:\n1) Libro\n2)Disco\n3)Película"));
            switch(opcion)
            {
                case 1:
                    Libro lib = new Libro();
                    CreacionLibro(lib);
                    proceso = false;
                    break;
                case 2: 
                    Disco dis = new Disco();
                    CreacionDisco(dis);
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
    public static void CreacionLibro(Libro lib){
        lib.setTitulo(titulog);
        lib.setAnoEdicion(anoediciong);
        lib.setEditorial(ValidarEditorial());
        lib.setPaginas(ValidarPaginas());
        obras.add(lib);
    }
    public static String ValidarEditorial(){
        boolean proceso = true;
        String editorial = "";
        while(proceso){
            try{
                editorial = JOptionPane.showInputDialog("Editorial");
                Pattern p = Pattern.compile("^[A-z[ ].]+$");
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
                Pattern p = Pattern.compile("^[0-9]{2,3}$");
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
                JOptionPane.showMessageDialog(null, "Numero de páginas no válido");
            }
       }return Integer.parseInt(paginas);
    }
    public static void CreacionDisco(Disco dis){
        dis.setTitulo(titulog);
        dis.setAnoEdicion(anoediciong);
        dis.setDiscografica(ValidarDiscografica()); 
        dis.setNumeroCanciones(ValidarNumCanciones());
        obras.add(dis);
    }
    public static String ValidarDiscografica(){
        boolean proceso = true;
        String discografica = "";
        while(proceso){
            try{
                discografica = JOptionPane.showInputDialog("Discografica");
                Pattern p = Pattern.compile("^[A-z[ ].]+$");
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
                Pattern p = Pattern.compile("^([1-9])|([1-2][0-9])$");
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
                JOptionPane.showMessageDialog(null, "Numero de canciones no válido");
            }
       }return Integer.parseInt(canciones);
    }
    public static void CreacionPelicula(Pelicula peli){
        peli.setTitulo(titulog);
        peli.setAnoEdicion(anoediciong);
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
                Pattern p = Pattern.compile("^[A-z[ ].]+$");
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
                duracion = JOptionPane.showInputDialog("Duración");
                Pattern p = Pattern.compile("^([1-9])|([1-2][0-9])$");
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
                JOptionPane.showMessageDialog(null, "Duración no válida");
            }
       }return Integer.parseInt(duracion);
    }
    
    public static void CreacionArtista(int x){
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
                Pattern p = Pattern.compile("^([A-z]+([ ]?[A-z]*))*$");
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
        String fecha = JOptionPane.showInputDialog("Fecha nacimiento formato dd/MM/yyyy");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         nacimiento = LocalDate.parse(fecha, formato);
            }catch(DateTimeParseException e)
            {
                JOptionPane.showMessageDialog(null, "Fecha de nacimiento no válida");
            }
        }return nacimiento;
    }
    
}
