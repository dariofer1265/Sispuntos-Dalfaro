package beans;

import java.math.BigInteger;
import java.sql.Date;

public class Puntos {
    private BigInteger id_puntos;
    private BigInteger id_cliente;
    private int valor_compra;
    private int puntos;
    private Date fecha_compra;

    public Puntos(BigInteger id_puntos, BigInteger id_cliente, int valor_compra, int puntos, Date fecha_compra) {
        this.id_puntos = id_puntos;
        this.id_cliente = id_cliente;
        this.valor_compra = valor_compra;
        this.puntos = puntos;
        this.fecha_compra = fecha_compra;
    }

    public BigInteger getId_puntos() {
        return id_puntos;
    }

    public void setId_puntos(BigInteger id_puntos) {
        this.id_puntos = id_puntos;
    }

    public BigInteger getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(BigInteger id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(int valor_compra) {
        this.valor_compra = valor_compra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    @Override
    public String toString() {
        return "Puntos{" + "id_puntos=" + id_puntos + ", id_cliente=" + id_cliente + ", valor_compra=" + valor_compra + ", puntos=" + puntos + ", fecha_compra=" + fecha_compra + '}';
    }
   
    
}
