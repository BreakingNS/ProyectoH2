package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Producto;

public class ProductoDAOImpl implements ProductoDAO{

    private Connection connection = null;
    private String SENTENCIA_ELIMINAR_PRODUCTO = "DELETE FROM Productos.producto WHERE id = ?";
    private String SENTENCIA_OBTENER_PRODUCTO = "SELECT * FROM Productos.producto";
    
    public ProductoDAOImpl(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void eliminarProducto(int id) {
        
        try {
            PreparedStatement ps = connection.prepareStatement(SENTENCIA_ELIMINAR_PRODUCTO);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Producto> obtenerProducto() {
        
        List<Producto> listaProductos = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(SENTENCIA_OBTENER_PRODUCTO);
            ResultSet rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaProductos;
    }

    @Override
    public void crearProducto(Producto prod) {
        
    }

    @Override
    public void actualizarProducto(Producto prod) {
        
    }
    
}
