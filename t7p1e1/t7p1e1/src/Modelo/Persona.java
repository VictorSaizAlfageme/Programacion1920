
package Modelo;

import java.util.ArrayList;

public class Persona {
    
    private String dni;
    private String nombreApellidos;
    private String direccion;
    private String telefono;
    private ArrayList<Vehiculo> vehiculos;

    public Persona(String dni, String nombreApellidos, String direccion, String telefono) {
        this.dni = dni;
        this.nombreApellidos = nombreApellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> coches) {
        this.vehiculos = coches;
    }
    
    public int getNumeroMotos(){
        /*
        int contador=0;
        for(Vehiculo v: vehiculos)
            if (v instanceof Moto)
                contador++;
        return contador;
        */
        int contador=0;
        // generado automáticamente
        contador = vehiculos.stream().filter((v) -> (v instanceof Moto)).map((item) -> 1).reduce(contador, Integer::sum);
        return contador;
        
        // cuando se usan métodos estáticos en vez de -> se pueden usar ::
        // https://www.oracle.com/technetwork/es/articles/java/expresiones-lambda-api-stream-java-2633852-esa.html
    }
    
    public boolean getMotoDucate(){
        return vehiculos.stream().filter((v) -> (v instanceof Moto)).anyMatch((v) -> (((Moto) v).getMarca() == MarcaMoto.DUCATE));
        
        /*
        for(Vehiculo v: vehiculos)
            if (v instanceof Moto)
            {
                if (((Moto) v).getMarca() == MarcaMoto.DUCATE)
                    return true;
            }
                
        return false;
        */
    }
    
    
    
}
