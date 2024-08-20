/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendapoo;

/**
 *
 * @Johann Lopez
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private String tipo;
    private String fechaExpiracion;
    private String fabricante;
    private int cantidadInventario;
    private double precioUnitario;

    // Constructor
    public Producto(int codigo, String nombre, String tipo, String fechaExpiracion, String fabricante, int cantidadInventario, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
        this.fabricante = fabricante;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fechaExpiracion='" + fechaExpiracion + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", cantidadInventario=" + cantidadInventario +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
    

