package beans;

import java.math.BigInteger;
import java.sql.Date;

public class Redencion {
    private BigInteger id_redencion;
    private BigInteger id_cliente;
    private BigInteger id_premio;
    private int puntos_usados;
    private Date fecha_redencion;

    public Redencion(BigInteger id_redencion, BigInteger id_cliente, BigInteger id_premio, int puntos_usados, Date fecha_redencion) {
        this.id_redencion = id_redencion;
        this.id_cliente = id_cliente;
        this.id_premio = id_premio;
        this.puntos_usados = puntos_usados;
        this.fecha_redencion = fecha_redencion;
    }

    public BigInteger getId_redencion() {
        return id_redencion;
    }

    public void setId_redencion(BigInteger id_redencion) {
        this.id_redencion = id_redencion;
    }

    public BigInteger getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(BigInteger id_cliente) {
        this.id_cliente = id_cliente;
    }

    public BigInteger getId_premio() {
        return id_premio;
    }

    public void setId_premio(BigInteger id_premio) {
        this.id_premio = id_premio;
    }

    public int getPuntos_usados() {
        return puntos_usados;
    }

    public void setPuntos_usados(int puntos_usados) {
        this.puntos_usados = puntos_usados;
    }

    public Date getFecha_redencion() {
        return fecha_redencion;
    }

    public void setFecha_redencion(Date fecha_redencion) {
        this.fecha_redencion = fecha_redencion;
    }

    @Override
    public String toString() {
        return "Redencion{" + "id_redencion=" + id_redencion + ", id_cliente=" 
                + id_cliente + ", id_premio=" + id_premio + ", puntos_usados=" 
                + puntos_usados + ", fecha_redencion=" + fecha_redencion + '}';
    }

   
}
