/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Kissel
 */
public class Producto {
    protected String codigoQueLoIdentifica;
    protected String nombre;
    protected double precioDeCosto;
    protected boolean existenciaFisica;

    public Producto(String codigoQueLoIdentifica, String nombre, double precioDeCosto, boolean existenciaFisica) {
        this.codigoQueLoIdentifica = codigoQueLoIdentifica;
        this.nombre = nombre;
        this.precioDeCosto = precioDeCosto;
        this.existenciaFisica = existenciaFisica;
    }
    
    public double PrecioUnitario()
    {
    return PrecioUnitario();
    }

    public void setCodigoQueLoIdentifica(String codigoQueLoIdentifica) {
        this.codigoQueLoIdentifica = codigoQueLoIdentifica;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioDeCosto(double precioDeCosto) {
        this.precioDeCosto = precioDeCosto;
    }

    public void setExistenciaFisica(boolean existenciaFisica) {
        this.existenciaFisica = existenciaFisica;
    }

    public String getCodigoQueLoIdentifica() {
        return codigoQueLoIdentifica;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioDeCosto() {
        return precioDeCosto;
    }

    public boolean isExistenciaFisica() {
        return existenciaFisica;
    }
    
    
    
}
