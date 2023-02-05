/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Heinz
 */
public class Producto {
    private int codigo_producto;
    private String nombre;
    private int cantidad;
    private int fecha_envasado;
    private int precio;

    public Producto() {
    }

    public Producto(int codigo_producto, String nombre, int cantidad, int fecha_envasado, int precio) {
        this.codigo_producto = codigo_producto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fecha_envasado = fecha_envasado;
        this.precio = precio;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getFecha_envasado() {
        return fecha_envasado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha_envasado(int fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo_producto=" + codigo_producto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", fecha_envasado=" + fecha_envasado + ", precio=" + precio + '}';
    }
    
    
}
