/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Heinz
 */
public class Conexion {
    private Connection conexion;
    
    public Conexion(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String cadena = "jdbc:oracle:thin:@localhost:1521:XE";
            conexion = DriverManager.getConnection(cadena, "pgy2121", "duoc");
        } catch(Exception e){
            System.out.println("Error => " + e.getMessage());
        }
    }
    public Connection getConnection(){
        return conexion;

    }
}
