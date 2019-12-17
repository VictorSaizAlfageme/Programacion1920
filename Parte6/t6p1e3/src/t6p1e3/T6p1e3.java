package t6p1e3;

import Modelo.Persona;
import Excepciones.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class T6p1e3 {

    public static void main(String[] args) {
        
            // Creación de tres objetos de tipo persona
            // Uso un array porque en el anterior he utilizado un arrayList
            Persona[] arrayPersonas = new Persona[3];

            for(int x = 0; x < 3; x++)
            {
                    arrayPersonas[x] = crearObjeto();
            }

            buscar(arrayPersonas);
        
    }
    
    public static Persona crearObjeto(){
            String nombre = solicitarNombre();
            
            int dNacimiento,mNacimiento,aNacimiento;
            do
            {
                dNacimiento = solicitarDia();
                mNacimiento = solicitarMes();
                aNacimiento = solicitarAño();
            }
            while(validarFecha(dNacimiento,mNacimiento,aNacimiento));
            
            String direccion = solicitarDireccion();
           
            String codigoPostal = solicitarCodigoPostal();
            
            String ciudad = solicitarCiudad();
            
            Persona objetoPersona = new Persona(nombre,dNacimiento,mNacimiento,aNacimiento,direccion,codigoPostal,ciudad);
            
            return objetoPersona;
    }
    
    public static String solicitarNombre(){
        boolean error = true;
        String nombre="";
        do
        {
            try
            {
                nombre=javax.swing.JOptionPane.showInputDialog("Teclea el nombre de la persona: ");
                if (nombre.isEmpty())
                    throw new CampoObligatorio();
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El nombre es un campo obligatorio");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el nombre \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return nombre;
    }
    
    
    public static int solicitarDia(){
        boolean error = true;
        int dia=0;
        do
        {
            try
            {
                String d=javax.swing.JOptionPane.showInputDialog("Teclea día de nacimiento: ");
                if (d.isEmpty())
                    throw new CampoObligatorio();
                dia = Integer.parseInt(d);
                if (dia < 1 || dia > 31)
                    throw new DiaNoValido();
                // No puedo validar más porque no tengo el mes
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El día de nacimiento es un campo obligatorio");
                error = true;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El día de nacimiento es un campo numérico");
                error = true;
            }
            catch(DiaNoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El día de nacimiento tecleado no es válido");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el dia de nacimiento \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return dia;
    }
    
    public static int solicitarMes(){
        boolean error = true;
        String m = "";
        int mes=0;
        do
        {
            try
            {
               m=javax.swing.JOptionPane.showInputDialog("Teclea el mes de nacimiento: ");
               if (m.isEmpty())
                    throw new CampoObligatorio();
               mes = Integer.parseInt(m);
               if (mes < 1 || mes > 12)
                     throw new MesNoValido();
                
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El mes de nacimiento es un campo obligatorio");
                error = true;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El mes es un dato numérico");
                error = true;
            }
            catch(MesNoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El mes de nacimiento tecleado no es válido");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el mes \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return mes;
    }
    
    public static boolean validarFecha(int dia, int mes,int año){
        // Compruebo que la fecha es lógica
        // Puede tener un 31 de febrero o de abril
        try
        {
            LocalDate fecha = LocalDate.of(año,mes,dia);
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            formato.format(fecha);
            //Si no se puede construir la fecha porque no es lógica, saltará java.time.DateTimeException
            return false;
        }
        catch(java.time.DateTimeException e){
            javax.swing.JOptionPane.showMessageDialog(null, "La fecha indicada no es lógica");
            return true;
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Problemas con la fecha \n" + e.getClass());
            return true;
        }
    }
    
    public static int solicitarAño(){
        boolean error = true;
        int año=0;
        do
        {
            try
            {
                String a=javax.swing.JOptionPane.showInputDialog("Teclea el año de nacimiento: ");
                if (a.isEmpty())
                    throw new CampoObligatorio();
                año = Integer.parseInt(a);
                // Calendar es un clase que contiene información sobre la fecha del sistema
                Calendar c = Calendar.getInstance();
                if (año < 1900 || año > c.get(Calendar.YEAR))
                    throw new AñoNoValido();
                
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El año de nacimiento es un campo obligatorio");
                error = true;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El año de nacimiento es un campo numérico");
                error = true;
            }
            catch(AñoNoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El año de nacimiento tecleado no es válido");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el año \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return año;
    }
   
    public static String solicitarDireccion(){
        boolean error = true;
        String direccion="";
        do
        {
            try
            {
                direccion=javax.swing.JOptionPane.showInputDialog("Teclea la direccion de la persona: ");
                if (direccion.isEmpty())
                    throw new CampoObligatorio();
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El direccion es un campo obligatorio");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con la dirección \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return direccion;
    }
    
    public static String solicitarCodigoPostal(){
        boolean error = true;
        String codigo="";
        do
        {
            try
            {
                codigo=javax.swing.JOptionPane.showInputDialog("Teclea el código postal: ");
                if (codigo.isEmpty())
                    throw new CampoObligatorio();
                if (codigo.length() != 5)
                    throw new CodigoNoValido();
                // Para comprobar que son números.
                Integer.parseInt(codigo);
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El código es un campo obligatorio");
                error = true;
            }
            catch(CodigoNoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El código no es correcto ya que tiene que estar formado por cinco numeros");
                error = true;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El código no es correcto ya que tiene que estar formado por cinco numeros");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el código \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return codigo;
    }
    
    public static String solicitarCiudad(){
        boolean error = true;
        String ciudad="";
        do
        {
            try
            {
                ciudad=javax.swing.JOptionPane.showInputDialog("Teclea la ciudad: ");
                if (ciudad.isEmpty())
                    throw new CampoObligatorio();
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El ciudad es un campo obligatorio");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con la ciudad \n" + e.getClass());
                error = true;
            }
        }
        while (error);
        return ciudad;
    }
    
    public static void buscar(Persona[] arrayPersonas){
        int mayorEdad = 0;
        int posicionPersonaMayorEdad = 0;
        
        String nombres = "";
        
        String nombresMayoria="";
        
        for(int x = 0; x < arrayPersonas.length; x++)
        {
            // Persona de más edad
            int edad = arrayPersonas[x].calcularEdad();
            if ( edad > mayorEdad)
            {
                posicionPersonaMayorEdad = x;
                mayorEdad = edad;
            }
            
            // Personas que viven en Elche
            if (arrayPersonas[x].getCiudad().compareToIgnoreCase("Elche") == 0)
            {
                nombres += "\n" + arrayPersonas[x].getNombre();
            }
            
            // Mayores de edad
            if (arrayPersonas[x].isMayorEdad())
            {
                nombresMayoria += "\n" + arrayPersonas[x].getNombre();
            }
        }
        
        javax.swing.JOptionPane.showMessageDialog(null, "La persona de mayor edad es: " + arrayPersonas[posicionPersonaMayorEdad].getNombre() + " y tiene "+ mayorEdad + " años");
        
        if (nombres.compareTo("")== 0)
            javax.swing.JOptionPane.showMessageDialog(null, "No hay personas de Elche");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "En Elche viven: "+nombres);
        
        if (nombresMayoria.compareTo("")== 0)
            javax.swing.JOptionPane.showMessageDialog(null, "No hay personas mayores de edad");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "Las personas mayores de edad son:" + nombresMayoria);
    }
    
}
