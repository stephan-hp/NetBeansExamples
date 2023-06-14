/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

public class Medio_mobiliarios extends Medio {
    private String tipo;
    private String proveedor;
    private String tiempo_de_uso;
    private String ubucacion;
    private double plus;

    public Medio_mobiliarios(String tipo, String proveedor, String tiempo_de_uso, String ubucacion, String tipo_de_medio, int numero_de_inventario, double costo_unitario, String estado) {
        super(tipo_de_medio, numero_de_inventario, costo_unitario, estado);
        this.tipo = tipo;
        this.proveedor = proveedor;
        this.tiempo_de_uso = tiempo_de_uso;
        this.ubucacion = ubucacion;
        if (this.ubucacion.equals( "aula" )) plus = 20;
        if (this.ubucacion.equals( "laboratorio" )) plus = 30;
        if (this.ubucacion.equals( "apartamento" )) plus = 40;
        if (this.ubucacion.equals( "oficina" )) plus = 50;
        
    }

  

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTiempo_de_uso() {
        return tiempo_de_uso;
    }

    public void setTiempo_de_uso(String tiempo_de_uso) {
        this.tiempo_de_uso = tiempo_de_uso;
    }

    public String getUbucacion() {
        return ubucacion;
    }

    public void setUbucacion(String ubucacion) {
        this.ubucacion = ubucacion;
    }

    @Override
    public double getCosto() {
        return super.getCosto_unitario() * Double.valueOf( this.getTiempo_de_uso()) + plus ;
        }
    
    
    
}
