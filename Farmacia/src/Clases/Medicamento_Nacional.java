package Clases;



public class Medicamento_Nacional extends medicamento {
    private String Nombre_empresa;
    private double costo_produccion;

    public Medicamento_Nacional(String Nombre_empresa, double costo_produccion, String codigo,
            String nombre, String fecha_fab, String fecha_vencimiento, boolean existe) {
        super(codigo, nombre, fecha_fab, fecha_vencimiento, existe);
        this.Nombre_empresa = Nombre_empresa;
        this.costo_produccion = costo_produccion;
    }

    public String getNombre_empresa() {
        return Nombre_empresa;
    }

    public void setNombre_empresa(String Nombre_empresa) {
        this.Nombre_empresa = Nombre_empresa;
    }

    public double getCosto_produccion() {
        return costo_produccion;
    }

    public void setCosto_produccion(double costo_produccion) {
        this.costo_produccion = costo_produccion;
    }

    @Override
    public double precio_unitario() {
      return this.costo_produccion + this.costo_produccion*0.06;
    }
    
    
    
    
}