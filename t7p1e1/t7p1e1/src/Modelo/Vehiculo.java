
package Modelo;

public class Vehiculo {
    private String matricula;
    private Persona persona;

    public Vehiculo(String matricula, Persona persona) {
        this.matricula = matricula;
        this.persona = persona;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
