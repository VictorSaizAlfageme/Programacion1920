/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gdaw07
 */
public class Alumno {
    
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String edad;
    private String sexo;
    private String fecha;
    private String correopersonal;
    private String correo;
    private String web;
    private String curso;
    private String estado;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String domicilio, String telefono, String edad, String sexo, String fecha, String correopersonal, String correo, String web, String curso, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.fecha = fecha;
        this.correopersonal = correopersonal;
        this.correo = correo;
        this.web = web;
        this.curso = curso;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreopersonal() {
        return correopersonal;
    }

    public void setCorreopersonal(String correopersonal) {
        this.correopersonal = correopersonal;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override 
    public String toString() {
        return "DATOS DEL ALUMNO"
                + "\n CODIGO ---> " + codigo 
                + "\n NOMBRE ---> " + nombre 
                + "\n DOMICILIO---> " + domicilio 
                + "\n TELEFONO ---> " + telefono 
                + "\n EDAD ---> " + edad 
                + "\n SEXO ---> " + sexo 
                + "\n FECHA---> " + fecha 
                + "\n CORREEO PERSONAL ---> " + correopersonal 
                + "\n CORREO EGIBIDE ---> " + correo 
                + "\n PAGINA WEB ---> " + web
                + "\n CURSO ---> " + curso
                + "\n ESTADO CIVIL ---> " + estado;
    }
    
    
    
}
