package beans;

import java.math.BigInteger;
import java.sql.Date;

public class Premio {
    private BigInteger id_premio;
    private String des_premio;
    private int can_puntos;
    private String foto_premio;
    private int cantidad;
    private int estado;
    private Date fecha_reg_pre;

    public Premio(BigInteger id_premio, String des_premio, int can_puntos, String foto_premio, int cantidad, int estado, Date fecha_reg_pre) {
        this.id_premio = id_premio;
        this.des_premio = des_premio;
        this.can_puntos = can_puntos;
        this.foto_premio = foto_premio;
        this.cantidad = cantidad;
        this.estado = estado;
        this.fecha_reg_pre = fecha_reg_pre;
    }

    public BigInteger getId_premio() {
        return id_premio;
    }

    public void setId_premio(BigInteger id_premio) {
        this.id_premio = id_premio;
    }

    public String getDes_premio() {
        return des_premio;
    }

    public void setDes_premio(String des_premio) {
        this.des_premio = des_premio;
    }

    public int getCan_puntos() {
        return can_puntos;
    }

    public void setCan_puntos(int can_puntos) {
        this.can_puntos = can_puntos;
    }

    public String getFoto_premio() {
        return foto_premio;
    }

    public void setFoto_premio(String foto_premio) {
        this.foto_premio = foto_premio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFecha_reg_pre() {
        return fecha_reg_pre;
    }

    public void setFecha_reg_pre(Date fecha_reg_pre) {
        this.fecha_reg_pre = fecha_reg_pre;
    }

    @Override
    public String toString() {
        return "Premio{" + "id_premio=" + id_premio + ", des_premio=" + des_premio 
                + ", can_puntos=" + can_puntos + ", foto_premio=" + foto_premio 
                + ", cantidad=" + cantidad + ", estado=" + estado + ", fecha_reg_pre=" 
                + fecha_reg_pre + '}';
    }

    
}
