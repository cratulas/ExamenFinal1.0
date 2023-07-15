
package com.pgy.business;

public class Cuenta {
    private int id;
    private int numero;
    private int saldo;
    private String descripcion;
    private int clienteId;

    public Cuenta() {
    }

    public Cuenta(int numero, int saldo, String descripcion, int clienteId) {
        this.numero = numero;
        this.saldo = saldo;
        this.descripcion = descripcion;
        this.clienteId = clienteId;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
}
