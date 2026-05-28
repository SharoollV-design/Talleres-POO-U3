public class EtiquetaProducto {
    
    public void generarEtiqueta(Producto producto){

        System.out.println( " Etiquetaas ");
        
        System.out.println("Producto: " + producto.getNombre());

        System.out.println(" ");

        System.out.println("Precio: " + producto.getPrecio());
    }
}
