package com.dark.pizza.serviciomongo.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Pedido implements Serializable {

    @Id
    private String id;
    private String datos_cliente;
    private String descripcion;
    private String total_pagar;
    private String direccion_envio;
    private String status;

    public Pedido() {
    }

    public Pedido(String id, String datos_cliente, String descripcion, String total_pagar, String direccion_envio, String status) {
        this.id = id;
        this.datos_cliente = datos_cliente;
        this.descripcion = descripcion;
        this.total_pagar = total_pagar;
        this.direccion_envio = direccion_envio;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDatos_cliente() {
        return datos_cliente;
    }

    public void setDatos_cliente(String datos_cliente) {
        this.datos_cliente = datos_cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(String total_pagar) {
        this.total_pagar = total_pagar;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
