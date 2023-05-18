package modelo;

/**
 *
 * @author Héctor Sifuentes
 */
public class CabeceraVenta {
    
    //atributos
    private int Id_cabecera_venta;
    private int Id_Cliente;
    private double valorPagar;
    private String fechaVenta;
    private int estado;
    
    //constructor vacio
    public CabeceraVenta(){
        this.Id_cabecera_venta = 0;
        this.Id_Cliente = 0;
        this.valorPagar = 0.0;
        this.fechaVenta = "";
        this.estado = 0;
    }
    
    //constructor sobrecargado
    public CabeceraVenta(int Id_cabecera_venta, int Id_Cliente, double valorPagar, String fechaVenta, int estado) {
        this.Id_cabecera_venta = Id_cabecera_venta;
        this.Id_Cliente = Id_Cliente;
        this.valorPagar = valorPagar;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }
    
    //getter and setter
    public int getId_cabecera_venta() {
        return Id_cabecera_venta;
    }

    public void setId_cabecera_venta(int Id_cabecera_venta) {
        this.Id_cabecera_venta = Id_cabecera_venta;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    //toString
    @Override
    public String toString() {
        return "CabeceraVenta{" + "Id_cabecera_venta=" + Id_cabecera_venta + ", Id_Cliente=" + Id_Cliente + ", valorPagar=" + valorPagar + ", fechaVenta=" + fechaVenta + ", estado=" + estado + '}';
    }
    
}
