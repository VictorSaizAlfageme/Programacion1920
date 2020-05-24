/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clases.Cliente;
import Clases.Plato;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class Pedido {
    
    private int CodigoPedido;
    private Cliente CodigoCliente;
    private LocalDate Fecha;
    private LocalTime Hora;
    
    private ArrayList<Plato> platosPedidos;

    public Pedido() {
    }

    public Pedido(int CodigoPedido, Cliente CodigoCliente, LocalDate Fecha, LocalTime Hora) {
        this.CodigoPedido = CodigoPedido;
        this.CodigoCliente = CodigoCliente;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public int getCodigoPedido() {
        return CodigoPedido;
    }

    public void setCodigoPedido(int CodigoPedido) {
        this.CodigoPedido = CodigoPedido;
    }

    public Cliente getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(Cliente CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public LocalTime getHora() {
        return Hora;
    }

    public void setHora(LocalTime Hora) {
        this.Hora = Hora;
    }

    

    public ArrayList<Plato> getPlatosPedidos() {
        return platosPedidos;
    }

    public void setPlatosPedidos(ArrayList<Plato> platosPedidos) {
        this.platosPedidos = platosPedidos;
    }
    
    
    
    
}
