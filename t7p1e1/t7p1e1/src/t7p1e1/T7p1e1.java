
package t7p1e1;

import Excepciones.*;
import Modelo.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class T7p1e1 {

    private static ArrayList<Vehiculo> listaVehiculos;
    private static ArrayList<Persona> listaPersonas;
    
    public static void main(String[] args) {
        try
        {
            listaVehiculos = new ArrayList();
            listaPersonas = new ArrayList();
            alta();
            mostrar();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getMessage());
        }
    }
    
    public static void alta() throws Exception{
        do
        {
            Persona persona = datosPersona();
            // Relación de persona con vehiculos.
            persona.setVehiculos(datosVehiculos(persona));
            
            listaPersonas.add(persona);
        }
        while (JOptionPane.showConfirmDialog(null, "¿Deseas continuar con más personas?")==0);
        
    }
    
    public static Persona datosPersona() throws Exception{
        return new Persona(obtenerDni(),obtenerNombreApellidos(),obtenerDireccion(),obtenerTelefono());
        // new Persona("11111111A","Pepe Ruiz", "C/Pozoa 19 3A 01002 Vitoria","987987987"); );
    }
    
    public static ArrayList<Vehiculo> datosVehiculos(Persona p) throws Exception{
        ArrayList<Vehiculo> vehiculos=new ArrayList();
        do
        {
           String tipoVehiculo = obtenerTipo();
           switch(tipoVehiculo){
               case "Moto":
                   vehiculos.add(new Moto(obtenerMarcaMoto(),obtenerMatricula(),p));
                   // new Vehiculo(MarcaMoto.DUCATE,"1111BBB",p);
                   break;
               case "Coche":
                   vehiculos.add(new Coche(obtenerMarcaCoche(),obtenerMatricula(),p));
                   break;
               case "Camion":
                   vehiculos.add(new Camion(obtenerMarcaCamion(),obtenerMatricula(),p));
                   break;
           }
           listaVehiculos.add(vehiculos.get(vehiculos.size() - 1));
        }
        while (JOptionPane.showConfirmDialog(null, "¿Deseas continuar con más vehiculos?")==0);
        return vehiculos;
    }
    
    public static String obtenerDni() throws Exception {
        String dni="";
        boolean error;
        do
        {
            try
            {
                error=false;
                dni = JOptionPane.showInputDialog("Teclea el dni de la persona: ");
                Pattern p = Pattern.compile("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
                Matcher m = p.matcher(dni);
                if (m.matches())
                {
                    char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
                    int resto = Integer.parseInt(dni.substring(0,8))%23;
                    if (caracteres[resto]!= dni.charAt(8))
                        throw new DniNoValido();
                }
                else
                    throw new DniNoValido();
                
                // ¿ Hay ya una persona con ese dni?
                /*
                 int x =0;
                for(x=0; x < listaPersonas.size() && !listaPersonas.get(x).getDni().equals(dni) ; x++){}
                if (x != listaPersonas.size())
                    throw new DniNoValido();
                */
                final String dni2 = dni; // constante para poder usarla en la función lambda
                if (listaPersonas.stream().anyMatch(pe ->pe.getDni().equals(dni2)))
                    throw new DniNoValido();
                
               
            }
            catch(DniNoValido e)
            {
                JOptionPane.showMessageDialog(null,"Dni no válido, vuelve a intentarlo");
                error = true;
            }
            
        }
        while(error);
        return dni;
    }
    
    public static String obtenerNombreApellidos() throws Exception {
        String nombreApellidos="";
        boolean error;
        do
        {
            try
            {
                error=false;
                nombreApellidos = JOptionPane.showInputDialog("Teclea el nombre y los apellidos de la persona: ");
                Pattern p = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]+)+$");
                Matcher m = p.matcher(nombreApellidos);
                if (!m.matches())
                    throw new NombreNoValido();
            }
            catch(NombreNoValido e)
            {
                JOptionPane.showMessageDialog(null,"Nombre y apellidos no validos, vuelve a intentarlo");
                error = true;
            }
            
        }
        while(error);
        return nombreApellidos;
    }
    
    public static String obtenerDireccion() throws Exception {
        String direccion="";
        boolean error;
        do
        {
            try
            {
                error=false;
                direccion = JOptionPane.showInputDialog("Teclea la dirección de la persona: ");
                // C/calle portal piso letra codigo postal ciudad
                Pattern p = Pattern.compile("^C/[A-Z][a-z]+( [A-Z][a-z]+)* [1-9][0-9]{0,2} [1-9][0-9]?[A-Z] [0-9]{5} [A-Z][a-z]+$");
                Matcher m = p.matcher(direccion);
                if (!m.matches())
                    throw new DireccionNoValida();
            }
            catch(DireccionNoValida e)
            {
                JOptionPane.showMessageDialog(null,"Dirección no valida, vuelve a intentarlo");
                error = true;
            }
            
        }
        while(error);
        return direccion;
    }
    
    public static String obtenerTelefono() throws Exception {
       String telefono="";
        boolean error;
        do
        {
            try
            {
                error=false;
                telefono = JOptionPane.showInputDialog("Teclea el teléfono de la persona: ");
                Pattern p = Pattern.compile("^[6789][0-9]{8}$");
                Matcher m = p.matcher(telefono);
                if (!m.matches())
                    throw new TelefonoNoValido();
            }
            catch(TelefonoNoValido e)
            {
                JOptionPane.showMessageDialog(null,"Teléfono no valido, vuelve a intentarlo");
                error = true;
            }
            
        }
        while(error);
        return telefono;
    }
    
    public static String obtenerTipo() throws Exception {
        String tipo="";
        boolean error;
        do
        {
            try
            {
                error=false;
                tipo = JOptionPane.showInputDialog("Teclea el tipo de vehículo (Moto, Coche o Camion ");
                Pattern p = Pattern.compile("^(Moto|Coche|Camion)$");
                Matcher m = p.matcher(tipo);
                if (!m.matches())
                    throw new TipoNoValido();
            }
            catch(TipoNoValido e)
            {
                JOptionPane.showMessageDialog(null,"Los tipos validos son Moto, Coche y Camion");
                error = true;
            }
            
        }
        while(error);
        return tipo;
    }
    
    public static String obtenerMatricula() throws Exception {
        String matricula="";
        boolean error;
        do
        {
            try
            {
                error=false;
                matricula = JOptionPane.showInputDialog("Teclea matricula del vehiculo: ");
                // Viejas y nuevas
                Pattern p = Pattern.compile("^(([A-Z]{1,2}\\d{4}[A-Z]{0,2})|([0-9]{4}[BCDFGHJKLMNÑPRSTVWXYZ]{3}))$");
                Matcher m = p.matcher(matricula);
                if (!m.matches())
                    throw new MatriculaNoValida();
                
                final String mat = matricula; // constante para poder usarla en la función lambda
                if (listaVehiculos.stream().anyMatch(v ->v.getMatricula().equals(mat)))
                    throw new MatriculaNoValida();
            }
            catch(MatriculaNoValida e)
            {
                JOptionPane.showMessageDialog(null,"Matricula no valida, vuelve a intentarlo");
                error = true;
            }
            
        }
        while(error);
        return matricula;
    }
    
    public static MarcaMoto obtenerMarcaMoto() throws Exception {
        String marcaMoto="";
        boolean error;
        do
        {
            try
            {
                error=false;
                marcaMoto = JOptionPane.showInputDialog("Teclea la marca de la moto ").toUpperCase();
                Pattern p = Pattern.compile("^(KAWASAKI|DUCATE|HARLEYDAVIDSON)$");
                Matcher m = p.matcher(marcaMoto);
                if (!m.matches())
                    throw new MarcaNoValida();
            }
            catch(MarcaNoValida e)
            {
                JOptionPane.showMessageDialog(null,"La marca indicada no es valida. Los valores correctos son: "+ MarcaMoto.values());
                error = true;
            }
            
        }
        while(error);
        return MarcaMoto.valueOf(marcaMoto);
    }
    
    public static MarcaCoche obtenerMarcaCoche() throws Exception {
        String marcaCoche="";
        boolean error;
        do
        {
            try
            {
                error=false;
                marcaCoche = JOptionPane.showInputDialog("Teclea la marca del coche ").toUpperCase();
                Pattern p = Pattern.compile("^(AUDI|BMW|RENAULT|HYUNDAI|CITROEN)$");
                Matcher m = p.matcher(marcaCoche);
                if (!m.matches())
                    throw new MarcaNoValida();
            }
            catch(MarcaNoValida e)
            {
                JOptionPane.showMessageDialog(null,"La marca indicada no es valida. Los valores correctos son: "+ MarcaCoche.values());
                error = true;
            }
            
        }
        while(error);
        return MarcaCoche.valueOf(marcaCoche);
        
    }
    
    public static MarcaCamion obtenerMarcaCamion() throws Exception {
        String marcaCamion="";
        boolean error;
        do
        {
            try
            {
                error=false;
                marcaCamion = JOptionPane.showInputDialog("Teclea la marca del camión ").toUpperCase();
                Pattern p = Pattern.compile("^(SCANIA|MAN|VOLVO|MERCEDES)$");
                Matcher m = p.matcher(marcaCamion);
                if (!m.matches())
                    throw new MarcaNoValida();
            }
            catch(MarcaNoValida e)
            {
                JOptionPane.showMessageDialog(null,"La marca indicada no es valida. Los valores correctos son: "+ MarcaCamion.values());
                error = true;
            }
            
        }
        while(error);
        return MarcaCamion.valueOf(marcaCamion);
        
    }
    
    public static void mostrar() throws Exception{
        
        //Nombre de las personas con más de un vehiculo.
        System.out.println("Nombres de personas con más de un vehiculo");
        List<Persona> listaDos = listaPersonas.stream().filter(p -> p.getVehiculos().size() > 1).collect(Collectors.toList());
        listaDos.stream().forEach(p->System.out.println(p.getNombreApellidos()));
       
        listaPersonas.stream().filter(p -> p.getVehiculos().size() > 1).forEach(p->System.out.println(p.getNombreApellidos()));
        
        for(int x = 0;x < listaPersonas.size();x++)
        {
            if (listaPersonas.get(x).getVehiculos().size() > 1)
                System.out.println(listaPersonas.get(x).getNombreApellidos());
        }

        
         //Nombre de la persona que más vehículos tiene.
         System.out.println("Nombre de la persona que más vehiculos tiene");
        
        Optional<Persona> pMax = listaPersonas.stream().max(Comparator.comparingInt(p->p.getVehiculos().size()));
        if (pMax.isPresent())
            System.out.println(pMax.get().getNombreApellidos());
        
        //https://picodotdev.github.io/blog-bitix/2018/04/la-clase-optional-de-java-para-evitar-la-excepcion-nullpointerexception/
        
        int max = 0;
        Persona pMax2=null;
        for(Persona p: listaPersonas)
            if (p.getVehiculos().size() > max)
            {
                max = p.getVehiculos().size();
                pMax2 = p;
            }
         System.out.println(pMax2.getNombreApellidos());
        
         
        // Nombre de la persona que más motos tiene.
        System.out.println("Nombre de la persona que más motos tiene");
        
        Optional<Persona> pMaxMotos = listaPersonas.stream().max(Comparator.comparingInt(p->p.getNumeroMotos()));
        if (pMaxMotos.isPresent())
            System.out.println(pMaxMotos.get().getNombreApellidos());
        
        int maxMotos = 0;
        Persona pMaxMotos2=null;
        for(Persona p: listaPersonas)
        {
            int numeroMotos = 0;
            for (Vehiculo v: p.getVehiculos())
                if (v instanceof Moto)
                    numeroMotos++;
        
            if (numeroMotos > maxMotos)
            {
                maxMotos = numeroMotos;
                pMaxMotos2 = p;
            }
        }
         System.out.println(pMaxMotos2.getNombreApellidos());
        
        //¿ Hay alguna persona que tenga una moto de la marca Ducate?
        long contador = listaPersonas.stream().filter(p->p.getMotoDucate()).count();
        System.out.println("Hay " + contador + " personas que tienen una moto Ducate");
        
        // Lista ordenada alfabéticamente de todas las personas indicando su número de vehiculos.
        listaPersonas.stream().sorted(Comparator.comparing(p->p.getNombreApellidos())).forEach(p->System.out.println(p.getNombreApellidos() + " " + p.getVehiculos().size()));
    }
    
}
