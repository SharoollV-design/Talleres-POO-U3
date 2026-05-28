public class PruebaProducto {
     
    public static void main(String[] args) {
        
        Producto pr1 = new Producto("Termo", 60.000);

        System.out.println(" ");

        EtiquetaProducto etiqueta1 = new EtiquetaProducto();
        etiqueta1.generarEtiqueta(pr1);

        System.out.println(" ");

        CalcularPrecio precio1 = new CalcularPrecio();
        precio1.precioFinal(pr1);
        System.out.println("Precio final: " + precio1.precioFinal(pr1));
    }
}
