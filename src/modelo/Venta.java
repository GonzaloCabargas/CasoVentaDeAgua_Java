/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Heinz
 */
public class Venta {
    private String rut_cliente;
    private String rut_vendedor;
    private int codigo_producto;
    private int fecha_venta;

    public Venta() {
    }

    public Venta(String rut_cliente, String rut_vendedor, int codigo_producto, int fecha_venta) {
        this.rut_cliente = rut_cliente;
        this.rut_vendedor = rut_vendedor;
        this.codigo_producto = codigo_producto;
        this.fecha_venta = fecha_venta;
    }

    public String getRut_cliente() {
        return rut_cliente;
    }

    public String getRut_vendedor() {
        return rut_vendedor;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public int getFecha_venta() {
        return fecha_venta;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public void setRut_vendedor(String rut_vendedor) {
        this.rut_vendedor = rut_vendedor;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public void setFecha_venta(int fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    @Override
    public String toString() {
        return "Venta{" + "rut_cliente=" + rut_cliente + ", rut_vendedor=" + rut_vendedor + ", codigo_producto=" + codigo_producto + ", fecha_venta=" + fecha_venta + '}';
    }
    
    
}
