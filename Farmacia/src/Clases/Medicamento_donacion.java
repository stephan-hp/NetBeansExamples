package Clases;

import java.io.Serializable;

public class Medicamento_donacion extends medicamento {
    private String pais_que_dona,fecha_donacion;

    public Medicamento_donacion(String pais_que_dona, String fecha_donacion, String codigo,
            String nombre, String fecha_fab, String fecha_vencimiento, boolean existe) {
       
        super(codigo, nombre, fecha_fab, fecha_vencimiento, existe);
        this.pais_que_dona = pais_que_dona;
        this.fecha_donacion = fecha_donacion;
    }

    public String getPais_que_dona() {
        return pais_que_dona;
    }

    public void setPais_que_dona(String pais_que_dona) {
        this.pais_que_dona = pais_que_dona;
    }

    public String getFecha_donacion() {
        return fecha_donacion;
    }

    public void setFecha_donacion(String fecha_donacion) {
        this.fecha_donacion = fecha_donacion;
    }

    public double precio_unitario() {
    return 0;  
    }
    
}
