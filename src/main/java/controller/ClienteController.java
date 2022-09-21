package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;

import beans.Cliente;
import connection.DBConnection;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

public class ClienteController implements IClienteController {

    @Override
    public String login(BigInteger usuario, String contrasena) {
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        String sql = "Select * from cliente where id_cliente=" + usuario
                + " and contraseña ='" + contrasena + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String direccion = rs.getString("direccion");
                String ciudad = rs.getString("ciudad");
                //El BigInteger se lo recibe como Decimal y se lo pasa a BinInteger
                BigDecimal tel = rs.getBigDecimal("telefono");
                BigInteger telefono = (tel == null ? null : tel.toBigInteger());
                String email = rs.getString("email");
                Date fecha_reg_cli = rs.getDate("fecha_reg_cli");

                Cliente cliente = new Cliente(usuario, nombres, apellidos, direccion, ciudad, telefono, email, contrasena, fecha_reg_cli);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
        return "false";
    }
}
