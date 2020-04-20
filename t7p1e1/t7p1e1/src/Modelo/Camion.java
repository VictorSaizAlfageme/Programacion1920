
package Modelo;

public class Camion extends Vehiculo{
    private MarcaCamion marca;

    public Camion(MarcaCamion marca, String matricula, Persona persona) {
        super(matricula, persona);
        this.marca = marca;
    }

    public MarcaCamion getMarca() {
        return marca;
    }

    public void setMarca(MarcaCamion marca) {
        this.marca = marca;
    }
    
    
}
