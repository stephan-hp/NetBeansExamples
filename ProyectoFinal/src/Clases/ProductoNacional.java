/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Camila
 */
public class ProductoNacional extends Producto{
    private String nombreDeLaEmpresa;

    public ProductoNacional(String nombreDeLaEmpresa, String codigoQueLoIdentifica, String nombre, double precioDeCosto, boolean existenciaFisica) {
        super(codigoQueLoIdentifica, nombre, precioDeCosto, existenciaFisica);
        this.nombreDeLaEmpresa = nombreDeLaEmpresa;
    }

    @Override
    public double PrecioUnitario() 
    {
        return precioDeCosto*(0.05*precioDeCosto);
    }

    public String getNombreDeLaEmpresa() {
        return nombreDeLaEmpresa;
    }
    
    
}
