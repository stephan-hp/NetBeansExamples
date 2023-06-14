/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 */
public class ProductoExtranjero extends Producto{
    private String paisDeProcedencia;
    private double precioUSD;

    public ProductoExtranjero(String paisDeProcedencia, double precioUSD, String codigoQueLoIdentifica, String nombre, double precioDeCosto, boolean existenciaFisica) {
        super(codigoQueLoIdentifica, nombre, precioDeCosto, existenciaFisica);
        this.paisDeProcedencia = paisDeProcedencia;
        this.precioUSD = precioUSD;
    }

    @Override
    public double PrecioUnitario() 
    {
        return precioDeCosto+(0.05*precioDeCosto)+(27*precioUSD);
    }

    public String getPaisDeProcedencia() {
        return paisDeProcedencia;
    }

    public void setPaisDeProcedencia(String paisDeProcedencia) {
        this.paisDeProcedencia = paisDeProcedencia;
    }

    public double getPrecioUSD() {
        return precioUSD;
    }

    public void setPrecioUSD(double precioUSD) {
        this.precioUSD = precioUSD;
    }
    

}
