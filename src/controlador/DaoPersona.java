/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Producto;
import modelo.Vendedor;

/**
 *
 * @author Heinz
 */
public class DaoPersona {
    private Connection cone;

    public DaoPersona() {
        cone = new Conexion().getConnection();
    }

    public boolean grabar(Cliente cli) {
        try {
            String sql = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = cone.prepareCall(sql);
            pstm.setString(1, cli.getRut());
            pstm.setString(2, cli.getNombre_completo());
            pstm.setString(3, cli.getDireccion());
            pstm.setString(4, cli.getComuna());
            pstm.setInt(5,cli.getTelefono());
            pstm.setString(6,cli.getCorreo());
            int res = pstm.executeUpdate();
            return res > 0;
        } catch (Exception e) {
            System.out.println("Error agregar => " + e.getMessage());
            return false;
        }
    }
    public boolean grabar(Vendedor ven){
        try {
            String sql = "INSERT INTO vendedor VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstm = cone.prepareCall(sql);
            pstm.setString(1, ven.getRut());
            pstm.setString(2, ven.getNombre_completo());
            pstm.setString(3, ven.getDireccion());
            pstm.setInt(4,ven.getTelefono());
            pstm.setString(5,ven.getCorreo());
            int res = pstm.executeUpdate();
            return res > 0;
        } catch (Exception e) {
            System.out.println("Error agregar => " + e.getMessage());
            return false;
        }
    
    
    }
    public boolean grabar(Producto pro){
        try {
            String sql = "INSERT INTO producto VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstm = cone.prepareCall(sql);
            pstm.setInt(1, pro.getCodigo_producto());
            pstm.setString(2, pro.getNombre());
            pstm.setInt(3, pro.getCantidad());
            pstm.setInt(4,pro.getFecha_envasado());
            pstm.setInt(5,pro.getPrecio());
            int res = pstm.executeUpdate();
            return res > 0;
        } catch (Exception e) {
            System.out.println("Error agregar => " + e.getMessage());
            return false;
        }
    
    
    }
    public ArrayList<Cliente> listar() {
        try {
            ArrayList<Cliente> lista_personas;
            lista_personas = new ArrayList<>();
            ResultSet rs = cone.createStatement().executeQuery("SELECT * FROM cliente");
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setRut(rs.getString("rut"));
                cli.setNombre_completo(rs.getString("nombre_completo"));
                cli.setDireccion(rs.getString("Direccion"));
                cli.setComuna(rs.getString("comuna"));
                cli.setTelefono(rs.getInt("telefono"));
                cli.setCorreo(rs.getString("correo"));
                lista_personas.add(cli);
            }
            return lista_personas; 
        } catch (Exception e) {
            System.out.println("Error listar => " + e.getMessage());
            return null;
        }
    }
    public ArrayList<Vendedor> listar2() {
        try {
            ArrayList<Vendedor> lista_vendedor;
            lista_vendedor = new ArrayList<>();
            ResultSet rs = cone.createStatement().executeQuery("SELECT * FROM vendedor");
            while (rs.next()) {
                Vendedor ven = new Vendedor();
                ven.setRut(rs.getString("rut"));
                ven.setNombre_completo(rs.getString("nombre_completo"));
                ven.setDireccion(rs.getString("Direccion"));
                ven.setTelefono(rs.getInt("telefono"));
                ven.setCorreo(rs.getString("correo"));
                lista_vendedor.add(ven);
            }
            return lista_vendedor; 
        } catch (Exception e) {
            System.out.println("Error listar => " + e.getMessage());
            return null;
        }
    }
    public ArrayList<Producto> listar3() {
        try {
            ArrayList<Producto> lista_producto;
            lista_producto = new ArrayList<>();
            ResultSet rs = cone.createStatement().executeQuery("SELECT * FROM producto");
            while (rs.next()) {
                Producto pro = new Producto();
                pro.setCodigo_producto(rs.getInt("codigo_producto"));
                pro.setNombre(rs.getString("nombre"));
                pro.setCantidad(rs.getInt("cantidad"));
                pro.setFecha_envasado(rs.getInt("fecha_envasado"));
                pro.setPrecio(rs.getInt("precio"));
                lista_producto.add(pro);
            }
            return lista_producto; 
        } catch (Exception e) {
            System.out.println("Error listar => " + e.getMessage());
            return null;
        }
    }
    public Cliente buscar(String rut) {
        try {
            Cliente cli = null;
            ResultSet rs = cone.createStatement().executeQuery("SELECT * FROM cliente WHERE rut ="+ rut);
            while (rs.next()) {
                cli = new Cliente();
                cli.setRut(rs.getString("rut"));
                System.out.println(rs.getString("rut"));
                cli.setNombre_completo(rs.getString("nombre_completo"));
                cli.setDireccion(rs.getString("direccion"));
                cli.setComuna(rs.getString("comuna"));
                cli.setTelefono(rs.getInt("telefono"));
                cli.setCorreo(rs.getString("correo"));
            }
            return cli;
        } catch (Exception e) {
            System.out.println("Error buscar => " + e.getMessage());
            return null;
        }
    }
    public Vendedor buscar2(String rut) {
        try {
            Vendedor ven = null;
            ResultSet rs = cone.createStatement().executeQuery("SELECT * FROM vendedor WHERE rut ="+ rut);
            while (rs.next()) {
                ven = new Vendedor();
                ven.setRut(rs.getString("rut"));
                System.out.println(rs.getString("rut"));
                ven.setNombre_completo(rs.getString("nombre_completo"));
                ven.setDireccion(rs.getString("direccion"));
                ven.setTelefono(rs.getInt("telefono"));
                ven.setCorreo(rs.getString("correo"));
            }
            return ven;
        } catch (Exception e) {
            System.out.println("Error buscar => " + e.getMessage());
            return null;
        }
    }
    public boolean eliminar(String rut) {
        try {
            String sql = "DELETE FROM cliente WHERE rut = ?";
            PreparedStatement pstm = cone.prepareCall(sql);
            pstm.setString(1, rut);
            int respuesta = pstm.executeUpdate();
            return respuesta > 0;
        } catch (Exception e){
            System.out.println("Error eliminar => " + e.getMessage());
            return false;
        }
    }
    public boolean eliminar2(String rut) {
        try {
            String sql = "DELETE FROM vendedor WHERE rut = ?";
            PreparedStatement pstm = cone.prepareCall(sql);
            pstm.setString(1, rut);
            int respuesta = pstm.executeUpdate();
            return respuesta > 0;
        } catch (Exception e){
            System.out.println("Error eliminar => " + e.getMessage());
            return false;
        }
    }
}

