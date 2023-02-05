/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Heinz
 */
public class Cliente {
    private String rut;
    private String nombre_completo;
    private String direccion;
    private String comuna;
    private int telefono;
    private String correo;

    public Cliente() {
    }

    public Cliente(String rut, String nombre_completo, String direccion, String comuna, int telefono, String correo) {
        this.rut = rut;
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre_completo=" + nombre_completo + ", direccion=" + direccion + ", comuna=" + comuna + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
}
