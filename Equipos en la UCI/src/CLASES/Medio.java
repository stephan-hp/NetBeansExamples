/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;


public abstract class Medio {
    private String tipo_de_medio;
    private int numero_de_inventario;
    private double costo_unitario;
    private String estado;

    public Medio(String tipo_de_medio, int numero_de_inventario, double costo_unitario, String estado) {
        this.tipo_de_medio = tipo_de_medio;
        this.numero_de_inventario = numero_de_inventario;
        this.costo_unitario = costo_unitario;
        this.estado = estado;
    }

    public String getTipo_de_medio() {
        return tipo_de_medio;
    }

    public void setTipo_de_medio(String tipo_de_medio) {
        this.tipo_de_medio = tipo_de_medio;
    }

    public int getNumero_de_inventario() {
        return numero_de_inventario;
    }

    public void setNumero_de_inventario(int numero_de_inventario) {
        this.numero_de_inventario = numero_de_inventario;
    }

    public double getCosto_unitario() {
        return costo_unitario;
    }

    public void setCosto_unitario(double costo_unitario) {
        this.costo_unitario = costo_unitario;
    }

    public abstract double getCosto();


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
