/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipos_y_mobiliarios;


public class equipos extends medio {
    private String tipo;
    private String marca;
    private String proveedor_usual;
    private String proveedores_posibles; 
    private int annos_garantia;

    public equipos(String tipo, String marca, String proveedor_usual, String proveedores_posibles, int annos_garantia, String tipo_de_medio, int numero_de_inventario, double costo_unitario, String estado) {
        super(tipo_de_medio, numero_de_inventario, costo_unitario, estado);
        this.tipo = tipo;
        this.marca = marca;
        this.proveedor_usual = proveedor_usual;
        this.proveedores_posibles = proveedores_posibles;
        this.annos_garantia = annos_garantia;
    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProveedor_usual() {
        return proveedor_usual;
    }

    public void setProveedor_usual(String proveedor_usual) {
        this.proveedor_usual = proveedor_usual;
    }

    public String getProveedores_posibles() {
        return proveedores_posibles;
    }

    public void setProveedores_posibles(String proveedores_posibles) {
        this.proveedores_posibles = proveedores_posibles;
    }

    public int getAnnos_garantia() {
        return annos_garantia;
    }

    public void setAnnos_garantia(int annos_garantia) {
        this.annos_garantia = annos_garantia;
    }

    @Override
    public double getCosto() {
        return this.annos_garantia * super.getCosto_unitario();
     }
    
    
    
    
}
