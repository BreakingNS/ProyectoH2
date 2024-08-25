package DAO;

import java.util.List;
import logica.Producto;

public interface ProductoDAO {
    
    public void eliminarProducto(int id);
    public List<Producto> obtenerProducto();
    public void crearProducto(Producto prod);
    public void actualizarProducto(Producto prod);
    
    
}
