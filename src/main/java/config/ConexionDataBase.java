package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDataBase {
    public String Username = "sa";
    public String Password = "";
    public String Url = "jdbc:h2:~/test";
    public String Drive_DB = "org.h2.Driver";
    
    public Connection GetConexionDBH2() throws ClassNotFoundException{
        Connection connection = null;
        try {
            Class.forName(Drive_DB);
            connection = DriverManager.getConnection(Url, Username, Password);
            System.out.println("Conexion Exitosa!");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDataBase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en la conexion a la base de datos");
        }
        return connection;
    }
}
