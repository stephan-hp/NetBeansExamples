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
public class Supermercado {
    
   public ArrayList<Almacen> almacenes;
   
   public Supermercado (){
   almacenes = new ArrayList();
   } 

    public ArrayList<Almacen> getAlmacenes() {
        return almacenes;
    }

    public void setAlmacenes(ArrayList<Almacen> almacenes) {
        this.almacenes = almacenes;
    }
   
   
   
}
