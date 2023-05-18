package modelo;

/**
 *
 * @author Héctor Sifuentes
 */
public class Cliente {
    //Atributos

    private int Id_Cliente;
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String direccion;
    private int estado;

    //Constructor vacio
    public Cliente() {
        this.Id_Cliente = 0;
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
        this.telefono = "";
        this.direccion = "";
        this.estado = 0;
    }

    //Constructor sobrecargado
    public Cliente(int Id_Cliente, String nombre, String apellido, String cedula, String telefono, String direccion, int estado) {
        this.Id_Cliente = Id_Cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }

    //Getter and setter
    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
