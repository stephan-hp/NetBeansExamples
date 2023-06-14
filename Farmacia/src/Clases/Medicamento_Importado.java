package Clases;

public class Medicamento_Importado extends medicamento {
    private String Compannia_que_comercializa;
    private double Precio_USD;

    public Medicamento_Importado(String Compannia_que_comercializa, double Precio_USD, String codigo,
            String nombre, String fecha_fab, String fecha_vencimiento, boolean existe) {
        super(codigo, nombre, fecha_fab, fecha_vencimiento, existe);
        this.Compannia_que_comercializa = Compannia_que_comercializa;
        this.Precio_USD = Precio_USD;
    }

    public String getCompannia_que_comercializa() {
        return Compannia_que_comercializa;
    }

    public void setCompannia_que_comercializa(String Compannia_que_comercializa) {
        this.Compannia_que_comercializa = Compannia_que_comercializa;
    }

    public double getPrecio_USD() {
        return Precio_USD;
    }

    public void setPrecio_USD(double Precio_USD) {
        this.Precio_USD = Precio_USD;
    }

    @Override
    public double precio_unitario() {
        return this.Precio_USD + this.Precio_USD*0.03 + (25 * this.Precio_USD);
    
    }
    
    
    
    
}
