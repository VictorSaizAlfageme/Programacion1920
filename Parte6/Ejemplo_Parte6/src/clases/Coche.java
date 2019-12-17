/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Egibide
 */
public class Coche {
    // Atributos (privados)
    private String matricula;
    private String color;
    
    
    // Métodos

    // CONSTRUCTOR  

    public Coche() {
    }

    public Coche(String matricula, String color) {
        this.matricula = matricula;
        this.color = color;
    }

    // GET

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }
    
    // SET

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
