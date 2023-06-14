/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Camila
 */
public class Almacen {
    
  private int productosExistentes;
  public ArrayList< Producto > productos;
  private int cantRealProductos;
  
  public Almacen (){
  this.productosExistentes=0;
  productos=new ArrayList();
  cantRealProductos=0;
  }

    public int getProductosExistentes() {
        return productosExistentes;
    }

    public void setProductosExistentes(int productosExistentes) {
        this.productosExistentes = productosExistentes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getCantRealProductos() {
        return cantRealProductos;
    }

    public void setCantRealProductos(int cantRealProductos) {
        this.cantRealProductos = cantRealProductos;
    }
  
  
  
}
