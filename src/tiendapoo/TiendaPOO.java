/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendapoo;

/**
 *
 * @Johann Lopez
 */
public class TiendaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear una tienda
        Tienda tienda = new Tienda("Supermercado ABC", "Calle Falsa 123", "555-1234");

        // Inicializar datos de la tienda
        tienda.inicializarDatos();

        // Mostrar productos
        tienda.mostrarProductos();
    }
}
        
    
    

