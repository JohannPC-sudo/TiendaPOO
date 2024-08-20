/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendapoo;

/**
 *
 * @JOHANN LOPEZ
 */
import java.util.ArrayList;


public class Tienda {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Producto> productos;

    // Constructor
    public Tienda(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = new ArrayList<>();
    }

    // Método para inicializar datos
    public void inicializarDatos() {
        Producto producto1 = new Producto(1, "Leche", "LACTEO", "2024-12-01", "Lecheria VACA", 100, 1.50);
        Producto producto2 = new Producto(2, "Carne", "CARNICO", "2024-08-20", "Carniceri" + ".a MISCARNES", 50, 5.00);
        Producto producto3 = new Producto(3, "Manzana", "FRUTA", "2024-09-15", "Frutera LOPEZ", 200, 0.75);
        Producto producto4 = new Producto(4, "Atun", "ENLATADO", "2025-01-01", "Conservas JOHANN", 150, 2.00);

        agregarProducto(producto1);
        agregarProducto(producto2);
        agregarProducto(producto3);
        agregarProducto(producto4);
    }

    // Métodos para agregar y mostrar productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
    
    

