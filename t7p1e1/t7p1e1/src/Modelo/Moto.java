
package Modelo;

public class Moto extends Vehiculo{
    private MarcaMoto marca;

    public Moto(MarcaMoto marca, String matricula, Persona persona) {
        super(matricula, persona);
        this.marca = marca;
    }

    public MarcaMoto getMarca() {
        return marca;
    }

    public void setMarca(MarcaMoto marca) {
        this.marca = marca;
    }
    
    
    
}
