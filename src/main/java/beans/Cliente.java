package beans;

import java.math.BigInteger;
import java.util.Date;

public class Cliente {
    private BigInteger id_cliente;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String ciudad;
    private BigInteger telefono;
    private String email;
    private String contrasena;
    private Date fecha_reg_cli;

    public Cliente(BigInteger id_cliente, String nombres, String apellidos, String direccion, String ciudad, BigInteger telefono, String email, String contrasena, Date fecha_reg_cli) {
        this.id_cliente = id_cliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.email = email;
        this.contrasena = contrasena;
        this.fecha_reg_cli = fecha_reg_cli;
    }

    public BigInteger getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(BigInteger id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha_reg_cli() {
        return fecha_reg_cli;
    }

    public void setFecha_reg_cli(Date fecha_reg_cli) {
        this.fecha_reg_cli = fecha_reg_cli;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombres=" + nombres 
                + ", apellidos=" + apellidos + ", direccion=" + direccion 
                + ", ciudad=" + ciudad + ", telefono=" + telefono + ", email=" 
                + email + ", contrasena=" + contrasena + ", fecha_reg_cli=" 
                + fecha_reg_cli + '}';
    }
}
