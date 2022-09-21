package test;

import beans.Cliente;
import connection.DBConnection;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
        listarCliente();
        //actualizarCliente(1085260661,"Dario Fernando","Alfaro Figueroa");
    }
    public static void actualizarCliente(Integer id_cliente, String nombres, String apellidos ) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE cliente SET nombres = " + "'" + nombres + "',apellidos = "
                + "'" + apellidos + "' WHERE id_cliente = " + id_cliente;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }
    public static void listarCliente(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM cliente";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                //El BigInteger se lo recibe como Decimal y se lo pasa a BinInteger
                BigDecimal id = rs.getBigDecimal("id_cliente");
                BigInteger id_cliente = (id == null ? null : id.toBigInteger());
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String direccion = rs.getString("direccion");
                String ciudad = rs.getString("ciudad");
                //El BigInteger se lo recibe como Decimal y se lo pasa a BinInteger
                BigDecimal tel = rs.getBigDecimal("telefono");
                BigInteger telefono = (tel == null ? null : tel.toBigInteger());
                
                String email = rs.getString ("email");
                String contrasena = rs.getString("contrasena");
                Date fecha_reg_cli = rs.getDate("fecha_reg_cli");
                Cliente clientes = new Cliente(id_cliente,nombres,apellidos,direccion,ciudad,telefono,email,contrasena,fecha_reg_cli);
                System.out.println(clientes.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }
}