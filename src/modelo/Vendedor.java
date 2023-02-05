/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Heinz
 */
public class Vendedor {
    private String rut;
    private String nombre_completo;
    private String direccion;
    private int telefono;
    private String correo;

    public Vendedor() {
    }

    public Vendedor(String rut, String nombre_completo, String direccion, int telefono, String correo) {
        this.rut = rut;
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
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

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "rut=" + rut + ", nombre_completo=" + nombre_completo + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
}
