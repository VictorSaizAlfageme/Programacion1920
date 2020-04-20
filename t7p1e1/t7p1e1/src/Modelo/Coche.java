
package Modelo;

public class Coche extends Vehiculo{
    private MarcaCoche marca;

    public Coche(MarcaCoche marca, String matricula, Persona persona) {
        super(matricula, persona);
        this.marca = marca;
    }

    public MarcaCoche getMarca() {
        return marca;
    }

    public void setMarca(MarcaCoche marca) {
        this.marca = marca;
    }
    
    
}
