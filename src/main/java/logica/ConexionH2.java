package logica;

import config.ConexionDataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionH2 {
    public static void main(String[] args) throws ClassNotFoundException {
        
        ConexionDataBase conexionDataBase = new ConexionDataBase();
        
        conexionDataBase.GetConexionDBH2();
        
    }
}
