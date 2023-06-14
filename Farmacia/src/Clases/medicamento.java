package Clases;


public abstract class medicamento {
    
    private String codigo,nombre,fecha_fab,fecha_vencimiento;
    private boolean existe;

    public medicamento(String codigo, String nombre, String fecha_fab, String fecha_vencimiento, boolean existe) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha_fab = fecha_fab;
        this.fecha_vencimiento = fecha_vencimiento;
        this.existe = existe;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_fab() {
        return fecha_fab;
    }

    public void setFecha_fab(String fecha_fab) {
        this.fecha_fab = fecha_fab;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public boolean isExiste() {
        return existe;
    }
    
        public String isExisteString() {
            if (this.isExiste()) {
                return "Existe en estos momentos";
            }
        return "No existe en estos momentos";
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public boolean getExiste_fecha() {
        return true;
    }

    
    public abstract double precio_unitario();
    
}
