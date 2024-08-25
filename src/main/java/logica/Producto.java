package logica;

public class Producto {
    
    private int id;
    private String nombre;
    private String Precio;

    public Producto() {
    }

    public Producto(int id, String nombre, String Precio) {
        this.id = id;
        this.nombre = nombre;
        this.Precio = Precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
    
    
}
